package com.aldebsa.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Roles")
public class Roless {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDRol")
    private int idRol;

    @Column(name = "NombreRol")
    private String nombreRol;

    @ManyToMany
    @JoinTable(
        name = "RutasPorRol",
        joinColumns = @JoinColumn(name = "IDRol"),
        inverseJoinColumns = @JoinColumn(name = "IDRuta")
    )
    private Set<Rutas> rutas;
}