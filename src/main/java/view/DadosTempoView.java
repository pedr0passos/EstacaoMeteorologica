package view;

import javax.swing.JOptionPane;
import model.ClimaModel;
import observer.Observer;
import presenter.DadosTempoPresenter;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class DadosTempoView extends javax.swing.JInternalFrame implements Observer {

    private DadosTempoPresenter presenter;
    
    public DadosTempoView(ClimaModel model) {
        initComponents();
        this.presenter = new DadosTempoPresenter(model, this);
        model.addObserver(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData1 = new javax.swing.JLabel();
        lblTemperatura1 = new javax.swing.JLabel();
        lblUmidade1 = new javax.swing.JLabel();
        lblPressao1 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtUmidade = new javax.swing.JTextField();
        txtPressao = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();

        setTitle("Dados do tempo");
        setToolTipText("");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData1.setText("Data:");
        getContentPane().add(lblData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblTemperatura1.setText("Temperatura:");
        getContentPane().add(lblTemperatura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblUmidade1.setText("Umidade:");
        getContentPane().add(lblUmidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lblPressao1.setText("Pressão:");
        getContentPane().add(lblPressao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 132, -1));
        getContentPane().add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 132, -1));
        getContentPane().add(txtUmidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 132, -1));
        getContentPane().add(txtPressao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 132, -1));

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        String data = txtData.getText();
        Double temperatura = Double.valueOf(txtTemperatura.getText());
        Double umidade = Double.valueOf(txtUmidade.getText());
        Double pressao = Double.valueOf(txtPressao.getText());
        
        presenter.adicionarDados(data, temperatura, umidade, pressao);
    }//GEN-LAST:event_btnIncluirActionPerformed

    @Override
    public void update() {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblPressao1;
    private javax.swing.JLabel lblTemperatura1;
    private javax.swing.JLabel lblUmidade1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPressao;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtUmidade;
    // End of variables declaration//GEN-END:variables
}
