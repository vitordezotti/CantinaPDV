
package view;

import dao.AlunoDao;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
//import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Aluno;

public class FrmConsultarSaldo extends javax.swing.JFrame {
    
    Aluno aluno;
    AlunoDao alunoDao;
    
    public FrmConsultarSaldo() {
        initComponents();
        carregarTable();
        /*DefaultTableModel modelo = (DefaultTableModel) saldoTable.getModel();
        saldoTable.setRowSorter(new TableRowSorter(modelo));
        readJTable();*/
    }
    
    
    private void carregarTable() {
        try {
            AlunoDao alunoDao = new AlunoDao();
//            sltm.setDados(alunoDao.read());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
     /*public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) saldoTable.getModel();
        modelo.setNumRows(0);
        AlunoDao adao = new AlunoDao();

        for (Aluno a : adao.read()) {

            modelo.addRow(new Object[]{
                a.getCodAluno(),
                a.getRa(),
                a.getNome(),
                a.getEndereco(),
                a.getTelefone(),
                a.getEmail()
            });

        }

    }
    public void readJTableForRa(String ra) {
        
        DefaultTableModel modelo = (DefaultTableModel) saldoTable.getModel();
        modelo.setNumRows(0);
        AlunoDao adao = new AlunoDao();

        for (Aluno a : adao.readForRa(ra)) {

            modelo.addRow(new Object[]{
                a.getCodAluno(),
                a.getRa(),
                a.getNome(),
                a.getEndereco(),
                a.getTelefone(),
                a.getEmail()
                
            });

        }

    }
    
    public void readJTableForNome(String nome) {
        
        DefaultTableModel modelo = (DefaultTableModel) saldoTable.getModel();
        modelo.setNumRows(0);
        AlunoDao adao = new AlunoDao();

        for (Aluno a : adao.readForRa(nome)) {

            modelo.addRow(new Object[]{
                a.getCodAluno(),
                a.getRa(),
                a.getNome(),
                a.getEndereco(),
                a.getTelefone(),
                a.getEmail()
                
            });

        }

    }*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbNomePesquisar = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbRA = new javax.swing.JLabel();
        tfRa = new javax.swing.JTextField();
        btLimparPesquisa = new javax.swing.JButton();
        btBuscarAluno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        saldoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Saldo");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Saldo"));

        lbNomePesquisar.setText("Nome:");

        lbRA.setText("RA:");

        btLimparPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_limpar.png"))); // NOI18N
        btLimparPesquisa.setText("Limpar");
        btLimparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparPesquisaActionPerformed(evt);
            }
        });

        btBuscarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btBuscarAluno.setText("Buscar");
        btBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addComponent(tfRa)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomePesquisar)
                            .addComponent(lbRA)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btLimparPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscarAluno)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbNomePesquisar)
                .addGap(4, 4, 4)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbRA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparPesquisa)
                    .addComponent(btBuscarAluno))
                .addGap(22, 22, 22))
        );

        saldoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "RA", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        saldoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saldoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(saldoTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparPesquisaActionPerformed
        tfNome.setText("");
        tfRa.setText("");
    }//GEN-LAST:event_btLimparPesquisaActionPerformed

    private void btBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAlunoActionPerformed
        TableRowSorter rs = (TableRowSorter) saldoTable.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfNome.getText(), 0, 1));
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfRa.getText(), 0, 1));
        
        /*readJTableForNome(tfNome.getText());
        readJTableForRa(tfRa.getText());*/
    }//GEN-LAST:event_btBuscarAlunoActionPerformed

    private void saldoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoTableMouseClicked
        if (evt.getClickCount() == 2) {
            int linhaSelecionada = saldoTable.getRowSorter().convertRowIndexToModel(saldoTable.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(this, "Campo de destino inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saldoTableMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarAluno;
    private javax.swing.JButton btLimparPesquisa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNomePesquisar;
    private javax.swing.JLabel lbRA;
    private javax.swing.JTable saldoTable;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRa;
    // End of variables declaration//GEN-END:variables
}
