package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pedro Henrique Passos Rocha
 * @author Catterina Salvador
 */

public class ClimaModel {
    
    private final List<Clima> climaList = new ArrayList<>();
    
    public void addClima(Clima clima) {
        climaList.add(clima);
    }
    
    public void removeClima(int index) {
        climaList.remove(index);
    }
    
    public List<Clima> getClimaList() {
        return climaList;
    }
}
