package com.techandsolve.retojava.RetoJavaTechAndSolve.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnswerDiasTrabajandoDTO implements Serializable {

    private static final long serialVersionUID = -2497334019532340573L;

    private List<String> respuestas;
    private static final String formatoRespuesta = "Case #%d: %d";

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

    public void add(int resultado){
        if(Objects.isNull(this.respuestas)){
            this.respuestas = new ArrayList<>();
        }

        String respuesta = String.format(formatoRespuesta, this.respuestas.size() + 1, resultado);
        this.respuestas.add(respuesta);
    }
}
