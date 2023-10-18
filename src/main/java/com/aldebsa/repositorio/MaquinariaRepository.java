package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Maquinaria;

@Repository
public interface MaquinariaRepository extends JpaRepository<Maquinaria, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Maquinaria si es necesario
}
