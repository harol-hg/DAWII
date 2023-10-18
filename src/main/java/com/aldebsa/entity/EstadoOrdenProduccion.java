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
@Getter
@Setter
@Entity
@Table(name = "EstadoOrdenProduccion")
public class EstadoOrdenProduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEstado")
    private int idEstado;

    @Column(name = "NombreEstado")
    private String nombreEstado;

    @OneToMany(mappedBy = "estado")
    private List<OrdenProduccion> ordenesProduccion;
}
