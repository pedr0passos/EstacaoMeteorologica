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

        setTitle("Dados médios");
        setPreferredSize(new java.awt.Dimension(310, 310));

        lblTemperatura2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTemperatura2.setText("Temperatura:");

        lblUmidade2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUmidade2.setText("Umidade:");

        lblPressão2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPressão2.setText("Pressão:");

        lblNumRegistros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumRegistros.setText("Número de Registros:");

        lblTempResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTempResult.setText("0");

        lblUmidResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUmidResult.setText("0");

        lblPressResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPressResult.setText("0");

        lblRegisResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegisResult.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumRegistros)
                    .addComponent(lblPressão2)
                    .addComponent(lblUmidade2)
                    .addComponent(lblTemperatura2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTempResult)
                    .addComponent(lblUmidResult)
                    .addComponent(lblPressResult)
                    .addComponent(lblRegisResult))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperatura2)
                    .addComponent(lblTempResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUmidade2)
                    .addComponent(lblUmidResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressão2)
                    .addComponent(lblPressResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumRegistros)
                    .addComponent(lblRegisResult))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
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
