package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.UnidadNegocio;

public interface UnidadNegocioService {
    List<UnidadNegocio> obtenerTodasLasUnidadesNegocio();

    UnidadNegocio obtenerUnidadNegocioPorId(Integer id);

    UnidadNegocio crearUnidadNegocio(UnidadNegocio unidadNegocio);

    UnidadNegocio actualizarUnidadNegocio(UnidadNegocio unidadNegocio);

    void eliminarUnidadNegocio(Integer id);
}
