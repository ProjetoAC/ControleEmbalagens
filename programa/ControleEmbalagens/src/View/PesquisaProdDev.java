/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Embalagem;
import Model.Devolucao;
import Model.Produto;
import controller.DevolucaoController;
import controller.EmbalagemController;
import controller.ProdutoController;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j0nas
 */
public class PesquisaProdDev extends javax.swing.JInternalFrame {

    DevolucaoController dv;
    Devolucao devolucao;
    EmbalagemController ec;
    Embalagem e;
    ProdutoController pc;
    Produto produto;
    ArrayList<Devolucao> listaDevolucao;
    ArrayList<Embalagem> listaEmbalagem;
    private int idEmbalagem;

    public PesquisaProdDev() {
        initComponents();
        exibirDadosCadastros();
    }

    Principal telaPrincipal;
    Devolucao enviaDados;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnSeleciona = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesqProduto = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisar();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaActionPerformed
        selecionaDadosTabela();
    }//GEN-LAST:event_btnSelecionaActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        limparPesquisa(true);
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
        "Código", "Nome do Produto", "Embalagem"}, 0) {
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
        tblPesqProduto.getColumnModel().getColumn(1).setPreferredWidth(250);//nome
        tblPesqProduto.getColumnModel().getColumn(2).setPreferredWidth(250);//descricao

    }

    private void limparPesquisa(boolean pergunta) {
        boolean limpar = true;
        if (pergunta) {
            if (0 == JOptionPane.showConfirmDialog(rootPane, "Deseja Limpar os dados?", "Limpar Campos", JOptionPane.YES_NO_OPTION)) {
                txtPesquisa.setText("");
                exibirDadosCadastros();
                limpar = true;
            } else {
                limpar = false;
            }
        }
    }

    private void insereDadosTabela(Devolucao devolucao) {
        Object[] dados = new Object[3];
        dados[0] = devolucao.getIdDevolucao();
        dados[1] = carregaProdutoTabela(devolucao.getIdProduto());
        dados[2] = carregaEmbalagemTabela(produto.getIdEmbalagem());
        modeloTabela.addRow(dados);

    }

    private int getIdProdutoSelecionado() {
        int retorno = 0;
        retorno = Integer.parseInt(modeloTabela.getValueAt(tblPesqProduto.getSelectedRow(), 0).toString());
        //return Integer.parseInt(modeloTabela.getValueAt(tblProdutos.getSelectedRow(), 0).toString());
        return retorno;
    }

    public void exibirDadosCadastros() {
        modeloTabela();
        ArrayList<Devolucao> lista;
        if (dv == null) {
            dv = new DevolucaoController();
        }
        lista = dv.buscaCadastroDevolucao();

        for (int x = 0; x < lista.size(); x++) {
            Devolucao d = lista.get(x);
            insereDadosTabela(d);
        }
        listaDevolucao = lista;
    }

    private String carregaEmbalagemTabela(int idEmbalagem) {
        String embalagem = "";
        if (ec == null) {
            ec = new EmbalagemController();
        }
        return embalagem = pc.buscarEmbalagem(idEmbalagem);
    }

    private String carregaProdutoTabela(int idProduto) {
        String nome = "";
        if (pc == null) {
            pc = new ProdutoController();
        }
        return nome = pc.buscarNomeProduto(idProduto);
    }

    private void pesquisar() {
        modeloTabela();
        for (Devolucao d : listaDevolucao) {
            if (d.getNome().toLowerCase().contains(txtPesquisa.getText().toLowerCase())) {
                insereDadosTabela(d);
            }
        }
    }

    private void selecionaDadosTabela() {
        int id = getIdProdutoSelecionado();
        int a = 0, b = 0;
        String c = "", d = "";
        for (Devolucao d : listaDevolucao) {
            if (p.getIdProduto() == id) {
                a = p.getIdProduto();
                b = p.getIdEmbalagem();
                c = p.getNome();
                break;
            }
        }
        if (enviaDados == null) {
            enviaDados = new Devolucao();
        }
        Principal.jdpPrincipal.add(enviaDados);
        enviaDados.setVisible(true);
        telaPrincipal.centralizaForm(enviaDados);
        enviaDados.dadosPesquisProduto(a, b, c);
        this.dispose();
    }

}
