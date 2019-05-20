package com.techandsolve.retojava.RetoJavaTechAndSolve.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TrazaEjecucionDTO implements Serializable {

    private static final long serialVersionUID = 1513014725557775515L;

    private Long cedula;
    private LocalDateTime fechaEjecucion;

    public TrazaEjecucionDTO() {
    }

    public TrazaEjecucionDTO(Long cedula, LocalDateTime fechaEjecucion) {
        this.cedula = cedula;
        this.fechaEjecucion = fechaEjecucion;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public LocalDateTime getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(LocalDateTime fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }
}
