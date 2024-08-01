package main;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import log.JsonLog;
import log.XmlLog;
import model.*;
import presenter.*;
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

        var dadosTempoPresenter = new DadosTempoPresenter(climaModel, desktopPane);
        var registrosPresenter = new RegistrosPresenter(climaModel, desktopPane);
        var dadosMediosPresenter = new DadosMediosPresenter(climaModel, desktopPane);
        var ultimaAtualizacaoPresenter = new UltimaAtualizacaoPresenter(climaModel, desktopPane);
        var maxMinPresenter = new MaxMinPresenter(climaModel, desktopPane);
        
        dadosTempoPresenter.addObserver(registrosPresenter);
        dadosTempoPresenter.addObserver(dadosMediosPresenter);
        dadosTempoPresenter.addObserver(ultimaAtualizacaoPresenter);
        dadosTempoPresenter.addObserver(maxMinPresenter);
        
        registrosPresenter.addObserver(dadosMediosPresenter);
        registrosPresenter.addObserver(ultimaAtualizacaoPresenter);
        registrosPresenter.addObserver(maxMinPresenter);
    }
    
    public static void addInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane, boolean visible) {
        desktopPane.add(internalFrame);
        internalFrame.setVisible(visible);
    }
}
