package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.OrdenProduccion;

@Repository
public interface OrdenProduccionRepository extends JpaRepository<OrdenProduccion, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad OrdenProduccion si es necesario
}
