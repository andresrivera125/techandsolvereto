package com.techandsolve.retojava.RetoJavaTechAndSolve.dto;

import java.io.Serializable;

public class InformacionEjecucionDTO implements Serializable {

    private static final long serialVersionUID = -5190353571719264934L;

    Long identificacion;
    DiasTrabajandoDTO diasTrabajandoDTO;

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public DiasTrabajandoDTO getDiasTrabajandoDTO() {
        return diasTrabajandoDTO;
    }

    public void setDiasTrabajandoDTO(DiasTrabajandoDTO diasTrabajandoDTO) {
        this.diasTrabajandoDTO = diasTrabajandoDTO;
    }
}
