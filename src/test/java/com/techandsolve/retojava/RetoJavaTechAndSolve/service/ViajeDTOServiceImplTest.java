package com.techandsolve.retojava.RetoJavaTechAndSolve.service;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.ViajeDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ViajeDTOServiceImplTest {

    private ViajeDTO viajeDTO;
    private int esperado;
    private int k;
    private int primerViaje;
    ViajeServiceImpl viajeService = new ViajeServiceImpl();

    @Parameterized.Parameters
    public static Iterable<Object[]> getParametros(){
        Integer[] i1 = {30, 30, 1, 1};
        ArrayList<Integer> p1 = new ArrayList<>(asList(i1));
        int n1 = 4;
        int e1 = 2;
        int k1 = 2;
        int primerViaje1 = 2;

        Integer[] i2 = {20, 20, 20};
        ArrayList<Integer> p2 = new ArrayList<>(asList(i2));
        int n2 = 3;
        int e2 = 1;
        int k2 = 3;
        int primerViaje2 = 0;

        Integer[] i3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayList<Integer> p3 = new ArrayList<>(asList(i3));
        int n3 = 11;
        int e3 = 2;
        int k3 = 5;
        int primerViaje3 = 6;

        Integer[] i4 = {9, 19, 29, 39, 49, 59};
        ArrayList<Integer> p4 = new ArrayList<>(asList(i4));
        int n4 = 6;
        int e4 = 3;
        int k4 = 1;
        int primerViaje4 = 5;

        Integer[] i5 = {32, 56, 76, 8, 44, 60, 47, 85, 71, 91};
        ArrayList<Integer> p5 = new ArrayList<>(asList(i5));
        int n5 = 10;
        int e5 = 8;
        int k5 = 1;
        int primerViaje5 = 9;

        return asList(new Object[][] {
                {new ViajeDTO(n1, p1), e1, k1, primerViaje1}
                ,{new ViajeDTO(n2, p2), e2, k2, primerViaje2}
                ,{new ViajeDTO(n3, p3), e3, k3, primerViaje3}
                ,{new ViajeDTO(n4, p4), e4, k4, primerViaje4}
                ,{new ViajeDTO(n5, p5), e5, k5, primerViaje5}
        });
    }

    public ViajeDTOServiceImplTest(ViajeDTO viajeDTO, int esperado, int k, int primerViaje){
        this.viajeDTO = viajeDTO;
        this.esperado = esperado;
        this.k = k;
        this.primerViaje = primerViaje;
    }

    @Test
    public void maximizarViaje() {
        int maxViajes = viajeService.maximizarViaje(this.viajeDTO);
        assertEquals(this.esperado, maxViajes);
    }

    @Test
    public void hallarK(){
        int hallado = viajeService.hallarK(this.viajeDTO.maximo());
        assertEquals(this.k, hallado);
    }

    @Test
    public void realizarViaje(){
        ViajeDTO newViajeDTO = this.viajeDTO.clone();
        viajeService.realizarViaje(newViajeDTO);
        assertEquals(this.primerViaje, newViajeDTO.getPesos().size());
    }
}