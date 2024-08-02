package model;

import java.util.ArrayList;
import java.util.List;
import log.Log;

/**
 * @author Pedro Henrique Passos Rocha
 * @author Catterina Salvador
 */

public class ClimaModel {
    
    private final List<Clima> climaList = new ArrayList<>();
    private String logSelecionado;
    
    public ClimaModel () {
        logSelecionado = "Json";
    }
    
    public void addClima(Clima clima) {
        climaList.add(clima);
    }
    
    public void removeClima(int index) {
        climaList.remove(index);
    }
    
    public void setLog(String logSelecionado) {
        this.logSelecionado = logSelecionado;
    }
    
    public String getLogSelecionado() {
        return logSelecionado;
    }
    
    public List<Clima> getClimaList() {
        return climaList;
    }
}
