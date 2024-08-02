package view;

import javax.swing.JLabel;

/**
 * @author 
 * Pedro Henrique Passos Rocha
 * Catterina Salvador
 */

public class DadosMediosView extends javax.swing.JInternalFrame {

    public DadosMediosView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemperatura2 = new javax.swing.JLabel();
        lblUmidade2 = new javax.swing.JLabel();
        lblPressão2 = new javax.swing.JLabel();
        lblNumRegistros = new javax.swing.JLabel();
        lblTempResult = new javax.swing.JLabel();
        lblUmidResult = new javax.swing.JLabel();
        lblPressResult = new javax.swing.JLabel();
        lblRegisResult = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Dados médios");
        setMinimumSize(new java.awt.Dimension(343, 225));
        setPreferredSize(new java.awt.Dimension(343, 225));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemperatura2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTemperatura2.setText("Temperatura:");
        getContentPane().add(lblTemperatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblUmidade2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUmidade2.setText("Umidade:");
        getContentPane().add(lblUmidade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        lblPressão2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPressão2.setText("Pressão:");
        getContentPane().add(lblPressão2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        lblNumRegistros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumRegistros.setText("Número de Registros:");
        getContentPane().add(lblNumRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblTempResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTempResult.setText("0");
        getContentPane().add(lblTempResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblUmidResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUmidResult.setText("0");
        getContentPane().add(lblUmidResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        lblPressResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPressResult.setText("0");
        getContentPane().add(lblPressResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lblRegisResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisResult.setText("0");
        getContentPane().add(lblRegisResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        setBounds(373, 10, 343, 221);
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLblPressResult() {
        return lblPressResult;
    }

    public JLabel getLblRegisResult() {
        return lblRegisResult;
    }

    public JLabel getLblTempResult() {
        return lblTempResult;
    }

    public JLabel getLblUmidResult() {
        return lblUmidResult;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNumRegistros;
    private javax.swing.JLabel lblPressResult;
    private javax.swing.JLabel lblPressão2;
    private javax.swing.JLabel lblRegisResult;
    private javax.swing.JLabel lblTempResult;
    private javax.swing.JLabel lblTemperatura2;
    private javax.swing.JLabel lblUmidResult;
    private javax.swing.JLabel lblUmidade2;
    // End of variables declaration//GEN-END:variables
}
