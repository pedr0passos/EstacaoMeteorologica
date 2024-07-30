package view;

import model.ClimaModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author pedro
 */

public class MaxMinView extends javax.swing.JInternalFrame {

    public MaxMinView() {
        initComponents();
    }

    public void criarGrafico(ClimaModel maxMin) {
        var gBarra = new DefaultCategoryDataset();
        
//        gBarra.setValue(maxMin.getTemperaturaMin(), "Temp Mínima", "");;
//        gBarra.setValue(maxMin.getTemperaturaMax(), "Temp Máxima", "");
//        gBarra.setValue(maxMin.getPressaoaMin(), "Pressão Mínima", "");
//        gBarra.setValue(maxMin.getPressaoMax(), "Pressão Máxima", "");
//        gBarra.setValue(maxMin.getUmidadeMin(), "Umidade Mínima", "");
//        gBarra.setValue(maxMin.getUmidadeMax(), "Umidade Máxima", "");
        
        JFreeChart grafico = ChartFactory.createBarChart(
                "A", "B", "C", gBarra, 
                PlotOrientation.VERTICAL, true, true, false
        );
        
        var painel = new ChartPanel(grafico);
        add(painel);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemperatura4 = new javax.swing.JLabel();
        lblUmidade4 = new javax.swing.JLabel();
        lblPressao4 = new javax.swing.JLabel();

        setTitle("Máximas e Mínimas");

        lblTemperatura4.setText("Temperatura");

        lblUmidade4.setText("Umidade");

        lblPressao4.setText("Pressão");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(lblTemperatura4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(lblUmidade4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(lblPressao4)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperatura4)
                    .addComponent(lblUmidade4)
                    .addComponent(lblPressao4))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblPressao4;
    private javax.swing.JLabel lblTemperatura4;
    private javax.swing.JLabel lblUmidade4;
    // End of variables declaration//GEN-END:variables
}
