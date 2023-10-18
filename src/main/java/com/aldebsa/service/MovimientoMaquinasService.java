package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.MovimientoMaquinas;

public interface MovimientoMaquinasService {
    List<MovimientoMaquinas> obtenerTodosLosMovimientos();
    MovimientoMaquinas obtenerMovimientoPorId(int id);
    MovimientoMaquinas crearMovimiento(MovimientoMaquinas movimiento);
    MovimientoMaquinas actualizarMovimiento(MovimientoMaquinas movimiento);
    void eliminarMovimiento(int id);
}

