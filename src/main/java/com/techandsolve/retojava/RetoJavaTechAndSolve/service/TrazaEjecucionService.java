package com.techandsolve.retojava.RetoJavaTechAndSolve.service;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.TrazaEjecucionDTO;

import java.util.List;

public interface TrazaEjecucionService {

    List<TrazaEjecucionDTO> findAll();

    Long insert(TrazaEjecucionDTO trazaEjecucionDTO);
}
