package com.techandsolve.retojava.RetoJavaTechAndSolve.dto;

import java.io.Serializable;

public class InformacionEjecucionDTO implements Serializable {

    private static final long serialVersionUID = -5190353571719264934L;

    private Long cedula;
    private DiasTrabajandoDTO diasTrabajandoDTO;

    public Long getcedula() {
        return cedula;
    }

    public void setcedula(Long cedula) {
        this.cedula = cedula;
    }

    public DiasTrabajandoDTO getDiasTrabajandoDTO() {
        return diasTrabajandoDTO;
    }

    public void setDiasTrabajandoDTO(DiasTrabajandoDTO diasTrabajandoDTO) {
        this.diasTrabajandoDTO = diasTrabajandoDTO;
    }
}
