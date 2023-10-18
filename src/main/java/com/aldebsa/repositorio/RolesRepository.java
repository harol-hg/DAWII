package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Roless;

@Repository
public interface RolesRepository extends JpaRepository<Roless, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Roles si es necesario
}