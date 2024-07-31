package presenter;

import java.util.List;
import org.jfree.chart.*;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JDesktopPane;
import view.*;
import model.*;
import observer.Observer;
import org.jfree.chart.plot.PlotOrientation;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class MaxMinPresenter implements Observer {
    
    private ClimaModel model;
    private MaxMinView view;

    public MaxMinPresenter(ClimaModel model, JDesktopPane desktopPane){
        this.model = model;
        criarView();
        desktopPane.add(view);
    }
    
    public void criarView() {
        this.view = new MaxMinView();
        this.view.setVisible(true);
        criarTabela();
    }
    
    public void criarTabela() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        List<Clima> climas = model.getClimaList();
        if (!climas.isEmpty()) {
            Double maxTemperatura = climas.get(0).getTemperatura();
            Double minTemperatura = climas.get(0).getTemperatura();

            for (Clima clima : climas) {
                if (clima.getTemperatura() > maxTemperatura) {
                    maxTemperatura = clima.getTemperatura();
                }
                if (clima.getTemperatura() < minTemperatura) {
                    minTemperatura = clima.getTemperatura();
                }
            }

            dataset.addValue(maxTemperatura, "Temperatura Máxima", "");
            dataset.addValue(minTemperatura, "Temperatura Mínima", "");
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                "Temperaturas Máximas e Mínimas",
                "Categoria",
                "Temperatura (°C)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        view.setContentPane(chartPanel);
        view.revalidate();        
    }
    
    @Override
    public void update() {
        criarTabela();
    }    
}