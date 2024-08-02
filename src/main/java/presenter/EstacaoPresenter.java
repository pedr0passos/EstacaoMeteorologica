package presenter;

import model.ClimaModel;
import observer.Observer;
import view.EstacaoView;

/**
 * @author 
 * Pedro Henrique Passos Rocha 
 * Catterina Salvador
 */

public class EstacaoPresenter implements Observer {
    
    private final ClimaModel model;
    private EstacaoView view;

    public EstacaoPresenter(ClimaModel model, EstacaoView view) {
        this.model = model;
        this.view = view;
    }
    
    public void atualizarRegistros() {
        var climaList = model.getClimaList();
        view.getLblNumeroRegistrosResult().setText(String.valueOf(climaList.size()));
    }
    
    @Override
    public void update() {
        atualizarRegistros();
    }
}
