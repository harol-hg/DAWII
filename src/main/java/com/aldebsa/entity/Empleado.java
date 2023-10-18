package com.aldebsa.entity;

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
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEmpleado")
    private int idEmpleado;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Puesto")
    private String puesto;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "DNI")
    private String dni;

    @ManyToOne
    @JoinColumn(name = "IDCargo")
    private Cargo cargo;
    
    @OneToMany(mappedBy = "empleado")
    private List<MovimientoMaquinas> movimientosMaquinas;
    
    @OneToMany(mappedBy = "empleado")
    private List<OrdenProduccion> lista;

    // Getters y setters
}
