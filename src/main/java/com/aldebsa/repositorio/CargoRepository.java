package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Cargo si es necesario
}
