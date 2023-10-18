package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.OrdenProduccion;
import com.aldebsa.repositorio.OrdenProduccionRepository;
import com.aldebsa.service.OrdenProduccionService;

@Service
public class OrdenProduccionServiceImpl implements OrdenProduccionService {
    @Autowired
    private OrdenProduccionRepository ordenProduccionRepository;

    @Override
    public List<OrdenProduccion> obtenerTodasLasOrdenesProduccion() {
        return ordenProduccionRepository.findAll();
    }

    @Override
    public OrdenProduccion obtenerOrdenProduccionPorId(int id) {
        return ordenProduccionRepository.findById(id).orElse(null);
    }

    @Override
    public OrdenProduccion crearOrdenProduccion(OrdenProduccion ordenProduccion) {
        return ordenProduccionRepository.save(ordenProduccion);
    }

    @Override
    public OrdenProduccion actualizarOrdenProduccion(OrdenProduccion ordenProduccion) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return ordenProduccionRepository.save(ordenProduccion);
    }

    @Override
    public void eliminarOrdenProduccion(int id) {
        ordenProduccionRepository.deleteById(id);
    }
}
