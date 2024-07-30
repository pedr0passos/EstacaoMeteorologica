/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Catterina Salvador
 */
public class MaxMinModel {
    private Double temperaturaMax;
    private Double temperaturaMin;
    private Double umidadeMax;
    private Double umidadeMin;
    private Double pressaoMax;
    private Double pressaoMin;

    public MaxMinModel(Double temperaturaMax, Double temperaturaMin, Double umidadeMax, Double umidadeMin, Double pressaoMax, Double pressaoaMin) {
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.umidadeMax = umidadeMax;
        this.umidadeMin = umidadeMin;
        this.pressaoMax = pressaoMax;
        this.pressaoMin = pressaoMin;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public Double getUmidadeMax() {
        return umidadeMax;
    }

    public Double getUmidadeMin() {
        return umidadeMin;
    }

    public Double getPressaoMax() {
        return pressaoMax;
    }

    public Double getPressaoaMin() {
        return pressaoMin;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public void setUmidadeMax(Double umidadeMax) {
        this.umidadeMax = umidadeMax;
    }

    public void setUmidadeMin(Double umidadeMin) {
        this.umidadeMin = umidadeMin;
    }

    public void setPressaoMax(Double pressaoMax) {
        this.pressaoMax = pressaoMax;
    }

    public void setPressaoMin(Double pressaoaMin) {
        this.pressaoMin = pressaoaMin;
    }
    
    private void getMaxMin(List<Clima> registros){
        var temperaturas = registros.stream().map(registro -> registro.getTemperatura()).collect(Collectors.toList());
        setTemperaturaMax(Collections.max(temperaturas));
        setTemperaturaMin(Collections.min(temperaturas));
        
        var umidades = registros.stream().map(registro -> registro.getUmidade()).collect(Collectors.toList());
        setUmidadeMax(Collections.max(umidades));
        setUmidadeMin(Collections.min(umidades));
        
        var pressoes = registros.stream().map(registro -> registro.getPressao()).collect(Collectors.toList());
        setPressaoMax(Collections.max(pressoes));
        setPressaoMin(Collections.min(pressoes));
    }
    
    
}
