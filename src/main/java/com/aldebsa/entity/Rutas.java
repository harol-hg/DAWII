package com.aldebsa.entity;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Rutas")
public class Rutas {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "IDRuta")
	    private int idRuta;

	    @Column(name = "URL")
	    private String url;

	    @Column(name = "Descripcion")
	    private String descripcion;

	    @ManyToMany(mappedBy = "rutas")
	    private Set<Roless> roles;
	    
}

