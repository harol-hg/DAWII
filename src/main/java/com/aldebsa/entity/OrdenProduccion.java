package com.aldebsa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "tb_orden_produccion")
public class OrdenProduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oproduccion")
    private int idOpProduccion;

    

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    @Column(name = "direccion_de_envio")
    private String direccionEnvio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_pago")
    private Date fechaPago;

    @Column(name = "numero_orden_produccion")
    private String numeroOrdenProduccion;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="IDEmpleado")
    private Empleado empleado;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IDCliente")
    private Cliente cliente;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IDEstado")
    private EstadoOrdenProduccion estado;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IDUnidadNegocio")
    private UnidadNegocio unidadNegocio;
    
   
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name="IDDetalle")
    @OneToMany( fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<DetalleOrdenProduccion> detallesOrdenProduccion = new ArrayList<>();
    
  
    @OneToMany(mappedBy = "ordenProduccion")
    private List<MovimientoMaquinas> movimientosMaquinas;

    // Getters y setters
}