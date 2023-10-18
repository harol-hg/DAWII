package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.InsumoTipo;

public interface InsumoTipoService {
    List<InsumoTipo> obtenerTodosLosInsumosTipos();
    InsumoTipo obtenerInsumoTipoPorId(int id);
    InsumoTipo crearInsumoTipo(InsumoTipo insumoTipo);
    InsumoTipo actualizarInsumoTipo(InsumoTipo insumoTipo);
    void eliminarInsumoTipo(int id);
}
