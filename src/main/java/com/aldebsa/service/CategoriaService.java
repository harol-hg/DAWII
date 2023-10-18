package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.Categoria;

public interface CategoriaService {
    List<Categoria> obtenerTodasLasCategorias();
    Categoria obtenerCategoriaPorId(int id);
    Categoria crearCategoria(Categoria categoria);
    Categoria actualizarCategoria(Categoria categoria);
    void eliminarCategoria(int id);
}
