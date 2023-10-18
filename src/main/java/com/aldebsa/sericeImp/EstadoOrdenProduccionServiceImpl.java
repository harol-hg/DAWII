package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.EstadoOrdenProduccion;
import com.aldebsa.repositorio.EstadoOrdenProduccionRepository;
import com.aldebsa.service.EstadoOrdenProduccionService;

@Service
public class EstadoOrdenProduccionServiceImpl implements EstadoOrdenProduccionService {
    @Autowired
    private EstadoOrdenProduccionRepository estadoOrdenProduccionRepository;

    @Override
    public List<EstadoOrdenProduccion> obtenerTodosLosEstadosOrdenProduccion() {
        return estadoOrdenProduccionRepository.findAll();
    }

    @Override
    public EstadoOrdenProduccion obtenerEstadoOrdenProduccionPorId(int id) {
        return estadoOrdenProduccionRepository.findById(id).orElse(null);
    }

    @Override
    public EstadoOrdenProduccion crearEstadoOrdenProduccion(EstadoOrdenProduccion estadoOrdenProduccion) {
        return estadoOrdenProduccionRepository.save(estadoOrdenProduccion);
    }

    @Override
    public EstadoOrdenProduccion actualizarEstadoOrdenProduccion(EstadoOrdenProduccion estadoOrdenProduccion) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return estadoOrdenProduccionRepository.save(estadoOrdenProduccion);
    }

    @Override
    public void eliminarEstadoOrdenProduccion(int id) {
        estadoOrdenProduccionRepository.deleteById(id);
    }
}

