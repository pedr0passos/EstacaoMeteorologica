package presenter;

import java.util.List;
import model.*;
import observer.Observer;
import view.DadosTempoView;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class DadosTempoPresenter implements Observer{
    
    private final ClimaModel model;
    private final DadosTempoView view;

    public DadosTempoPresenter(ClimaModel model, DadosTempoView view) {
        this.model = model;
        this.view = view;
    }

    public ClimaModel getModel() {
        return model;
    }

    public DadosTempoView getView() {
        return view;
    }
    
    public void adicionarDados(String data, Double temperatura, Double umidade, Double pressao) {
        var clima = new Clima(data, temperatura, umidade, pressao);
        model.addClima(clima);
        List<Clima> climaList = model.getClimaList();

        for (Clima c : climaList) {
            System.out.println(c);
        }
    }

    @Override
    public void update(Clima info) {
        model.addClima(info);
        
    }
}
