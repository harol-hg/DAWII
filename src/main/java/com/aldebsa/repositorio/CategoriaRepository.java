package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Cargo si es necesario
}