package com.aldebsa.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCliente")
    private int idCliente;

    @Column(name = "RUC")
    private String ruc;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "Direccion")
    private String direccion;
    
    @OneToMany(mappedBy = "cliente")
    private List<OrdenProduccion> ordenesProduccion;

    // Getters y setters
}

