package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.InsumosUtilizados;

public interface InsumosUtilizadosService {
    List<InsumosUtilizados> obtenerTodosLosInsumosUtilizados();
    InsumosUtilizados obtenerInsumosUtilizadosPorId(int id);
    InsumosUtilizados crearInsumosUtilizados(InsumosUtilizados insumosUtilizados);
    InsumosUtilizados actualizarInsumosUtilizados(InsumosUtilizados insumosUtilizados);
    void eliminarInsumosUtilizados(int id);
}
