package presenter;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Clima;
import model.ClimaModel;
import view.RegistrosView;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos 
 */

public class RegistrosPresenter {
    
    private final ClimaModel model;
    private final RegistrosView view;
    
    public RegistrosPresenter (ClimaModel model, RegistrosView view) {
        this.model = model;
        this.view = view;
    }
    
    public void mostrarDados() {
        List<Clima> climaList = model.getClimaList();
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbRegistros().getModel();

        tableModel.setRowCount(0);
        
        for (Clima clima : climaList) {
            tableModel.addRow( new Object[] {
                clima.getData(),
                clima.getTemperatura(),
                clima.getUmidade(),
                clima.getPressao()
            });
        }
    }
}
