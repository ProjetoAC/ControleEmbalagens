package View;

import Model.Embalagem;
import Model.Produto;
import controller.EmbalagemController;
import controller.ProdutoController;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class DevEmbPesqProd extends javax.swing.JInternalFrame {

    ProdutoController pc;
    EmbalagemController ec;
    Embalagem e;
    Produto produto;
    ArrayList<Produto> listaProdutos;
    ArrayList<Embalagem> listaEmbalagem;
    private int idEmbalagem;

    public DevEmbPesqProd() {
        initComponents();
        this.setTitle("Pesquisa de Produtos");
        desativaBotao();
        modeloTabela();
        exibirDadosCadastros();
    }

    Principal telaPrincipal;
    DevolucaoEmbalagem enviaDados;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesqProduto = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnSeleciona = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nome Produto:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPesqProduto.setAutoCreateRowSorter(true);
        tblPesqProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPesqProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblPesqProduto.setAutoscrolls(false);
        jScrollPane1.setViewportView(tblPesqProduto);

        btnSeleciona.setText("Selecionar");
        btnSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaActionPerformed(evt);
            }
        });

        btnLimpa.setText("Limpar");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleciona)
                    .addComponent(btnLimpa)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisar();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaActionPerformed
        if (tblPesqProduto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Favor selecione uma linha na tabela!", "AVISO!", JOptionPane.WARNING_MESSAGE);
        } else {
            selecionaDadosTabela();
        }
    }//GEN-LAST:event_btnSelecionaActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        limparPesquisa();
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSeleciona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesqProduto;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void desativaBotao() {
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        Container norteh = (Container) ui.getNorthPane();
        norteh.remove(0);
        norteh.validate();
        norteh.repaint();
    }

    DefaultTableModel modeloTabela = new DefaultTableModel(new Object[]{
        "Código", "Nome", "Descrição", "Classe Tox", "Embalagem"}, 0) {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    private void modeloTabela() {
        tblPesqProduto.setModel(modeloTabela);
        tblPesqProduto.setAutoResizeMode(tblPesqProduto.AUTO_RESIZE_OFF);
        modeloTabela.setNumRows(0);
        ajustaTamanhoColunaTabela();
    }

    private void ajustaTamanhoColunaTabela() {
        tblPesqProduto.getColumnModel().getColumn(0).setMinWidth(0);
        tblPesqProduto.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblPesqProduto.getColumnModel().getColumn(0).setMaxWidth(0);
        tblPesqProduto.getColumnModel().getColumn(1).setPreferredWidth(200);//nome
        tblPesqProduto.getColumnModel().getColumn(2).setPreferredWidth(250);//descricao
        tblPesqProduto.getColumnModel().getColumn(3).setPreferredWidth(250);//classetox
        tblPesqProduto.getColumnModel().getColumn(4).setPreferredWidth(250);
    }

    private void limparPesquisa() {
        txtPesquisa.setText("");
        exibirDadosCadastros();
        txtPesquisa.grabFocus();
    }

    private void insereDadosTabela(Produto produto) {
        Object[] dados = new Object[5];
        dados[0] = produto.getIdProduto();
        dados[1] = produto.getNome();
        dados[2] = produto.getDescricao();
        dados[3] = produto.getClassetox();
        dados[4] = carregaEmbalagemTabela(produto.getIdEmbalagem());
        modeloTabela.addRow(dados);
    }

    private int getIdProdutoSelecionado() {
        return Integer.parseInt(modeloTabela.getValueAt(tblPesqProduto.getSelectedRow(), 0).toString());
    }

    public void exibirDadosCadastros() {
        modeloTabela.getDataVector().removeAllElements();
        modeloTabela();
        ArrayList<Produto> lista;
        pc = new ProdutoController();
        lista = pc.buscaCadastroProduto();

        for (int x = 0; x < lista.size(); x++) {
            Produto p = lista.get(x);
            insereDadosTabela(p);
        }
        listaProdutos = lista;
    }

    private String carregaEmbalagemTabela(int idEmbalagem) {
        String embalagem = "";
        if (ec == null) {
            ec = new EmbalagemController();
        }
        return embalagem = pc.buscarEmbalagem(idEmbalagem);
    }

    private void pesquisar() {
        modeloTabela();
        for (Produto p : listaProdutos) {
            if (p.getNome().toLowerCase().contains(txtPesquisa.getText().toLowerCase())) {
                insereDadosTabela(p);
            }
        }
    }

    private void selecionaDadosTabela() {
        int id = getIdProdutoSelecionado();
        int a = 0, b = 0;
        for (Produto p : listaProdutos) {
            if (p.getIdProduto() == id) {
                a = p.getIdProduto();
                b = p.getIdEmbalagem();
                break;
            }
        }
        enviaDados = new DevolucaoEmbalagem();
        Principal.jdpPrincipal.add(enviaDados);
        enviaDados.setVisible(true);
        telaPrincipal.centralizaForm(enviaDados);
        enviaDados.dadosPesquisaProduto(a, b);
        this.dispose();
    }
}
