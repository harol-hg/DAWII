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
@Table(name = "tb_cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCargo")
    private int idCargo;

    @Column(name = "NombreCargo")
    private String nombreCargo;
    
    @OneToMany(mappedBy = "cargo")
    private List<Empleado>listaEmpelado;

    // Getters y setters
}
