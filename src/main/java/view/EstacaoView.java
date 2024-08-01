package view;

import javax.swing.JDesktopPane;

/**
 *
 * @author 
 * Pedro Henrique Passos Rocha
 * Catterina Salvador
 * 
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
        menuBar = new javax.swing.JMenuBar();
        btnMenuConfigurar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estação Climática");

        mainPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1450, Short.MAX_VALUE)
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        getContentPane().add(mainPane, java.awt.BorderLayout.CENTER);

        menuBar.setDoubleBuffered(true);

        btnMenuConfigurar.setText("Configurar");
        menuBar.add(btnMenuConfigurar);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstacaoView().setVisible(true);
            }
        });
    }

    public JDesktopPane getMainPane() {
        return mainPane;
    }

    public static void configuraLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstacaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnMenuConfigurar;
    private javax.swing.JDesktopPane mainPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
