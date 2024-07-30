package main;

import javax.swing.*;
import model.ClimaModel;
import view.*;

public class Main {
    public static void main(String[] args) {
        
        var estacaoView = new EstacaoView();
        var desktopPane = estacaoView.getMainPane();
        var climaModel = new ClimaModel();
        
        estacaoView.setVisible(true);

        var dadosTempoView = new DadosTempoView(climaModel);
        var registrosView = new RegistrosView(climaModel);
        
        addInternalFrame(dadosTempoView, desktopPane);
        addInternalFrame(registrosView, desktopPane);
        
        /* addInternalFrame(dadosMediosView, desktopPane);;
        addInternalFrame(maxMinView, desktopPane);

        addInternalFrame(ultimaAtualizacaoView, desktopPane); */
    }
    
    public static void addInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane) {
        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
    }
}
