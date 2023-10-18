package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.Maquinaria;

public interface MaquinariaService {
    List<Maquinaria> obtenerTodasLasMaquinarias();
    Maquinaria obtenerMaquinariaPorId(int id);
    Maquinaria crearMaquinaria(Maquinaria maquinaria);
    Maquinaria actualizarMaquinaria(Maquinaria maquinaria);
    void eliminarMaquinaria(int id);
}
