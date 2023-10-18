package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.DetalleOrdenProduccion;

@Repository
public interface DetalleOrdenProduccionRepository extends JpaRepository<DetalleOrdenProduccion, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad DetalleOrdenProduccion si es necesario
}
