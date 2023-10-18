package com.aldebsa.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "InsumosUtilizados")
public class InsumosUtilizados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDInsumo")
    private int idInsumo;

    @ManyToOne
    @JoinColumn(name = "idMovimiento")
    private MovimientoMaquinas movimientoMaquinas;

    @ManyToOne
    @JoinColumn(name = "IDMaquina")
    private Maquinaria maquina;

    @ManyToOne
    @JoinColumn(name = "IDInsumoTipo")
    private InsumoTipo insumoTipo;

    @Column(name = "CantidadUtilizada")
    private BigDecimal cantidadUtilizada;

    @Column(name = "FechaUtilizacion")
    private Date fechaUtilizacion;

    @Column(name = "Observaciones")
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "IDEmpleado")
    private Empleado empleado;

    // Getters y setters
}

