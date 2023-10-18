package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.InsumoTipo;

@Repository
public interface InsumoTipoRepository extends JpaRepository<InsumoTipo, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad InsumoTipo si es necesario
}
