package view;

import javax.swing.*;

/**
 * @author 
 * Catterina Salvador
 * Pedro Henrique Passos Rocha
 */

public class RegistrosView extends javax.swing.JInternalFrame {

    public RegistrosView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistros = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();

        setTitle("Registros");

        tbRegistros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Temperatura", "Umidade", "Pressão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbRegistros.setName(""); // NOI18N
        tbRegistros.setShowGrid(true);
        tbRegistros.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tbRegistros);

        btnRemover.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemover)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemover)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTable getTbRegistros() {
        return tbRegistros;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRegistros;
    // End of variables declaration//GEN-END:variables
}
