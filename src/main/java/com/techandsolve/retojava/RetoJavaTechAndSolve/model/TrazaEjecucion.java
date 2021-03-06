package com.techandsolve.retojava.RetoJavaTechAndSolve.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TrazaEjecucion {

    @Id
    @GeneratedValue
    private Long id;

    private Long cedula;

    private LocalDateTime fechaEjecucion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
