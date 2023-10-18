package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.UnidadNegocio;
import com.aldebsa.repositorio.UnidadNegocioRepository;
import com.aldebsa.service.UnidadNegocioService;

@Service
public class UnidadNegocioServiceImpl implements UnidadNegocioService {
    private final UnidadNegocioRepository unidadNegocioRepository;

    @Autowired
    public UnidadNegocioServiceImpl(UnidadNegocioRepository unidadNegocioRepository) {
        this.unidadNegocioRepository = unidadNegocioRepository;
    }

    @Override
    public List<UnidadNegocio> obtenerTodasLasUnidadesNegocio() {
        return unidadNegocioRepository.findAll();
    }

    @Override
    public UnidadNegocio obtenerUnidadNegocioPorId(Integer id) {
        return unidadNegocioRepository.findById(id).orElse(null);
    }

    @Override
    public UnidadNegocio crearUnidadNegocio(UnidadNegocio unidadNegocio) {
        return unidadNegocioRepository.save(unidadNegocio);
    }

    @Override
    public UnidadNegocio actualizarUnidadNegocio(UnidadNegocio unidadNegocio) {
        return unidadNegocioRepository.save(unidadNegocio);
    }

    @Override
    public void eliminarUnidadNegocio(Integer id) {
        unidadNegocioRepository.deleteById(id);
    }
}
