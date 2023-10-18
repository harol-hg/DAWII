package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.DetalleOrdenProduccion;

public interface DetalleOrdenProduccionService {
    List<DetalleOrdenProduccion> obtenerTodosLosDetallesOrdenProduccion();

    DetalleOrdenProduccion obtenerDetalleOrdenProduccionPorId(Integer id);

    DetalleOrdenProduccion crearDetalleOrdenProduccion(DetalleOrdenProduccion detalleOrdenProduccion);

    DetalleOrdenProduccion actualizarDetalleOrdenProduccion(DetalleOrdenProduccion detalleOrdenProduccion);

    void eliminarDetalleOrdenProduccion(Integer id);
}

