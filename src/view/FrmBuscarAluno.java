
package view;

import dao.AlunoDao;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Aluno;


public class FrmBuscarAluno extends javax.swing.JFrame {
    
    Aluno aluno;
    AlunoDao alunoDao;
    FrmNovaVenda parentFrame;
    
    public Aluno getAluno() {
		return this.aluno;
	}

	

	public FrmBuscarAluno(int i, FrmNovaVenda frame) {
        initComponents();  
        this.parentFrame = frame;
       
        
                
        //Habilita a visualizaÃ§Ã£o do botÃ£o Selecionar
        if(i==1){
        btSelecionar.setVisible(false);
        }
        else{
        btSelecionar.setVisible(true);
        }
        this.setVisible(true);
        
        
        
    }
    
    public FrmBuscarAluno(int i) {
        initComponents();  
                        
        //Habilita a visualizaÃ§Ã£o do botÃ£o Selecionar
        if(i==1){
        btSelecionar.setVisible(false);
        }
        else{
        btSelecionar.setVisible(true);
        }
        this.setVisible(true);
    }
    
    
    
    /*private void carregarTable() {
        try {
            AlunoDao adao = new AlunoDao();
           // AlunoTableModel atm = ;//(AlunoTableModel)(alunoTable.get);
             //new AlunoTableModel().setDados(adao.read());
             //System.out.println((adao.read()).get(1));
             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        alunoTable.repaint();
    }*/
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alunoTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbRA = new javax.swing.JLabel();
        tfRa = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btBuscarAluno = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Aluno");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        alunoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "RA", "CPF", "EndereÃ§o", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(alunoTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Aluno"));

        lbNome.setText("Nome:");

        lbRA.setText("RA:");

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btBuscarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        btBuscarAluno.setText("Buscar");
        btBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAlunoActionPerformed(evt);
            }
        });

        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finalizar.png"))); // NOI18N
        btSelecionar.setText("Selecionar Aluno");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
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
                        .addComponent(btBuscarAluno)
                        .addGap(18, 18, 18)
                        .addComponent(btSelecionar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbRA)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRA)
                .addGap(4, 4, 4)
                .addComponent(tfRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscarAluno)
                    .addComponent(btSelecionar)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfNome.setText("");
        tfRa.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAlunoActionPerformed
       /* TableRowSorter rs = (TableRowSorter) alunoTable.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfNome.getText(), 0, 1));
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfRa.getText(), 0, 2));*/
       
       AlunoDao aDao = new AlunoDao();
        
        DefaultTableModel dtm = (DefaultTableModel) alunoTable.getModel();
        alunoTable.setModel(dtm);
                
        List<Aluno> listAluno = new ArrayList<>();
        System.out.println(tfNome.getText());
        if (tfNome.getText() != null) {
        	        	
            listAluno = aDao.readForNome(tfNome.getText());
            int i = 0;
            for (Aluno a : listAluno) {
                alunoTable.setValueAt(a.getNome(), i, 0);
                alunoTable.setValueAt(a.getRa(), i, 1);
                alunoTable.setValueAt(a.getCpf(), i, 2);
                alunoTable.setValueAt(a.getEndereco(), i, 3);
                alunoTable.setValueAt(a.getTelefone(), i, 4);
                alunoTable.setValueAt(a.getEmail(), i, 5);
                
                dtm.addRow(new Object[] { null,null,null,null,null,null});
                i++;
            }

        } else if(tfNome.getText() == null || tfNome.getText() == "") {
            JOptionPane.showMessageDialog(this, "Digite um nome.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btBuscarAlunoActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
    	
    	String nome = (String) alunoTable.getValueAt(alunoTable.getSelectedRow(), 0);
    	String ra = (String) alunoTable.getValueAt(alunoTable.getSelectedRow(), 1);
//    	Aluno alunoSelecionado = new Aluno();
//    	alunoSelecionado.setRa(ra);
//    	alunoSelecionado.setNome(nome);  	
    	
    		
    	if(!alunoTable.getSelectionModel().isSelectionEmpty()) {
    	this.dispose();
    	}
    	
    	sendSelected(ra, nome);
    	
    	
    	
        
    }//GEN-LAST:event_btSelecionarActionPerformed
    
    public void sendSelected(String ra, String nome) {
    	
    	parentFrame.setRa(ra);
    	parentFrame.setNome(nome);
    	
    }
    


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuscarAluno(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alunoTable;
    private javax.swing.JButton btBuscarAluno;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRA;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRa;
    // End of variables declaration//GEN-END:variables
}
