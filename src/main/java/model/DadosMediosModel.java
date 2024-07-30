/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Catterina Salvador
 */
public class DadosMediosModel {
    private Double temperaturaMedia;
    private Double umidadeMedia;
    private Double pressaoMedia;
    private Long numeroRegistros;

    public DadosMediosModel(Double temperaturaMedia, Double umidadeMedia, Double pressaoMedia, Long numeroRegistros) {
        this.temperaturaMedia = temperaturaMedia;
        this.umidadeMedia = umidadeMedia;
        this.pressaoMedia = pressaoMedia;
        this.numeroRegistros = numeroRegistros;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public Double getUmidadeMedia() {
        return umidadeMedia;
    }

    public Double getPressaoMedia() {
        return pressaoMedia;
    }

    public Long getNumeroRegistros() {
        return numeroRegistros;
    }

    public void setTemperaturaMedia(Double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public void setUmidadeMedia(Double umidadeMedia) {
        this.umidadeMedia = umidadeMedia;
    }

    public void setPressaoMedia(Double pressaoMedia) {
        this.pressaoMedia = pressaoMedia;
    }

    public void setNumeroRegistros(Long numeroRegistros) {
        this.numeroRegistros = numeroRegistros;
    }
    
    private void getMedias(List<Clima> registros){
        var somaTemperaturas = 0; 
        var somaPressoes = 0;
        var somaUmidades = 0;
        
        for(Clima registro: registros){
            somaTemperaturas += registro.getTemperatura();
            somaUmidades += registro.getUmidade();
            somaPressoes += registro.getPressao();
        }
        setTemperaturaMedia((somaTemperaturas / (double)registros.size()));
        setPressaoMedia((somaPressoes / (double)registros.size()));
        setUmidadeMedia((somaUmidades / (double)registros.size()));
        setNumeroRegistros((long)registros.size());
        
    }
}
