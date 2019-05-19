package com.techandsolve.retojava.RetoJavaTechAndSolve.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ViajeDTO implements Serializable {

    private static final long serialVersionUID = -8427204960637139599L;

    private int N;
    private List<Integer> pesos;

    public ViajeDTO() {
        super();
    }

    public ViajeDTO(int n, List<Integer> pesos) {
        this.setN(n);
        this.setPesos(pesos);
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        if(n >= 1 && n <= 100)
            N = n;
    }

    public List<Integer> getPesos() {
        return pesos;
    }

    public void setPesos(List<Integer> pesos) {
        if(Objects.nonNull(pesos)){
            this.pesos = ((ArrayList<Integer>)pesos).stream().filter(e -> (e >= 1 && e <= 100)).collect(Collectors.toCollection(ArrayList :: new));
        }
    }

    public Integer maximo(){
        if(Objects.isNull(this.pesos)){
            return 0;
        }

        return ((ArrayList<Integer>) this.pesos).stream().max( Comparator.naturalOrder() ).get();
    }

    public Integer minimo(){
        if(Objects.isNull(this.pesos)){
            return 0;
        }

        return ((ArrayList<Integer>) this.pesos).stream().min( Comparator.naturalOrder() ).get();
    }

    @Override
    public ViajeDTO clone(){
        ViajeDTO newViajeDTO = new ViajeDTO(this.getN(), this.getPesos());

        return newViajeDTO;
    }
}
