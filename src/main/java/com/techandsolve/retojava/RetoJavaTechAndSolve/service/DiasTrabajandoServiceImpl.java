package com.techandsolve.retojava.RetoJavaTechAndSolve.service;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.AnswerDiasTrabajandoDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.DiasTrabajandoDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.InformacionEjecucionDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.ViajeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiasTrabajandoServiceImpl implements DiasTrabajandoService {

    @Autowired
    ViajeService viajeService;

    @Override
    public AnswerDiasTrabajandoDTO procesarEjecucion(InformacionEjecucionDTO informacionEjecucionDTO) {
        AnswerDiasTrabajandoDTO answer = new AnswerDiasTrabajandoDTO();

        DiasTrabajandoDTO diasTrabajandoDTO = informacionEjecucionDTO.getDiasTrabajandoDTO();

        for (ViajeDTO viajeDTO : diasTrabajandoDTO.getListaViajes()) {
            answer.add(viajeService.maximizarViaje(viajeDTO));
        }

        return answer;
    }
}
