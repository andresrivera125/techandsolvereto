package com.techandsolve.retojava.RetoJavaTechAndSolve.model;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.ViajeDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ViajeDTOTest {

    private ViajeDTO viajeDTO;
    private Integer maximo;
    private Integer minimo;

    @Parameterized.Parameters
    public static Iterable<Object[]> getParametros(){
        ArrayList<Integer> p1 = new ArrayList<>();
        p1.add(30);
        p1.add(30);
        p1.add(1);
        p1.add(1);
        int n1 = 4;

        ArrayList<Integer> p2 = new ArrayList<>();
        p2.add(20);
        p2.add(20);
        p2.add(20);
        int n2 = 3;

        return asList(new Object[][] {
                {new ViajeDTO(n1, p1), 30, 1},
                {new ViajeDTO(n2, p2), 20, 20}
        });
    }

    public ViajeDTOTest(ViajeDTO viajeDTO, Integer maximo, Integer minimo){
        this.viajeDTO = viajeDTO;
        this.maximo = maximo;
        this.minimo = minimo;
    }

    @Test
    public void maximoTest(){
        assertEquals(this.maximo, this.viajeDTO.maximo());
    }

    @Test
    public void minimoTest(){
        assertEquals(this.minimo, this.viajeDTO.minimo());
    }
}