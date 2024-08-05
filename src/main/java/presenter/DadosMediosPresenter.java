package presenter;

import javax.swing.JDesktopPane;
import view.*;
import model.*;
import observer.Observer;
import service.CalculadoraMediaService;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class DadosMediosPresenter implements Observer {
    
    private final ClimaModel model;
    private DadosMediosView view;
    private final CalculadoraMediaService calculadoraMedia;
    
    public DadosMediosPresenter(ClimaModel model, JDesktopPane desktopPane){
        calculadoraMedia = new CalculadoraMediaService();
        this.model = model;
        criarView();
        desktopPane.add(view);
        atualizarMedias();
    }
    
    private void criarView() {
        this.view = new DadosMediosView();
        this.view.setVisible(true);
    }
    
    private void atualizarMedias() {
        var climaList = model.getClimaList();
        
        double mediaTemp = calculadoraMedia.calcularMediaTemperatura(climaList);
        double mediaUmid = calculadoraMedia.calcularMediaUmidade(climaList);
        double mediaPress = calculadoraMedia.calcularMediaPressao(climaList);
        
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
