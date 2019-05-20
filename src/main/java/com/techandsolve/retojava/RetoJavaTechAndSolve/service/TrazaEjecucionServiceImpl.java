package com.techandsolve.retojava.RetoJavaTechAndSolve.service;

import com.techandsolve.retojava.RetoJavaTechAndSolve.Repository.TrazaEjecucionRepository;
import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.TrazaEjecucionDTO;
import com.techandsolve.retojava.RetoJavaTechAndSolve.model.TrazaEjecucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrazaEjecucionServiceImpl implements TrazaEjecucionService {

    @Autowired
    private TrazaEjecucionRepository trazaEjecucionRepository;

    @Override
    public List<TrazaEjecucionDTO> findAll() {
        List<TrazaEjecucionDTO> trazaEjecucionDTO;
        try {
            trazaEjecucionDTO = ((ArrayList<TrazaEjecucion>) trazaEjecucionRepository.findAll())
                    .stream()
                    .map(traza -> new TrazaEjecucionDTO(traza.getCedula(), traza.getFechaEjecucion()))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch(NullPointerException e){
            trazaEjecucionDTO = new ArrayList<>();
        }

        return trazaEjecucionDTO;
    }

    @Override
    public Long insert(TrazaEjecucionDTO trazaEjecucionDTO) {
        TrazaEjecucion trazaEjecucion = new TrazaEjecucion();
        trazaEjecucion.setCedula(trazaEjecucionDTO.getCedula());
        trazaEjecucion.setFechaEjecucion(LocalDateTime.now());

        trazaEjecucion = trazaEjecucionRepository.save(trazaEjecucion);
        return trazaEjecucion.getId();
    }
}
