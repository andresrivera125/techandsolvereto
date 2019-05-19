package com.techandsolve.retojava.RetoJavaTechAndSolve.service;

import com.techandsolve.retojava.RetoJavaTechAndSolve.dto.ViajeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeServiceImpl implements ViajeService {

    @Override
    public int maximizarViaje(ViajeDTO viajeDTO) {
        ViajeDTO newViajeDTO = viajeDTO.clone();

        int totalViajes = 0;

        while(!newViajeDTO.getPesos().isEmpty()){
            if(realizarViaje(newViajeDTO)){
                totalViajes++;
            }
        }

        return totalViajes;
    }

    public boolean realizarViaje(ViajeDTO viajeDTO){
        List<Integer> listaPesos = viajeDTO.getPesos();
        Integer maximo = viajeDTO.maximo();
        int k = hallarK(maximo) - 1;
        int indice = listaPesos.indexOf(maximo);
        int i;
        listaPesos.remove(indice);

        for(i = 0; !listaPesos.isEmpty() && i < k; i++){
            indice = listaPesos.indexOf(viajeDTO.minimo());
            listaPesos.remove(indice);
        }

        if(i<k){
            return false;
        }

        return true;
    }

    public int hallarK(Integer max){
        double maximo = (double) max.intValue();
        double minimoPeso = 50.0;

        if(maximo > 0) {
            int k = (int) Math.ceil(minimoPeso / maximo);
            return k;
        }

        return 0;
    }
}
