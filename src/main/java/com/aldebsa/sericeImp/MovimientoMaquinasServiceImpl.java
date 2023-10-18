package com.aldebsa.sericeImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aldebsa.entity.MovimientoMaquinas;
import com.aldebsa.repositorio.MovimientoMaquinasRepository;
import com.aldebsa.service.MovimientoMaquinasService;

@Service
public class MovimientoMaquinasServiceImpl implements MovimientoMaquinasService {
    @Autowired
    private MovimientoMaquinasRepository movimientoMaquinasRepository;

    @Override
    public List<MovimientoMaquinas> obtenerTodosLosMovimientos() {
        return movimientoMaquinasRepository.findAll();
    }

    @Override
    public MovimientoMaquinas obtenerMovimientoPorId(int id) {
        return movimientoMaquinasRepository.findById(id).orElse(null);
    }

    @Override
    public MovimientoMaquinas crearMovimiento(MovimientoMaquinas movimiento) {
        return movimientoMaquinasRepository.save(movimiento);
    }

    @Override
    public MovimientoMaquinas actualizarMovimiento(MovimientoMaquinas movimiento) {
        // Puedes agregar lógica adicional si es necesario antes de guardar
        return movimientoMaquinasRepository.save(movimiento);
    }

    @Override
    public void eliminarMovimiento(int id) {
        movimientoMaquinasRepository.deleteById(id);
    }
}

