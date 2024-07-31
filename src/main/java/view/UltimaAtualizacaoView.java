package view;

import javax.swing.JLabel;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha 
 */

public class UltimaAtualizacaoView extends javax.swing.JInternalFrame {

    public UltimaAtualizacaoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemperatura = new javax.swing.JLabel();
        lblUmidade = new javax.swing.JLabel();
        lblPressão = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblTemperaturaResult = new javax.swing.JLabel();
        lblUmidadeResult = new javax.swing.JLabel();
        lblPressaoResult = new javax.swing.JLabel();
        lblDataResult = new javax.swing.JLabel();

        setTitle("Útlima atualização do tempo");

        lblTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTemperatura.setText("Temperatura:");

        lblUmidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUmidade.setText("Umidade:");

        lblPressão.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPressão.setText("Pressão:");

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("Data:");

        lblTemperaturaResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTemperaturaResult.setText("0");

        lblUmidadeResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUmidadeResult.setText("0");

        lblPressaoResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPressaoResult.setText("0");

        lblDataResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataResult.setText("Nenhuma Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblData)
                    .addComponent(lblPressão)
                    .addComponent(lblUmidade)
                    .addComponent(lblTemperatura))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemperaturaResult)
                    .addComponent(lblUmidadeResult)
                    .addComponent(lblPressaoResult)
                    .addComponent(lblDataResult))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperatura)
                    .addComponent(lblTemperaturaResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUmidade)
                    .addComponent(lblUmidadeResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressão)
                    .addComponent(lblPressaoResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblDataResult))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLblDataResult() {
        return lblDataResult;
    }

    public JLabel getLblPressaoResult() {
        return lblPressaoResult;
    }

    public JLabel getLblTemperaturaResult() {
        return lblTemperaturaResult;
    }

    public JLabel getLblUmidadeResult() {
        return lblUmidadeResult;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataResult;
    private javax.swing.JLabel lblPressaoResult;
    private javax.swing.JLabel lblPressão;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTemperaturaResult;
    private javax.swing.JLabel lblUmidade;
    private javax.swing.JLabel lblUmidadeResult;
    // End of variables declaration//GEN-END:variables
}
