package com.aldebsa.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MovimientoMaquinas")
public class MovimientoMaquinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDMovimiento")
    private int idMovimiento;

    @ManyToOne
    @JoinColumn(name = "IDOpProduccion")
    private OrdenProduccion ordenProduccion;

    @ManyToOne
    @JoinColumn(name = "IDMaquina")
    private Maquinaria maquina;

    @Column(name = "FechaMovimiento")
    private Date fechaMovimiento;

    @Column(name = "TipoMovimiento")
    private String tipoMovimiento;

    @Column(name = "CantidadProcesada")
    private int cantidadProcesada;

    @Column(name = "HoraInicio")
    private Date horaInicio;

    @Column(name = "HoraFin")
    private Date horaFin;

    @ManyToOne
    @JoinColumn(name = "IDEmpleado")
    private Empleado empleado;
    
    @OneToMany(mappedBy = "movimientoMaquinas")
    private List<InsumosUtilizados> insumosUtilizados;

    // Getters y setters
}
