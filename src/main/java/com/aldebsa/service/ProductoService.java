package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.Producto;

public interface ProductoService {
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(int  id);
    Producto crearProducto(Producto producto);
    Producto actualizarProducto(Producto producto);
    void eliminarProducto(int id);
}