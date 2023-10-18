package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.MovimientoMaquinas;

@Repository
public interface MovimientoMaquinasRepository extends JpaRepository<MovimientoMaquinas, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad MovimientoMaquinas si es necesario
}
