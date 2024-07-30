package view;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Clima;
import model.ClimaModel;
import observer.Observer;
import presenter.RegistrosPresenter;

/**
 * @author Catterina Salvador
 * @author Pedro Henrique Passos Rocha
 */

public class RegistrosView extends javax.swing.JInternalFrame implements Observer {

    private RegistrosPresenter presenter;
    private ClimaModel model;
    
    public RegistrosView(ClimaModel model) {
        initComponents();
        presenter = new RegistrosPresenter(model, this);
        this.model = model;
        model.addObserver(this);
        presenter.mostrarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistros = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();

        setTitle("Registros");

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
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

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

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int linhaSelecionada = tbRegistros.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            var tableModel = (DefaultTableModel) tbRegistros.getModel();
            String data = (String) tableModel.getValueAt(linhaSelecionada, 0);
            Double temperatura = (Double) tableModel.getValueAt(linhaSelecionada, 1);
            Double umidade = (Double) tableModel.getValueAt(linhaSelecionada, 2);
            Double pressao = (Double) tableModel.getValueAt(linhaSelecionada, 3);
            
            Clima clima = new Clima(data, temperatura, umidade, pressao);
            
            model.removeClima(clima);
            tableModel.removeRow(linhaSelecionada);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    public JTable getTbRegistros() {
        return tbRegistros;
    }

    @Override
    public void update() {
        presenter.mostrarDados();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRegistros;
    // End of variables declaration//GEN-END:variables
}
