package com.aldebsa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aldebsa.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Puedes agregar métodos personalizados relacionados con la entidad Producto si es necesario
}
