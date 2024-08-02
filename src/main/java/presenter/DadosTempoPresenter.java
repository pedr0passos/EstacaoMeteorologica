package presenter;

import java.awt.event.*;
import java.util.*;
import javax.swing.JDesktopPane;
import log.*;
import model.*;
import observer.Observer;
import service.DataConverterService;
import service.GerenciadorLog;
import view.DadosTempoView;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class DadosTempoPresenter {
    
    private final List<Observer> observers = new ArrayList<>();
    
    private final ClimaModel model;
    private DadosTempoView view;
    
    public DadosTempoPresenter(ClimaModel model, JDesktopPane desktopPane) {
        this.model = model;
        criarView();
        desktopPane.add(view);
    }
    
    public final void criarView() {
        view = new DadosTempoView(); 
        view.setVisible(true);
        view.getBtnIncluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    adicionarDados (
                            Double.valueOf(view.getTxtTemperatura().getText()),
                            Double.valueOf(view.getTxtUmidade().getText()),
                            Double.valueOf(view.getTxtPressao().getText())
                    );
                    notificaAdicao();  
                    limparDados();
                } catch ( NumberFormatException exception) {
                    exception.getStackTrace();                    
                }
            }
        });
    }
    
    public void adicionarDados(Double temperatura, Double umidade, Double pressao) {
        var converter = new DataConverterService();
        var dataConvertida = converter.convertStringToLocalDate(view.getTxtData().getText());
        var clima = new Clima(dataConvertida, temperatura, umidade, pressao);
        model.addClima(clima);   
        
        var logSelecionado = model.getLogSelecionado();
        var gerenciadorLog = new GerenciadorLog();
        
        if (logSelecionado.equals("Json")) 
            gerenciadorLog.processarLogs("inclusao", new JsonAdapter(new JsonLog()));
        else
            gerenciadorLog.processarLogs("inclusao", new XmlAdapter(new XmlLog()));
    }
    
    public void limparDados() {
        view.getTxtData().setText("");
        view.getTxtTemperatura().setText("");
        view.getTxtUmidade().setText("");
        view.getTxtPressao().setText("");
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notificaAdicao() {
        for (Observer observer : observers ) 
            observer.update();
    }
}