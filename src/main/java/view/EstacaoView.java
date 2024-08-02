package view;

import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

/**
 * @author 
 * Pedro Henrique Passos Rocha
 * Catterina Salvador
 */

public class EstacaoView extends javax.swing.JFrame {

    public EstacaoView() {
        configuraLookAndFeel();        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JDesktopPane();
        lblNumeroRegistros = new javax.swing.JLabel();
        lblNumeroRegistrosResult = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        btnMenuConfigurar = new javax.swing.JMenu();
        mItemConfigurarLog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estação Climática");

        mainPane.setBackground(new java.awt.Color(232, 232, 232));

        lblNumeroRegistros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumeroRegistros.setText("Número de Registros:");

        lblNumeroRegistrosResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumeroRegistrosResult.setText("0");

        mainPane.setLayer(lblNumeroRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPane.setLayer(lblNumeroRegistrosResult, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap(1173, Short.MAX_VALUE)
                .addComponent(lblNumeroRegistros)
                .addGap(30, 30, 30)
                .addComponent(lblNumeroRegistrosResult)
                .addGap(64, 64, 64))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroRegistros)
                    .addComponent(lblNumeroRegistrosResult))
                .addGap(14, 14, 14))
        );

        getContentPane().add(mainPane, java.awt.BorderLayout.CENTER);

        menuBar.setDoubleBuffered(true);

        btnMenuConfigurar.setText("Configurar");

        mItemConfigurarLog.setText("Configurar Log");
        btnMenuConfigurar.add(mItemConfigurarLog);

        menuBar.add(btnMenuConfigurar);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void addConfigurarLogActionListener(ActionListener listener) {
        mItemConfigurarLog.addActionListener(listener);
    }
    
    public JDesktopPane getMainPane() {
        return mainPane;
    }
    
    public static void configuraLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }    
    }

    public JLabel getLblNumeroRegistrosResult() {
        return lblNumeroRegistrosResult;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnMenuConfigurar;
    private javax.swing.JLabel lblNumeroRegistros;
    private javax.swing.JLabel lblNumeroRegistrosResult;
    private javax.swing.JMenuItem mItemConfigurarLog;
    private javax.swing.JDesktopPane mainPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
