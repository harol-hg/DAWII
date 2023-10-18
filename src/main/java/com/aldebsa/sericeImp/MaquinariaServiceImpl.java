package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.Maquinaria;
import com.aldebsa.repositorio.MaquinariaRepository;
import com.aldebsa.service.MaquinariaService;

@Service
public class MaquinariaServiceImpl implements MaquinariaService {
    @Autowired
    private MaquinariaRepository maquinariaRepository;

    @Override
    public List<Maquinaria> obtenerTodasLasMaquinarias() {
        return maquinariaRepository.findAll();
    }

    @Override
    public Maquinaria obtenerMaquinariaPorId(int id) {
        return maquinariaRepository.findById(id).orElse(null);
    }

    @Override
    public Maquinaria crearMaquinaria(Maquinaria maquinaria) {
        return maquinariaRepository.save(maquinaria);
    }

    @Override
    public Maquinaria actualizarMaquinaria(Maquinaria maquinaria) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return maquinariaRepository.save(maquinaria);
    }

    @Override
    public void eliminarMaquinaria(int id) {
        maquinariaRepository.deleteById(id);
    }
}
