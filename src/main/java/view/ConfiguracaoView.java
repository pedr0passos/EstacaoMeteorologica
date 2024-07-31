package view;

/**
 * @author 
 * Pedro Henrique Passos Rocha
 * Catterina Salvador
 */

public class ConfiguracaoView extends javax.swing.JInternalFrame {

    public ConfiguracaoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLog = new javax.swing.JLabel();
        cBoxLog = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();

        setTitle("Configuração do Sistema");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLog.setText("Log:");
        getContentPane().add(lblLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cBoxLog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cBoxLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 173, -1));

        btnSalvar.setText("Salvar");
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cBoxLog;
    private javax.swing.JLabel lblLog;
    // End of variables declaration//GEN-END:variables
}
