package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.EstadoOrdenProduccion;

public interface EstadoOrdenProduccionService {
    List<EstadoOrdenProduccion> obtenerTodosLosEstadosOrdenProduccion();
    EstadoOrdenProduccion obtenerEstadoOrdenProduccionPorId(int id);
    EstadoOrdenProduccion crearEstadoOrdenProduccion(EstadoOrdenProduccion estadoOrdenProduccion);
    EstadoOrdenProduccion actualizarEstadoOrdenProduccion(EstadoOrdenProduccion estadoOrdenProduccion);
    void eliminarEstadoOrdenProduccion(int id);
}