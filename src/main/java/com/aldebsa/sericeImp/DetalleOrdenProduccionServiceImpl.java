package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.DetalleOrdenProduccion;
import com.aldebsa.repositorio.DetalleOrdenProduccionRepository;
import com.aldebsa.service.DetalleOrdenProduccionService;

@Service
public class DetalleOrdenProduccionServiceImpl implements DetalleOrdenProduccionService {
    private final DetalleOrdenProduccionRepository detalleOrdenProduccionRepository;

    @Autowired
    public DetalleOrdenProduccionServiceImpl(DetalleOrdenProduccionRepository detalleOrdenProduccionRepository) {
        this.detalleOrdenProduccionRepository = detalleOrdenProduccionRepository;
    }

    @Override
    public List<DetalleOrdenProduccion> obtenerTodosLosDetallesOrdenProduccion() {
        return detalleOrdenProduccionRepository.findAll();
    }

    @Override
    public DetalleOrdenProduccion obtenerDetalleOrdenProduccionPorId(Integer id) {
        return detalleOrdenProduccionRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleOrdenProduccion crearDetalleOrdenProduccion(DetalleOrdenProduccion detalleOrdenProduccion) {
        return detalleOrdenProduccionRepository.save(detalleOrdenProduccion);
    }

    @Override
    public DetalleOrdenProduccion actualizarDetalleOrdenProduccion(DetalleOrdenProduccion detalleOrdenProduccion) {
        return detalleOrdenProduccionRepository.save(detalleOrdenProduccion);
    }

    @Override
    public void eliminarDetalleOrdenProduccion(Integer id) {
        detalleOrdenProduccionRepository.deleteById(id);
    }
}