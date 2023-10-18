package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.Cliente;
import com.aldebsa.repositorio.ClienteRepository;
import com.aldebsa.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(int id) {
        clienteRepository.deleteById(id);
    }
}