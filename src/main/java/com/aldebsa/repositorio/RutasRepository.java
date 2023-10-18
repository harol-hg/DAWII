package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Rutas;

@Repository
public interface RutasRepository extends JpaRepository<Rutas, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Rutas si es necesario
}
