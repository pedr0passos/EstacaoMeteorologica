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
public class RegistrosModel {
    private List<Clima> registrosList;

    public RegistrosModel(List<Clima> registrosList) {
        this.registrosList = registrosList;
    }

    public List<Clima> getRegistrosList() {
        return registrosList;
    }
    
    public void addRegistro(Clima registro){
        this.registrosList.add(registro);
    }
}
