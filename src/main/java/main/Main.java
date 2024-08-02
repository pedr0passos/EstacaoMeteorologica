package main;

import javax.swing.*;
import presenter.*;
import model.*;
import view.*;

/**
 * @author 
 * Catterina Salvador
 * Pedro Henrique Passos Rocha
 */

public class Main {
    public static void main(String[] args) {
        
        var estacaoView = new EstacaoView();
        var climaModel = new ClimaModel();
        var desktopPane = estacaoView.getMainPane();
        
        estacaoView.setVisible(true);
        
        var configView = new ConfiguracaoView();
        initConfigView(configView, desktopPane);

        estacaoView.addConfigurarLogActionListener(evt -> configView.setVisible(true));
        
        var configuracaoPresenter = new ConfiguracaoPresenter(climaModel, configView);
        var dadosTempoPresenter = new DadosTempoPresenter(climaModel, desktopPane);
        var registrosPresenter = new RegistrosPresenter(climaModel, desktopPane);
        var dadosMediosPresenter = new DadosMediosPresenter(climaModel, desktopPane);
        var ultimaAtualizacaoPresenter = new UltimaAtualizacaoPresenter(climaModel, desktopPane);
        var maxMinPresenter = new MaxMinPresenter(climaModel, desktopPane);
        var estacaoPresenter = new EstacaoPresenter(climaModel, estacaoView);
        
        dadosTempoPresenter.addObserver(registrosPresenter);
        dadosTempoPresenter.addObserver(dadosMediosPresenter);
        dadosTempoPresenter.addObserver(ultimaAtualizacaoPresenter);
        dadosTempoPresenter.addObserver(maxMinPresenter);
        dadosTempoPresenter.addObserver(estacaoPresenter);
        
        registrosPresenter.addObserver(dadosMediosPresenter);
        registrosPresenter.addObserver(ultimaAtualizacaoPresenter);
        registrosPresenter.addObserver(maxMinPresenter);
        registrosPresenter.addObserver(estacaoPresenter);
        
    }
    
    public static void addInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane, boolean visible) {
        desktopPane.add(internalFrame);
        internalFrame.setVisible(visible);
    }
    
    public static void initConfigView(JInternalFrame configView, JDesktopPane desktopPane) {
        desktopPane.add(configView);
        configView.setVisible(false);
    }
}
