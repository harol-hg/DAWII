package com.aldebsa.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Maquinaria")
public class Maquinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDMaquina")
    private int idMaquina;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Estado")
    private String estado;

    @OneToMany(mappedBy = "maquina")
    private List<MovimientoMaquinas> listamv;
    // Getters y setters
}
