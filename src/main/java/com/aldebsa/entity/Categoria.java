package com.aldebsa.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCategoria")
    private int idcategoria;

    @Column(name = "Descripcion")
    private String descripcion;
    
    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    private List<Producto> listaProducto;

	
    // Getters y setters
    
    
    
}