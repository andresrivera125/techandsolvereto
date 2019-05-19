package com.techandsolve.retojava.RetoJavaTechAndSolve.controller;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.AnswerDiasTrabajandoDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.InformacionEjecucionDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.service.DiasTrabajandoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/techandsolve/api/diastrabajando")
public class DiasTrabajandoController {

    @Autowired
    DiasTrabajandoService diasTrabajandoService;

    @GetMapping("/version")
    public String getVersion() {
        final String s = "Version 1.0.1";
        return s;
    }

    @PostMapping("/procesar")
    public AnswerDiasTrabajandoDTO procesarEjecucion(@RequestBody InformacionEjecucionDTO informacionEjecucionDTO){
        return diasTrabajandoService.procesarEjecucion(informacionEjecucionDTO);
    }
}
