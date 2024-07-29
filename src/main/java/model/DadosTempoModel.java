/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Catterina Salvador
 */
public class DadosTempoModel {
    private Clima dados;

    public DadosTempoModel(Clima dados) {
        this.dados = dados;
    }

    public Clima getDados() {
        return dados;
    }

    public void setDados(Clima dados) {
        this.dados = dados;
    }
    
}
