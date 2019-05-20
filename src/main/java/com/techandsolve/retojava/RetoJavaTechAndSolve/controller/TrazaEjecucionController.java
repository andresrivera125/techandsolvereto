package com.techandsolve.retojava.RetoJavaTechAndSolve.controller;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.TrazaEjecucionDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.service.TrazaEjecucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/techandsolve/api/trazaejecucion")
public class TrazaEjecucionController {

    @Autowired
    TrazaEjecucionService trazaEjecucionService;

    @GetMapping
    public List<TrazaEjecucionDTO> consultar(){
        return trazaEjecucionService.findAll();
    }

    @PostMapping
    public Long ingresar(@RequestBody TrazaEjecucionDTO traza){
        return trazaEjecucionService.insert(traza);
    }
}
