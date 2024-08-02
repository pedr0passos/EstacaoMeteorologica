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
        txtUmidade = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtPressao = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(235, 235, 235));
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("Dados do tempo");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(355, 221));
        setPreferredSize(new java.awt.Dimension(355, 221));
        setVisible(true);
        getContentPane().setLayout(null);

        lblData1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData1.setText("Data:");
        getContentPane().add(lblData1);
        lblData1.setBounds(80, 30, 32, 20);

        lblTemperatura1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTemperatura1.setText("Temperatura:");
        getContentPane().add(lblTemperatura1);
        lblTemperatura1.setBounds(30, 60, 81, 20);

        lblUmidade1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUmidade1.setText("Umidade:");
        getContentPane().add(lblUmidade1);
        lblUmidade1.setBounds(50, 120, 58, 20);

        lblPressao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPressao1.setText("Pressão:");
        getContentPane().add(lblPressao1);
        lblPressao1.setBounds(60, 90, 50, 20);

        txtUmidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUmidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtUmidade);
        txtUmidade.setBounds(120, 120, 190, 20);

        txtTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTemperatura);
        txtTemperatura.setBounds(120, 60, 190, 20);

        txtPressao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPressao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPressao);
        txtPressao.setBounds(120, 90, 190, 20);

        btnIncluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIncluir.setText("Incluir");
        getContentPane().add(btnIncluir);
        btnIncluir.setBounds(240, 150, 72, 27);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtData);
        txtData.setBounds(120, 30, 190, 20);

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
