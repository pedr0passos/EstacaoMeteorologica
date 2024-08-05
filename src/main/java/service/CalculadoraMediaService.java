package service;

import model.Clima;
import java.util.List;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class CalculadoraMediaService {

    public double calcularMediaTemperatura(List<Clima> climaList) {
        double somaTemp = 0;
        for (Clima clima : climaList) {
            somaTemp += clima.getTemperatura();
        }
        return climaList.isEmpty() ? 0 : somaTemp / climaList.size();
    }

    public double calcularMediaUmidade(List<Clima> climaList) {
        double somaUmid = 0;
        for (Clima clima : climaList) {
            somaUmid += clima.getUmidade();
        }
        return climaList.isEmpty() ? 0 : somaUmid / climaList.size();
    }

    public double calcularMediaPressao(List<Clima> climaList) {
        double somaPress = 0;
        for (Clima clima : climaList) {
            somaPress += clima.getPressao();
        }
        return climaList.isEmpty() ? 0 : somaPress / climaList.size();
    }
}
