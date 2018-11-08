package sitemacantina;

import java.io.IOException;
import view.FrmAlterarProduto;
import view.FrmConsultarProduto;
import view.FrmConsultarSaldo;
import view.FrmCadastrarProduto;
import view.FrmBuscarAluno;
import view.FrmBuscarVenda;
import view.FrmInserirSaldo;
import view.FrmNovaVenda;


public class TelaPrincipal extends javax.swing.JFrame {

 
    public TelaPrincipal() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbfundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        menuWeb = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuAluno = new javax.swing.JMenu();
        menuBuscaAluno = new javax.swing.JMenuItem();
        menuConsultarSaldo = new javax.swing.JMenuItem();
        menuInserir = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuCadastrarProd = new javax.swing.JMenuItem();
        menuAlterarProd = new javax.swing.JMenuItem();
        menuConsultarProd = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuNovaVenda = new javax.swing.JMenuItem();
        menuBuscarVenda = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(114, 193, 78));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(10,10);
        setMinimumSize(null);
        setName("lbfundo"); // NOI18N
        setSize(new java.awt.Dimension(320, 520));

        jPanel1.setBackground(new java.awt.Color(114, 193, 78));

        jPanel2.setBackground(new java.awt.Color(114, 193, 78));

        lbfundo.setBackground(new java.awt.Color(114, 193, 78));
        lbfundo.setForeground(new java.awt.Color(114, 193, 78));
        lbfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_cantina_projeto.jpg"))); // NOI18N
        lbfundo.setToolTipText("");
        lbfundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbfundo.setFocusable(false);
        lbfundo.setMaximumSize(null);
        lbfundo.setNextFocusableComponent(jPanel1);
        lbfundo.setRequestFocusEnabled(false);
        lbfundo.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbfundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbfundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon_Config.png"))); // NOI18N
        menuOpcoes.setText("Opções");

        menuWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_web.png"))); // NOI18N
        menuWeb.setText("Ir para Web");
        menuWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuWebActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuWeb);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_sair.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSair);

        jMenuBar1.add(menuOpcoes);

        menuAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_aluno.png"))); // NOI18N
        menuAluno.setText("Alunos");

        menuBuscaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_buscarAluno.png"))); // NOI18N
        menuBuscaAluno.setText("Buscar");
        menuBuscaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaAlunoActionPerformed(evt);
            }
        });
        menuAluno.add(menuBuscaAluno);

        menuConsultarSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_saldo.png"))); // NOI18N
        menuConsultarSaldo.setText("Consultar Saldo");
        menuConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarSaldoActionPerformed(evt);
            }
        });
        menuAluno.add(menuConsultarSaldo);

        menuInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_inserirSaldo.png"))); // NOI18N
        menuInserir.setText("Inserir Saldo");
        menuInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirActionPerformed(evt);
            }
        });
        menuAluno.add(menuInserir);

        jMenuBar1.add(menuAluno);

        menuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_produtos.png"))); // NOI18N
        menuProdutos.setText("Produtos");

        menuCadastrarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_cadastrarProduto.png"))); // NOI18N
        menuCadastrarProd.setText("Cadastrar");
        menuCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdActionPerformed(evt);
            }
        });
        menuProdutos.add(menuCadastrarProd);

        menuAlterarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_alterarProduto.png"))); // NOI18N
        menuAlterarProd.setText("Alterar/Excluir");
        menuAlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarProdActionPerformed(evt);
            }
        });
        menuProdutos.add(menuAlterarProd);

        menuConsultarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_consultarProduto.png"))); // NOI18N
        menuConsultarProd.setText("Consultar");
        menuConsultarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarProdActionPerformed(evt);
            }
        });
        menuProdutos.add(menuConsultarProd);

        jMenuBar1.add(menuProdutos);

        menuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_vendas2.png"))); // NOI18N
        menuVenda.setText("Vendas");

        menuNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_novaVenda.png"))); // NOI18N
        menuNovaVenda.setText("Nova");
        menuNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovaVendaActionPerformed(evt);
            }
        });
        menuVenda.add(menuNovaVenda);

        menuBuscarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_buscarVenda.png"))); // NOI18N
        menuBuscarVenda.setText("Buscar");
        menuBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarVendaActionPerformed(evt);
            }
        });
        menuVenda.add(menuBuscarVenda);

        jMenuBar1.add(menuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuWebActionPerformed
         //link para acessar pagina web
        try {
            Runtime.getRuntime().exec("cmd.exe /C start "
                    + "http://www.google.com/");
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_menuWebActionPerformed

    private void menuAlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarProdActionPerformed
        FrmAlterarProduto telaAltProd = new FrmAlterarProduto();
        telaAltProd.setVisible(true);
        telaAltProd.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuAlterarProdActionPerformed

    private void menuConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarSaldoActionPerformed
        FrmConsultarSaldo telaSaldo = new FrmConsultarSaldo();
        telaSaldo.setVisible(true);
        telaSaldo.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuConsultarSaldoActionPerformed

    private void menuCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdActionPerformed
        FrmCadastrarProduto telacadastroProd = new FrmCadastrarProduto();
        telacadastroProd.setVisible(true);
        telacadastroProd.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuCadastrarProdActionPerformed

    private void menuConsultarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarProdActionPerformed
        FrmConsultarProduto telaConsultarProd = new FrmConsultarProduto();
        telaConsultarProd.setVisible(true);
        telaConsultarProd.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuConsultarProdActionPerformed

    private void menuBuscaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaAlunoActionPerformed
        FrmBuscarAluno telaBuscarAluno = new FrmBuscarAluno(1);
        telaBuscarAluno.setVisible(true);
        telaBuscarAluno.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuBuscaAlunoActionPerformed

    private void menuInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirActionPerformed
        FrmInserirSaldo telaInserir = new FrmInserirSaldo();
        telaInserir.setVisible(true);
        telaInserir.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuInserirActionPerformed

    private void menuNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovaVendaActionPerformed
        FrmNovaVenda telaNovaVenda = new FrmNovaVenda();
        telaNovaVenda.setVisible(true);
        telaNovaVenda.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuNovaVendaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarVendaActionPerformed
        FrmBuscarVenda telaBuscarVenda = new FrmBuscarVenda(2);
        telaBuscarVenda.setVisible(true);
        telaBuscarVenda.setLocationRelativeTo(this);
    }//GEN-LAST:event_menuBuscarVendaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbfundo;
    private javax.swing.JMenuItem menuAlterarProd;
    private javax.swing.JMenu menuAluno;
    private javax.swing.JMenuItem menuBuscaAluno;
    private javax.swing.JMenuItem menuBuscarVenda;
    private javax.swing.JMenuItem menuCadastrarProd;
    private javax.swing.JMenuItem menuConsultarProd;
    private javax.swing.JMenuItem menuConsultarSaldo;
    private javax.swing.JMenuItem menuInserir;
    private javax.swing.JMenuItem menuNovaVenda;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenuItem menuWeb;
    // End of variables declaration//GEN-END:variables
}
