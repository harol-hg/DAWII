package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.Categoria;
import com.aldebsa.repositorio.CategoriaRepository;
import com.aldebsa.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria obtenerCategoriaPorId(int id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(int id) {
        categoriaRepository.deleteById(id);
    }
}
