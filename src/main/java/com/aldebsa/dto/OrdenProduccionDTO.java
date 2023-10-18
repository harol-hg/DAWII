package com.aldebsa.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class OrdenProduccionDTO {
    private String numeroOrdenProduccion;
    private Date fechaEntrega;
    private String direccionEnvio;
    private Date fechaPago;
    private Date fechaRegistro;
    private int clienteId;
    private int estadoId;
    private int unidadNegocioId;
    private int empleadoId;
    private List<DetalleOrdenProduccionDTO> detallesOrdenProduccion;

    // Getters y setters
}
