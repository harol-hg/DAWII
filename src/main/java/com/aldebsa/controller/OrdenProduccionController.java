package com.aldebsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aldebsa.dto.DetalleOrdenProduccionDTO;
import com.aldebsa.dto.OrdenProduccionDTO;
import com.aldebsa.entity.DetalleOrdenProduccion;
import com.aldebsa.entity.OrdenProduccion;
import com.aldebsa.repositorio.DetalleOrdenProduccionRepository;
import com.aldebsa.service.ClienteService;
import com.aldebsa.service.DetalleOrdenProduccionService;
import com.aldebsa.service.EmpleadoService;
import com.aldebsa.service.EstadoOrdenProduccionService;
import com.aldebsa.service.OrdenProduccionService;
import com.aldebsa.service.ProductoService;
import com.aldebsa.service.UnidadNegocioService;

@RestController
@RequestMapping("/ordenesproduccion")
public class OrdenProduccionController {

    private final OrdenProduccionService ordenProduccionService;
    
    @Autowired
    private ClienteService clienteService;
    
    @Autowired
    private EstadoOrdenProduccionService estadoService;
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @Autowired
    private ProductoService productoService;

    @Autowired
    private DetalleOrdenProduccionService detalleOrdenProduccionService;
  
    @Autowired
    private UnidadNegocioService unidadNegocioService;
    @Autowired
    public OrdenProduccionController(OrdenProduccionService ordenProduccionService) {
        this.ordenProduccionService = ordenProduccionService;
    }

    // Endpoint para obtener todas las órdenes de producción
    @GetMapping
    public ResponseEntity<List<OrdenProduccion>> obtenerTodasLasOrdenesProduccion() {
        List<OrdenProduccion> ordenesProduccion = ordenProduccionService.obtenerTodasLasOrdenesProduccion();
        return new ResponseEntity<>(ordenesProduccion, HttpStatus.OK);
    }

    // Endpoint para obtener una orden de producción por su ID
    @GetMapping("/{id}")
    public ResponseEntity<OrdenProduccion> obtenerOrdenProduccionPorId(@PathVariable int id) {
        OrdenProduccion ordenProduccion = ordenProduccionService.obtenerOrdenProduccionPorId(id);
        if (ordenProduccion != null) {
            return new ResponseEntity<>(ordenProduccion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para crear una nueva orden de producción
    @PostMapping
    public ResponseEntity<String> crearOrdenProduccion(@Validated @RequestBody OrdenProduccionDTO ordenProduccionDTO) {
    	
    	try {
            // Crear una nueva instancia de OrdenProduccion y asignar los valores desde ordenProduccionDTO
            OrdenProduccion ordenProduccion = new OrdenProduccion();
            ordenProduccion.setNumeroOrdenProduccion(ordenProduccionDTO.getNumeroOrdenProduccion());
            ordenProduccion.setFechaEntrega(ordenProduccionDTO.getFechaEntrega());
            ordenProduccion.setDireccionEnvio(ordenProduccionDTO.getDireccionEnvio());
            ordenProduccion.setFechaPago(ordenProduccionDTO.getFechaPago());
            ordenProduccion.setFechaRegistro(ordenProduccionDTO.getFechaRegistro());
            // Obtener y asignar las entidades Cliente, Estado, UnidadNegocio y Empleado
            ordenProduccion.setCliente(clienteService.obtenerClientePorId(ordenProduccionDTO.getClienteId()));
            ordenProduccion.setEstado(estadoService.obtenerEstadoOrdenProduccionPorId(ordenProduccionDTO.getEstadoId()));
            ordenProduccion.setUnidadNegocio(unidadNegocioService.obtenerUnidadNegocioPorId(ordenProduccionDTO.getUnidadNegocioId()));
            ordenProduccion.setEmpleado(empleadoService.obtenerEmpleadoPorId(ordenProduccionDTO.getEmpleadoId()));

            // Guardar la Orden de Producción
            OrdenProduccion nuevaOrden = ordenProduccionService.crearOrdenProduccion(ordenProduccion);

            // Mapear y guardar los detalles de la Orden de Producción
            for (DetalleOrdenProduccionDTO detalleDTO : ordenProduccionDTO.getDetallesOrdenProduccion()) {
                DetalleOrdenProduccion detalle = new DetalleOrdenProduccion();
                detalle.setProducto(productoService.obtenerProductoPorId(detalleDTO.getProductoId()));
                detalle.setCantidadProducida(detalleDTO.getCantidadProducida());
                detalle.setOrdenProduccion(nuevaOrden);
                detalleOrdenProduccionService.crearDetalleOrdenProduccion(detalle);
            }

            return ResponseEntity.ok("Orden de Producción creada con éxito. ID: " + nuevaOrden.getIdOpProduccion());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al crear la Orden de Producción: " + e.getMessage());
        }
    }
    	
    
    @PutMapping("/{id}")
    public ResponseEntity<OrdenProduccion> actualizarOrdenProduccion( @RequestBody OrdenProduccion ordenProduccion) {

    	
        OrdenProduccion ordenActualizada = ordenProduccionService.actualizarOrdenProduccion( ordenProduccion);
        if (ordenActualizada != null) {
            return new ResponseEntity<>(ordenActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para eliminar una orden de producción por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarOrdenProduccion(@PathVariable int id) {
       ordenProduccionService.eliminarOrdenProduccion(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
