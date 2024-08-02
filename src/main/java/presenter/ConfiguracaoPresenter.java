package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ClimaModel;
import view.ConfiguracaoView;

/**
 * @author 
 * Pedro Henrique Passos
 * Catterina Salvador
 */

public class ConfiguracaoPresenter {
    
    private ClimaModel model;
    private ConfiguracaoView view;
    
    public ConfiguracaoPresenter(ClimaModel model, ConfiguracaoView view) {
        this.model = model;
        this.view = view;
        this.view.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alterarLog();
            }
        }); 
    }
    
    public void alterarLog() {
        String logSelecionado = (String) view.getcBoxLog().getSelectedItem();
        model.setLog(logSelecionado);
        view.setVisible(false);
    }
    
    public ConfiguracaoView getView() {
        return view;
    }
}
