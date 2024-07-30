/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

import model.Clima;
import model.ClimaModel;

/**
 *
 * @author Catterina Salvador
 */

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notificaObservers(Clima info);
}
