package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.EstadoOrdenProduccion;

@Repository
public interface EstadoOrdenProduccionRepository extends JpaRepository<EstadoOrdenProduccion, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad EstadoOrdenProduccion si es necesario
}