package model;

import java.util.ArrayList;
import java.util.List;
import observer.Observable;
import observer.Observer;

/**
 * @author Pedro Henrique Passos Rocha
 * @author Catterina Salvador
 */

public class ClimaModel implements Observer {
    
    private List<Clima> climaList = new ArrayList<>();
    
    public void addClima(Clima clima) {
        climaList.add(clima);
        System.out.println(getClimaList().toString());
    }
    
    public void removeClima(Clima clima) {
        climaList.remove(clima);
    }
    
    public List<Clima> getClimaList() {
        return climaList;
    }

    @Override
    public void update(Clima info) {
        addClima(info);
    }
}
