package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.OrdenProduccion;

public interface OrdenProduccionService {
    List<OrdenProduccion> obtenerTodasLasOrdenesProduccion();
    OrdenProduccion obtenerOrdenProduccionPorId(int id);
    OrdenProduccion crearOrdenProduccion(OrdenProduccion ordenProduccion);
    OrdenProduccion actualizarOrdenProduccion(OrdenProduccion ordenProduccion);
    void eliminarOrdenProduccion(int id);
}