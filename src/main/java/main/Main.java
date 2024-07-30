package main;

import javax.swing.*;
import model.DadosTempoModel;
import presenter.DadosTempoPresenter;
import view.*;

public class Main {
    public static void main(String[] args) {
        
        var estacaoView = new EstacaoView();
        var desktopPane = estacaoView.getMainPane();
        
        estacaoView.setVisible(true);
        
        var dadosTempoView = new DadosTempoView();
        var dadosMediosView = new DadosMediosView();
        var maxMinView = new MaxMinView();
        var registrosView = new RegistrosView();
        var ultimaAtualizacaoView = new UltimaAtualizacaoView();
        
        addInternalFrame(dadosTempoView, desktopPane);
        addInternalFrame(dadosMediosView, desktopPane);
        addInternalFrame(maxMinView, desktopPane);
        addInternalFrame(registrosView, desktopPane);
        addInternalFrame(ultimaAtualizacaoView, desktopPane);
    }
    
    public static void addInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane) {
        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
    }
}
