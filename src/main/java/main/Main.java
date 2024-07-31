package main;

import javax.swing.*;
import model.*;
import presenter.*;
import view.*;

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
    }
    
    public static void addInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane, boolean visible) {
        desktopPane.add(internalFrame);
        internalFrame.setVisible(visible);
    }
}
