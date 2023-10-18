package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Empleado si es necesario
}