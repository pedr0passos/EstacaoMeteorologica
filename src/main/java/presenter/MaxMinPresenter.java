package presenter;

import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.*;

import javax.swing.JDesktopPane;
import java.util.Comparator;
import java.util.List;
import java.awt.*;

import observer.Observer;
import model.*;
import view.*;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class MaxMinPresenter implements Observer {
    
    private final ClimaModel model;
    private MaxMinView view;

    public MaxMinPresenter(ClimaModel model, JDesktopPane desktopPane){
        this.model = model;
        criarView();
        desktopPane.add(view);
    }
    
    private void criarView() {
        this.view = new MaxMinView();
        this.view.setVisible(true);
        criarTabela();
    }
    
    public void criarTabela() {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Clima> climas = model.getClimaList();
        
        if (!climas.isEmpty()) {
            Double maxTemperatura = climas.stream().max(Comparator.comparing(Clima::getTemperatura)).get().getTemperatura();
            Double minTemperatura = climas.stream().min(Comparator.comparing(Clima::getTemperatura)).get().getTemperatura();
            Double maxPressao = climas.stream().max(Comparator.comparing(Clima::getPressao)).get().getPressao();
            Double minPressao = climas.stream().min(Comparator.comparing(Clima::getPressao)).get().getPressao();
            Double maxUmidade = climas.stream().max(Comparator.comparing(Clima::getUmidade)).get().getUmidade();
            Double minUmidade = climas.stream().min(Comparator.comparing(Clima::getUmidade)).get().getUmidade();

            dataset.addValue(maxTemperatura, "Temperatura Máxima", "Temperatura");
            dataset.addValue(minTemperatura, "Temperatura Mínima", "Temperatura");
            dataset.addValue(maxPressao, "Pressão Máxima", "Pressão");
            dataset.addValue(minPressao, "Pressão Mínima", "Pressão");
            dataset.addValue(maxUmidade, "Umidade Máxima", "Umidade");
            dataset.addValue(minUmidade, "Umidade Mínima", "Umidade");
        }
        
        JFreeChart barChart = ChartFactory.createBarChart(
                "Dados Climáticos Máximos e Mínimos",
                "Categoria",
                "Valores",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setBarPainter(new StandardBarPainter());
        renderer.setSeriesPaint(0, new Color(255, 0, 0)); 
        renderer.setSeriesPaint(1, new Color(0, 0, 255)); 
        renderer.setSeriesPaint(2, new Color(0, 255, 0));
        renderer.setSeriesPaint(3, new Color(255, 255, 0)); 
        renderer.setSeriesPaint(4, new Color(255, 0, 255)); 
        renderer.setSeriesPaint(5, new Color(0, 255, 255)); 
        renderer.setMaximumBarWidth(0.1); 
        renderer.setItemMargin(0.02);
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setDefaultItemLabelsVisible(true);
        
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setUpperMargin(0.15); 
        
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryMargin(0.1); 
        
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(560, 367));
        view.setContentPane(chartPanel);
        view.revalidate();        
    }
    
    @Override
    public void update() {
        criarTabela();
    }    
}