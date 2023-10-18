package com.aldebsa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DetalleOrdenProduccion")
public class DetalleOrdenProduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDetalle")
    private int idDetalle;
    
    
    

    
	  @ManyToOne
	  @JoinColumn(name = "id_oproduccion")
	 private OrdenProduccion ordenProduccion;

    @ManyToOne
    @JoinColumn(name = "IDProducto")
    private Producto producto;

    @Column(name = "CantidadProducida")
    private double cantidadProducida;

    @Column(name = "OrdenProduccion")//numero de orden de la op
    private int secOdenProduccion;

    // Getters y setters
}

