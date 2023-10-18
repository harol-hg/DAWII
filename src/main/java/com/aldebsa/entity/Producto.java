package com.aldebsa.entity;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDProducto")
    private int idproducto;

    
    @Column(name = "CodProducto")
    private String codproducto;

    @Column(name = "Descripcion")
    private String descripcion;
	
	@ManyToOne
    @JoinColumn(name = "IDCategoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "IDUnidadMedida")
    private UnidadMedida unidadmedida;

    @JsonIgnore
    @OneToMany(mappedBy = "producto")
    private List<DetalleOrdenProduccion> listaDetalle;

   
    
}
