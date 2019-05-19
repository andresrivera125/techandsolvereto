package com.techandsolve.retojava.RetoJavaTechAndSolve.service;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.AnswerDiasTrabajandoDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.InformacionEjecucionDTO;

public interface DiasTrabajandoService {

    public AnswerDiasTrabajandoDTO procesarEjecucion(InformacionEjecucionDTO informacionEjecucionDTO);
}
