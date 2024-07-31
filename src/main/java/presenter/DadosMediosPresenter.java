package presenter;

import javax.swing.JDesktopPane;
import view.*;
import model.*;
import observer.Observer;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class DadosMediosPresenter implements Observer {
    
    private final ClimaModel model;
    private DadosMediosView view;

    public DadosMediosPresenter(ClimaModel model, JDesktopPane desktopPane){
        this.model = model;
        criarView();
        desktopPane.add(view);
    }
    
    private void criarView() {
        this.view = new DadosMediosView();
        this.view.setVisible(true);
    }
    
    public void atualizarMedias() {
        var climaList = model.getClimaList();
        
        double somaTemp=0;
        double somaUmid=0;
        double somaPress=0;
        
        for (Clima clima : climaList) {
            somaTemp += clima.getTemperatura();
            somaUmid += clima.getUmidade();
            somaPress += clima.getPressao();
        }
        
        double mediaTemp = climaList.isEmpty() ? 0 : somaTemp / climaList.size();
        double mediaUmid = climaList.isEmpty() ? 0 : somaUmid / climaList.size();
        double mediaPress = climaList.isEmpty() ? 0 : somaPress / climaList.size();
        
        view.getLblTempResult().setText(String.format("%.2f", mediaTemp) + "°C");
        view.getLblUmidResult().setText(String.format("%.2f", mediaUmid) + "%");
        view.getLblPressResult().setText(String.format("%.2f", mediaPress) + " hPa");
        view.getLblRegisResult().setText(String.valueOf(climaList.size()));
    }
    
    @Override
    public void update() {
        atualizarMedias();
    }
}
