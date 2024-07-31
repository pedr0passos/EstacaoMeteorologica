package view;

import java.util.*;
import javax.swing.*;
import observer.Observer;

/**
 * @author 
 * Catterina Salvador
 * Pedro Henrique Passos Rocha
 */

public class DadosTempoView extends javax.swing.JInternalFrame  {

    private List<Observer> observers = new ArrayList<>();
    
    public DadosTempoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData1 = new javax.swing.JLabel();
        lblTemperatura1 = new javax.swing.JLabel();
        lblUmidade1 = new javax.swing.JLabel();
        lblPressao1 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        txtUmidade = new javax.swing.JTextField();
        txtPressao = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();

        setTitle("Dados do tempo");
        setToolTipText("");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData1.setText("Data:");
        getContentPane().add(lblData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 21, -1, -1));

        lblTemperatura1.setText("Temperatura:");
        getContentPane().add(lblTemperatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 61, -1, -1));

        lblUmidade1.setText("Umidade:");
        getContentPane().add(lblUmidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 101, -1, -1));

        lblPressao1.setText("Pressão:");
        getContentPane().add(lblPressao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 141, -1, -1));
        getContentPane().add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 61, 132, -1));
        getContentPane().add(txtUmidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 101, 132, -1));
        getContentPane().add(txtPressao, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 141, 132, -1));

        btnIncluir.setText("Incluir");
        getContentPane().add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 191, -1, -1));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 18, 132, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JButton getBtnIncluir() {
        return btnIncluir;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public JTextField getTxtPressao() {
        return txtPressao;
    }

    public JTextField getTxtTemperatura() {
        return txtTemperatura;
    }

    public JTextField getTxtUmidade() {
        return txtUmidade;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblPressao1;
    private javax.swing.JLabel lblTemperatura1;
    private javax.swing.JLabel lblUmidade1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtPressao;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtUmidade;
    // End of variables declaration//GEN-END:variables
}
