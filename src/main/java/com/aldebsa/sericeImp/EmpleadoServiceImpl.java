package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.Empleado;
import com.aldebsa.repositorio.EmpleadoRepository;
import com.aldebsa.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado obtenerEmpleadoPorId(int id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado actualizarEmpleado(Empleado empleado) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return empleadoRepository.save(empleado);
    }

    @Override
    public void eliminarEmpleado(int id) {
        empleadoRepository.deleteById(id);
    }
}

