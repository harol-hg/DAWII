package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.Producto;
import com.aldebsa.repositorio.ProductoRepository;
import com.aldebsa.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        // Aquí puedes agregar lógica adicional si es necesario antes de guardar
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productoRepository.deleteById(id);
    }


}
