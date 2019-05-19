package com.techandsolve.retojava.RetoJavaTechAndSolve.dto;

import java.io.Serializable;
import java.util.List;

public class DiasTrabajandoDTO implements Serializable {

    private static final long serialVersionUID = -998011586823702312L;

    // T contiene la cantidad de dias de trabajo en el archivo
    int T;
    List<ViajeDTO> listaViajes;

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public List<ViajeDTO> getListaViajes() {
        return listaViajes;
    }

    public void setListaViajes(List<ViajeDTO> listaViajes) {
        this.listaViajes = listaViajes;
    }
}
