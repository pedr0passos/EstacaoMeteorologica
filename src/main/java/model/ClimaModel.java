package model;

import java.util.ArrayList;
import java.util.List;
import observer.Observable;
import observer.Observer;

/**
 * @author Pedro Henrique Passos Rocha
 * @author Catterina Salvador
 */

public class ClimaModel implements Observable {
    
    private List<Clima> climaList = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    
    public void addClima(Clima clima) {
        climaList.add(clima);
        notificaObservers();
    }
    
    public void removeClima(Clima clima) {
        climaList.remove(clima);
        notificaObservers();
    }
    
    public List<Clima> getClimaList() {
        return climaList;
    }
    
    @Override
    public void addObserver (Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificaObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
