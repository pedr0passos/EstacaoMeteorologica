package presenter;

import java.awt.event.*;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

import model.*;
import observer.Observer;
import view.RegistrosView;

/**
 * @author 
 * Catterina Salvador
 * Pedro Henrique Passos 
 */

public class RegistrosPresenter implements Observer {

    private final ClimaModel model;
    private RegistrosView view;
    
    public RegistrosPresenter (ClimaModel model, JDesktopPane desktopPane) {
        this.model = model;
        criarView();
        desktopPane.add(view);
    }
    
    private void criarView() {
        this.view = new RegistrosView();
        this.view.setVisible(true);
        mostrarDados();
        this.view.getBtnRemover().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerDado();
                mostrarDados();
            }
        });        
    }
    
    public void removerDado() {
        var tabela = view.getTbRegistros();
        int linhaSelecionada = tabela.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            var tableModel = (DefaultTableModel) tabela.getModel();
            model.removeClima(linhaSelecionada);
            tableModel.removeRow(linhaSelecionada);
        }
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
    
    @Override
    public void update() {
        mostrarDados();
    }
}
