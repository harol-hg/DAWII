package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.InsumosUtilizados;

@Repository
public interface InsumosUtilizadosRepository extends JpaRepository<InsumosUtilizados, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad InsumosUtilizados si es necesario
}