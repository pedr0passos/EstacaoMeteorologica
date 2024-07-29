/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Catterina Salvador
 */
public class Clima {
    private LocalDate data;
    private Double temperatura;
    private Double umidade;
    private Double pressao;

    public Clima(LocalDate data, Double temperatura, Double umidade, Double pressao) {
        this.data = data;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Double getUmidade() {
        return umidade;
    }

    public Double getPressao() {
        return pressao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    public void setPressao(Double pressao) {
        this.pressao = pressao;
    }
    
    
}
