package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.InsumosUtilizados;
import com.aldebsa.repositorio.InsumosUtilizadosRepository;
import com.aldebsa.service.InsumosUtilizadosService;

@Service
public class InsumosUtilizadosServiceImpl implements InsumosUtilizadosService {
    @Autowired
    private InsumosUtilizadosRepository insumosUtilizadosRepository;

    @Override
    public List<InsumosUtilizados> obtenerTodosLosInsumosUtilizados() {
        return insumosUtilizadosRepository.findAll();
    }

    @Override
    public InsumosUtilizados obtenerInsumosUtilizadosPorId(int id) {
        return insumosUtilizadosRepository.findById(id).orElse(null);
    }

    @Override
    public InsumosUtilizados crearInsumosUtilizados(InsumosUtilizados insumosUtilizados) {
        return insumosUtilizadosRepository.save(insumosUtilizados);
    }

    @Override
    public InsumosUtilizados actualizarInsumosUtilizados(InsumosUtilizados insumosUtilizados) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return insumosUtilizadosRepository.save(insumosUtilizados);
    }

    @Override
    public void eliminarInsumosUtilizados(int id) {
        insumosUtilizadosRepository.deleteById(id);
    }
}
