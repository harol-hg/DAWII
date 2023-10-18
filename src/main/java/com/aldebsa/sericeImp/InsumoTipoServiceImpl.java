package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.InsumoTipo;
import com.aldebsa.repositorio.InsumoTipoRepository;
import com.aldebsa.service.InsumoTipoService;

@Service
public class InsumoTipoServiceImpl implements InsumoTipoService {
    @Autowired
    private InsumoTipoRepository insumoTipoRepository;

    @Override
    public List<InsumoTipo> obtenerTodosLosInsumosTipos() {
        return insumoTipoRepository.findAll();
    }

    @Override
    public InsumoTipo obtenerInsumoTipoPorId(int id) {
        return insumoTipoRepository.findById(id).orElse(null);
    }

    @Override
    public InsumoTipo crearInsumoTipo(InsumoTipo insumoTipo) {
        return insumoTipoRepository.save(insumoTipo);
    }

    @Override
    public InsumoTipo actualizarInsumoTipo(InsumoTipo insumoTipo) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return insumoTipoRepository.save(insumoTipo);
    }

    @Override
    public void eliminarInsumoTipo(int id) {
        insumoTipoRepository.deleteById(id);
    }
}
