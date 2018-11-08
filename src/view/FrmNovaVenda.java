package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.sun.glass.events.KeyEvent;

import dao.AlunoDao;
import dao.ProdutoDao;
import dao.VendaDao;
import model.Aluno;
import model.Produto;
import model.Venda;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmNovaVenda extends javax.swing.JFrame {

    private Venda venda = null;
    public Aluno aluno = new Aluno();
    Float valorTot = new Float(0);
    // private VendaDao vendaDAO = new VendaDAO();

    public FrmNovaVenda() {
        initComponents();
        
        //carregarTable();

        /*DefaultTableModel modelo = (DefaultTableModel) produtoTable.getModel();
        produtoTable.setRowSorter(new TableRowSorter(modelo));
         */
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date hoje = new Date();
        Calendar cal = Calendar.getInstance();
        tfData.setText(df.format(cal.getTime()));
           
    }
    
    public FrmNovaVenda getFrame() {
    	return this;
    }

    /*
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) produtoTable.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getDescricao(),
                p.getPreco()
            });

        }

    }
    public void readJTableForDesc(String desc) {
        
        DefaultTableModel modelo = (DefaultTableModel) produtoTable.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto p : pdao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getDescricao(),
                p.getPreco()
                
            });

        }

    }
    
    public void readJTableForCod(Integer cod) {
        
        DefaultTableModel modelo = (DefaultTableModel) produtoTable.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto p : pdao.readForDesc(cod)) {

            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getDescricao(),
                p.getPreco()
                
            });

        }

    }*/
    
    public void setRa(String text) {
    	tfRa.setText(text);
    }
    
    public void setNome(String text) {
    	tfAluno.setText(text);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lbAluno = new javax.swing.JLabel();
        tfAluno = new javax.swing.JTextField();
        tfRa = new javax.swing.JTextField();
        lbRa = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tfValorTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        produtoTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfCodProd = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itensTable = new javax.swing.JTable();
        btRemoverItem = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Venda");
        setBackground(new java.awt.Color(153, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        lbAluno.setText("Aluno:");

        lbRa.setText("RA:");

        lbData.setText("Data:");

        tfData.setEditable(false);
        
        btBuscarAluno = new JButton("");
        btBuscarAluno.setIcon(new ImageIcon(FrmNovaVenda.class.getResource("/images/buscar.png")));
        btBuscarAluno.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FrmBuscarAluno buscar = new FrmBuscarAluno(2, getFrame());
        		
        	}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lbAluno)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfAluno, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btBuscarAluno))
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(lbRa)
        						.addGap(18)
        						.addComponent(tfRa, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addComponent(lbData)
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap(14, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btBuscarAluno)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lbData)
        						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(6)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lbRa)
        						.addComponent(tfRa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tfAluno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbAluno))))
        			.addGap(22))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        tfValorTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 0, 0));
        jLabel4.setText("R$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfValorTotal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar Venda");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finalizar.png"))); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        lbDescricao.setText("Descrição:");

        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });
        
        tfDescricao.addKeyListener(new KeyAdapter() {		
			
			
			
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					buscarProduto();
				
			}
		});
        

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        btAdd.setText("Adicionar item a venda");
        btAdd.setActionCommand("Adicionar item a venda");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

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

        produtoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Produto", "Descrição", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoTableMouseClicked(evt);
            }
        });
        produtoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                produtoTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(produtoTable);
        if (produtoTable.getColumnModel().getColumnCount() > 0) {
            produtoTable.getColumnModel().getColumn(0).setHeaderValue("ID_Produto");
            produtoTable.getColumnModel().getColumn(1).setHeaderValue("Descrição");
            produtoTable.getColumnModel().getColumn(2).setHeaderValue("Quantidade");
            produtoTable.getColumnModel().getColumn(3).setHeaderValue("Valor");
        }

        jLabel3.setText("Código do Produto:");

        tfCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addComponent(lbDescricao)
        					.addContainerGap(377, Short.MAX_VALUE))
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3)
        						.addComponent(tfCodProd, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
        					.addGap(0, 181, Short.MAX_VALUE))
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        						.addGroup(jPanel4Layout.createSequentialGroup()
        							.addComponent(btLimpar)
        							.addGap(18)
        							.addComponent(btBuscar)
        							.addGap(18)
        							.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
        					.addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tfCodProd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(16)
        			.addComponent(lbDescricao)
        			.addGap(4)
        			.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btBuscar)
        				.addComponent(btLimpar)
        				.addComponent(btAdd))
        			.addGap(18)
        			.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel4.setLayout(jPanel4Layout);

        jTabbedPane1.addTab("Dados do Produto", jPanel4);

        itensTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do produto", "Descrição", "Quantidade", "Valor Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itensTable);

        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btRemoverItem.setText("Remover Produto");
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(23, 23, 23)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(btRemoverItem)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );

        jTabbedPane1.addTab("Itens Venda", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btFinalizar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
                tfDescricao.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     buscarProduto();
    }//GEN-LAST:event_btBuscarActionPerformed
    
    private void buscarProduto() {
    	 ProdutoDao pDao = new ProdutoDao();
         
         DefaultTableModel dtm = (DefaultTableModel) produtoTable.getModel();
         produtoTable.setModel(dtm);
                 
         
         System.out.println(tfDescricao.getText());
         if (tfDescricao.getText() != null) {

             List<Produto> listProd = new ArrayList<>();
             listProd = pDao.readForDesc(tfDescricao.getText());
             int i = 0;
             for (Produto p : listProd) {
                 produtoTable.setValueAt(p.getCodProduto(), i, 0);
                 produtoTable.setValueAt(p.getDescricao(), i, 1);
                 produtoTable.setValueAt(p.getPreco(), i, 3);                
                 
                 dtm.addRow(new Object[] { null,null,null,null});
                 i++;
             }

         } else if(tfDescricao.getText() == null || tfDescricao.getText() == "") {
             JOptionPane.showMessageDialog(this, "Digite uma descrição.", "Alerta", JOptionPane.WARNING_MESSAGE);
         }
    }

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
    	VendaDao vDao = new VendaDao();
    	
    	if(tfRa.getText().equals("")) {
    		JOptionPane.showMessageDialog(this, "Digite o RA do aluno", "Alerta", JOptionPane.WARNING_MESSAGE);
    	}
    	else {
    		
    		AlunoDao aDao = new AlunoDao();
    		Venda venda = new Venda(aDao.readForRa(tfRa.getText()).get(0).getCodAluno(), valorTot);
    		    		
    		vDao.incluir(venda);
    		this.dispose();
    	}
    	
    	
    	   	
    	
        /* int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente finalizar a venda?");
        if (opcao == 0) {
            ProdutoDao produtoDAO = new ProdutoDao();
            for (ItemVenda iv : venda.getItens()) {
                try {
                    if (iv.getQuantidade() > produtoDAO.read(iv.getProduto().getCodProduto()).getQuantidade()) {
                        JOptionPane.showMessageDialog(this, "Impossível finalizar.\nProduto " + iv.getProduto() + " em falta no estoque.", "Alerta", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao consultar o estoque.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            salvar(true);
        }*/
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(produtoTable.getValueAt(produtoTable.getSelectedRow(), 2) != null){
        
        DefaultTableModel dtm = (DefaultTableModel) itensTable.getModel();
        itensTable.setModel(dtm);
        dtm.fireTableDataChanged();
        
        List<Produto> listProd = new ArrayList<>();
        Produto p = new Produto();
        
        Integer codprod = (Integer) produtoTable.getValueAt(produtoTable.getSelectedRow(), 0);
        String desc = (String) produtoTable.getValueAt(produtoTable.getSelectedRow(), 1);
        Integer quantidade = (Integer) produtoTable.getValueAt(produtoTable.getSelectedRow(), 2);
        Float valor = (Float) produtoTable.getValueAt(produtoTable.getSelectedRow(), 3);
        
        
        System.out.println(codprod + desc + quantidade + valor);
        
        Object[] o = new Object[4];
        o[0] = codprod;
        o[1] = desc;
        o[2] = quantidade;
        o[3] = valor;
        dtm.addRow(o);
        
        
        
        valorTot = valorTot + (quantidade*valor);
        DecimalFormat df = new DecimalFormat("0.00");
        df.format(valorTot);
        tfValorTotal.setText(valorTot.toString());
        }
        else {
             JOptionPane.showMessageDialog(this, "Digite uma quantidade.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        

    }//GEN-LAST:event_btAddActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void produtoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoTableKeyReleased
        /* if (produtoTable.getSelectedRow() != -1) {

            tfCodigo.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 1).toString());
            tfDescricao.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 2).toString());

        }*/
    }//GEN-LAST:event_produtoTableKeyReleased

    private void produtoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoTableMouseClicked
        /* if (evt.getClickCount() == 2) {
            int linhaSelecionada = itensTable.getSelectedRow();
            VendaTableModel vtm = (VendaTableModel) itensTable.getModel();
            venda = vtm.getRowValue(linhaSelecionada);

            if (venda.getSituacao() == Situacao.FINALIZADA) {
                JOptionPane.showMessageDialog(this, "Venda finalizada não pode ser alterada.", "Alerta", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (venda.getSituacao() == Situacao.CANCELADA) {
                JOptionPane.showMessageDialog(this, "Venda cancelada não pode ser alterada.", "Alerta", JOptionPane.WARNING_MESSAGE);
                return;
            }

            tfAluno.setValue(venda.getAluno());
            ftData.setValue(venda.getDataVenda());
            ftValorTotal.setValue(venda.getValorTotal());

            ItemVendaTableModel ivtm = (ItemVendaTableModel) itensTable.getModel();
            ivtm.setDados(venda.getItens());

            habilitarFormulario(true);
        }*/

 /* if (produtoTable.getSelectedRow() != -1) {

            tfCodigo.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 1).toString());
            tfDescricao.setText(produtoTable.getValueAt(produtoTable.getSelectedRow(), 2).toString());

        }*/
    }//GEN-LAST:event_produtoTableMouseClicked

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void tfCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodProdActionPerformed

    private void tfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorTotalActionPerformed

    /*public void setAluno(Aluno aluno) {
        tfDescricao.setValue(aluno);
    }

    public void setProduto(Produto produto) {
        tfDescricao.setValue(produto);
        tfValorUnitario.setValue(produto.getValorTotal());
    }

    private void habilitarFormulario(boolean ativo) {
        btCancelar.setEnabled(ativo);
        btFinalizar.setEnabled(ativo);
        btBuscarRa.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        tfRa.setEnabled(ativo);
        tfAluno.setEnabled(ativo);
        btBucarAluno.setEnabled(ativo);
        ftData.setEnabled(ativo);
        ftValorTotal.setEnabled(ativo);
        btBuscar.setEnabled(ativo);
        spQuantidade.setEnabled(ativo);
        tfValorUnitario.setEnabled(ativo);
        btAdd.setEnabled(ativo);
        btRemover.setEnabled(ativo);
        btRemoverItem.setEnabled(ativo);
        itensTable.setEnabled(!ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        venda = null;
        tfAluno.setValue(null);
        ftData.setValue(new Date());
        ftValorTotal.setValue(new Double(0));
        tfDescricao.setValue(null);
        spQuantidade.setValue(1);
        tfValorUnitario.setValue(new Double(0));
        itensTable.setModel(new ItemVendaTableModel());
        limpaFormularioItens();
    }

    private void limpaFormularioItens() {
        tfDescricao.setValue(null);
        spQuantidade.setValue(1);
        tfValorUnitario.setValue(new Double(0));
    }

    private boolean validarFormulario() {
        if (tfAluno.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Cliente inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            tfAluno.requestFocus();
            return false;
        }
        if (venda.quantidadeItens() == 0) {
            JOptionPane.showMessageDialog(this, "Quantidade de itens inválida.", "Alerta", JOptionPane.WARNING_MESSAGE);
            jPanel4.setSelectedIndex(1);
            return false;
        }
        return true;
    }

    private boolean validarFormularioItens() {
        if (tfDescricao.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Produto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            tfDescricao.requestFocus();
            return false;
        }
        return true;
    }

    private void carregarGrade() {
        VendaTableModel tm = (VendaTableModel) produtoTable.getModel();
        try {
            tm.setDados(vendaDAO.read());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void salvar(boolean finalizar) {
        if (validarFormulario()) {
            venda.setAluno((Aluno) tfAluno.getValue());
            venda.setDataVenda((Date) ftData.getValue());
            if (finalizar) {
                venda.setSituacao("F");
            } else {
                venda.setSituacao("A");
            }

            if (venda.getCodVenda() == 0) {
                try {
                    vendaDAO.incluir(venda);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir a venda.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }}*/
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmNovaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JTable itensTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbAluno;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbRa;
    private javax.swing.JTable produtoTable;
    private javax.swing.JTextField tfAluno;
    private javax.swing.JTextField tfCodProd;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfRa;
    private javax.swing.JTextField tfValorTotal;
    private JButton btBuscarAluno;
}
