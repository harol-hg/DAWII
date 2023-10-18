package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.UnidadNegocio;

@Repository
public interface UnidadNegocioRepository extends JpaRepository<UnidadNegocio, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad UnidadNegocio si es necesario
}