package com.aldebsa.service;

import java.util.List;

import com.aldebsa.entity.Cliente;

public interface ClienteService {
    List<Cliente> obtenerTodosLosClientes();
    Cliente obtenerClientePorId(int id);
    Cliente crearCliente(Cliente cliente);
    Cliente actualizarCliente(Cliente cliente);
    void eliminarCliente(int id);
}
