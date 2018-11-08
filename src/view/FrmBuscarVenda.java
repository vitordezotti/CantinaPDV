
package view;

import dao.AlunoDao;
import dao.VendaDao;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Venda;
import model.Aluno;



public class FrmBuscarVenda extends javax.swing.JFrame {
    
    Venda venda;
    VendaDao vendaDao;

    public FrmBuscarVenda(int i) {
        initComponents();
        /*DefaultTableModel modelo = (DefaultTableModel) vendaTable.getModel();
        vendaTable.setRowSorter(new TableRowSorter(modelo));*/
        carregarTable();
         
    }
    
     private void carregarTable() {
        try {
            VendaDao produtoDAO = new VendaDao();
            DefaultTableModel vtm = new DefaultTableModel();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar table.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) vendaTable.getModel();
        modelo.setNumRows(0);
        VendaDao vdao = new VendaDao();

        for (Venda v : vdao.read()) {

            modelo.addRow(new Object[]{
                v.getCodVenda(),
                //v.getRa(),
                v.getValorTotal(),
                v.getDataVenda(),
                v.getSituacao(),
                v.getFormaPagamento()
            });

        }

    }
    
    public void readJTableForRa(String ra) {
        
        DefaultTableModel modelo = (DefaultTableModel) vendaTable.getModel();
        modelo.setNumRows(0);
        AlunoDao adao = new AlunoDao();

        for (Aluno a : adao.readForRa(ra)) {

            modelo.addRow(new Object[]{
                a.getCodAluno(),
                a.getRa(),
                a.getNome()
            });

        }

    }
    public void readJTableForData(String data) {
        
        DefaultTableModel modelo = (DefaultTableModel) vendaTable.getModel();
        modelo.setNumRows(0);
        VendaDao vdao = new VendaDao();

        for (Venda v : vdao.readForData(data)) {

            modelo.addRow(new Object[]{
                v.getCodVenda(),
                //v.getRa(),
                v.getValorTotal(),
                v.getDataVenda(),
                v.getSituacao(),
                v.getFormaPagamento()
                
            });

        }

    }
*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendaTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbData = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        lbRA = new javax.swing.JLabel();
        tfRa = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Saldo");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        vendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Data", "RA", "Valor Total", "Forma de Pagamento", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendaTableMouseClicked(evt);
            }
        });
        vendaTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendaTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(vendaTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Saldo"));

        lbData.setText("Data:");

        lbRA.setText("RA:");

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tfRa, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbData)
                            .addComponent(lbRA)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRA)
                .addGap(4, 4, 4)
                .addComponent(tfRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfData.setText("");
        tfRa.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void vendaTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendaTableKeyReleased
        if (vendaTable.getSelectedRow() != -1) {

            tfData.setText(vendaTable.getValueAt(vendaTable.getSelectedRow(), 1).toString());
            tfRa.setText(vendaTable.getValueAt(vendaTable.getSelectedRow(), 2).toString());

        }
    }//GEN-LAST:event_vendaTableKeyReleased

    private void vendaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendaTableMouseClicked
     /* if (evt.getClickCount() == 2) {
            DefaultTableModel vtm = new DefaultTableModel();
                    
            int linhaSelecionada = vendaTable.getRowSorter().convertRowIndexToModel(vendaTable.getSelectedRow());
            Venda venda = vtm.get
      }else {
                JOptionPane.showMessageDialog(this, "Campo de destino inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }*/
      
        /* if (vendaTable.getSelectedRow() != -1) {

            tfData.setText(vendaTable.getValueAt(vendaTable.getSelectedRow(), 1).toString());
            tfRa.setText(vendaTable.getValueAt(vendaTable.getSelectedRow(), 2).toString());
        }*/
    }//GEN-LAST:event_vendaTableMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        TableRowSorter rs = (TableRowSorter) vendaTable.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfData.getText(), 0, 1));
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfRa.getText(), 0, 1));
        
        /*readJTableForData(tfData.getText());
        readJTableForRa(tfRa.getText());*/
    }//GEN-LAST:event_btBuscarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscarVenda(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbRA;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfRa;
    private javax.swing.JTable vendaTable;
    // End of variables declaration//GEN-END:variables
}
