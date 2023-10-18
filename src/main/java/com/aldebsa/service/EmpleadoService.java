package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.Empleado;

public interface EmpleadoService {
    List<Empleado> obtenerTodosLosEmpleados();
    Empleado obtenerEmpleadoPorId(int id);
    Empleado crearEmpleado(Empleado empleado);
    Empleado actualizarEmpleado(Empleado empleado);
    void eliminarEmpleado(int id);
}