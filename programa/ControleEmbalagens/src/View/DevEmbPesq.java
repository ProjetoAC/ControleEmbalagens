
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

public class DevEmbPesq extends javax.swing.JInternalFrame {

    DevolucaoController dv;
    Devolucao dev;
    EmbalagemController ec;
    Embalagem e;
    ProdutoController pc;
    Produto produto;
    ArrayList<Devolucao> listaDevolucao;
    ArrayList<Embalagem> listaEmbalagem;
    private int idEmbalagem;

    public DevEmbPesq() {
        initComponents();
        this.setTitle("Pesquisa de Produtos Utilizados/Devolvidos");
        desativaBotao();
        exibirDadosCadastros();
    }

    Principal telaPrincipal;
    DevolucaoEmbalagem enviaDadosTabela;

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(btnSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (tblPesqProduto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Favor selecione uma linha na tabela!", "AVISO!", JOptionPane.WARNING_MESSAGE);
        } else {
            selecionaDadosTabela();
        }
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
        "Código", "Nome do Produto", "Data", "Quantidade", "Devolvido", "Data Devolução"}, 0) {
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
        tblPesqProduto.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblPesqProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblPesqProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblPesqProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
        tblPesqProduto.getColumnModel().getColumn(5).setPreferredWidth(130);
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
        Object[] dados = new Object[6];
        dados[0] = devolucao.getIdDevolucao();
        dados[1] = carregaProdutoTabela(devolucao.getIdProduto());
        dados[2] = devolucao.getData();
        dados[3] = devolucao.getQuantidade();
        dados[4] = devolucao.getFlagDevolucao();
        dados[5] = devolucao.getDataEntrega();
        modeloTabela.addRow(dados);

    }

    private int getIdDevolucaoSelecionado() {
        return Integer.parseInt(modeloTabela.getValueAt(tblPesqProduto.getSelectedRow(), 0).toString());
    }

    public void exibirDadosCadastros() {
        modeloTabela.getDataVector().removeAllElements();
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

    private String carregaProdutoTabela(int idProduto) {
        String nome = "";
        if (pc == null) {
            pc = new ProdutoController();
        }
        return nome = pc.buscarNomeProduto(idProduto);
    }

    private void pesquisar() {
        modeloTabela();
    }

    private void selecionaDadosTabela() {
        int id = getIdDevolucaoSelecionado();
        int a = 0, b = 0;
        char c = ' ';
        String d = "";
        for (Devolucao dev : listaDevolucao) {
            if (dev.getIdDevolucao() == id) {
                a = dev.getIdDevolucao();
                b = dev.getIdProduto();
                c = dev.getFlagDevolucao();
                d = dev.getDataEntrega();
                break;
            }
        }
        if (enviaDadosTabela == null) {
            enviaDadosTabela = new DevolucaoEmbalagem();
        }
        Principal.jdpPrincipal.add(enviaDadosTabela);
        enviaDadosTabela.setVisible(true);
        telaPrincipal.centralizaForm(enviaDadosTabela);
        enviaDadosTabela.selecionaDadosTabela(a, b, c, d);
        this.dispose();
    }
}
