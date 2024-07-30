package presenter;

import java.util.HashSet;
import model.DadosTempoModel;
import view.DadosTempoView;

/**
 *
 * @author pedro
 */
public class DadosTempoPresenter {
    
    private final DadosTempoModel model;
    private final DadosTempoView view;

    public DadosTempoPresenter(DadosTempoModel model, DadosTempoView view) {
        this.model = model;
        this.view = view;
    }

    public DadosTempoModel getModel() {
        return model;
    }

    public DadosTempoView getView() {
        return view;
    }
    
    public void salvarModel() {
        model.getDados().setData(view.getTxtData());
        model.getDados().setUmidade(view.getTxtUmidade());
        model.getDados().setTemperatura(view.getTxtTemperatura());
        model.getDados().setPressao(view.getTxtPressao());
    }
}
