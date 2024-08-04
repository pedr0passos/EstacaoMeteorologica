package presenter;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JDesktopPane;
import model.*;
import observer.Observer;
import utils.DateUtils;
import view.*;

/**
 * @author 
 * Catterina Salvador
 * Pedro Henrique Passos Rocha
 */

public class UltimaAtualizacaoPresenter implements Observer {
    
    private final ClimaModel model;
    private UltimaAtualizacaoView view;

    public UltimaAtualizacaoPresenter(ClimaModel model, JDesktopPane desktopPane){
        this.model = model;
        criarView();
        desktopPane.add(view);
    }
    
    private void criarView() {
        view = new UltimaAtualizacaoView();
        view.setVisible(true);
    }
    
    public void atualizarUltimaAtualizacao() {
        List<Clima> climas = model.getClimaList();
        if (!climas.isEmpty()) {
            Clima ultimoClima = getUltimoClima(climas); 
            atualizarDados(
                ultimoClima.getData(), 
                ultimoClima.getTemperatura(), 
                ultimoClima.getUmidade(), 
                ultimoClima.getPressao()
            );
        } else {
            limparDados(); 
        }
    }
    
    private Clima getUltimoClima(List<Clima> climas) {
        Clima ultimoClima = climas.get(0);

        for (Clima clima : climas) {
            if (clima.getData().isAfter(ultimoClima.getData())) {
                ultimoClima = clima;
            }
        }
        return ultimoClima;
    }
    
    public void atualizarDados(LocalDate data, Double temperatura, Double umidade, Double pressao) {
        view.getLblDataResult().setText(DateUtils.formatDateBr(data));
        view.getLblTemperaturaResult().setText(temperatura + "°C");
        view.getLblUmidadeResult().setText(umidade + "%");
        view.getLblPressaoResult().setText(pressao + " hPa");
    }
    
    public void limparDados() {
        view.getLblDataResult().setText("Nenhuma Data");
        view.getLblTemperaturaResult().setText("0");
        view.getLblUmidadeResult().setText("0");
        view.getLblPressaoResult().setText("0");
    }
    
    @Override
    public void update() {
        atualizarUltimaAtualizacao();
    }
}
