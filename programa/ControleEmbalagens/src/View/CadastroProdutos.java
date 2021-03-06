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

public class CadastroProdutos extends javax.swing.JInternalFrame {

    ProdutoController pc;
    Produto produto;
    EmbalagemController ec;
    Embalagem e;
    ArrayList<Produto> listaProdutos;
    ArrayList<Embalagem> listaEmbalagem;
    private int idEmbalagem;

    public CadastroProdutos() {
        initComponents();
        this.setTitle("Cadastro de Produtos");
        desativaBotao();
        exibirDadosCadastros();
        carregaEmbalagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbClasseTox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbEmbalagem = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nome:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        jLabel2.setText("Descrição:");

        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
            }
        });

        jLabel3.setText("Classe Toxicológica:");

        jcbClasseTox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe I - extremamente tóxico – cor vermelha", "Classe II - altamente tóxico – cor amarela", "Classe III - medianamente tóxico – cor azul", "Classe IV – pouco tóxico – cor verde" }));
        jcbClasseTox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClasseToxActionPerformed(evt);
            }
        });

        jLabel4.setText("Embalagem:");

        jcbEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEmbalagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbClasseTox, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbClasseTox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if (!txtNome.getText().equals("") && !txtDesc.getText().equals("")) {
            gravarDados();
        } else {
            JOptionPane.showMessageDialog(null, "Dados informados não são válidos!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        carregaDadosCadastro();
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        String validar = "1234567890.,;-/?*&$%#@";
        if (validar.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        if (evt.getKeyChar() == 10) {
            txtDesc.grabFocus();
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
        String validar = ".,;-/?*&$#@";
        if (validar.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        if (evt.getKeyChar() == 10) {
            jcbEmbalagem.grabFocus();
        }
    }//GEN-LAST:event_txtDescKeyTyped

    private void jcbEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEmbalagemActionPerformed
        jcbClasseTox.grabFocus();
    }//GEN-LAST:event_jcbEmbalagemActionPerformed

    private void jcbClasseToxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClasseToxActionPerformed
        btnGravar.grabFocus();
    }//GEN-LAST:event_jcbClasseToxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbClasseTox;
    private javax.swing.JComboBox<String> jcbEmbalagem;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNome;
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
        tblProdutos.setModel(modeloTabela);
        tblProdutos.setAutoResizeMode(tblProdutos.AUTO_RESIZE_OFF);
        modeloTabela.setNumRows(0);
        ajustaTamanhoColunaTabela();
    }

    private void ajustaTamanhoColunaTabela() {
        tblProdutos.getColumnModel().getColumn(0).setMinWidth(0);
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblProdutos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);//nome
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(250);//descricao
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(250);//classetox
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(250);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtDesc.setText("");
        jcbEmbalagem.removeAllItems();
        carregaEmbalagem();
        jcbClasseTox.setSelectedIndex(0);
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
        return Integer.parseInt(modeloTabela.getValueAt(tblProdutos.getSelectedRow(), 0).toString());
    }

    public void exibirDadosCadastros() {
        modeloTabela.getDataVector().removeAllElements();
        modeloTabela();
        ArrayList<Produto> lista;
        if (pc == null) {
            pc = new ProdutoController();
        }
        lista = pc.buscaCadastroProduto();

        for (int x = 0; x < lista.size(); x++) {
            Produto p = lista.get(x);
            insereDadosTabela(p);
        }
        listaProdutos = lista;
    }

    private void carregaDadosCadastro() {
        int id = getIdProdutoSelecionado();
        String classe = "";
        for (int x = 0; x < listaProdutos.size(); x++) {
            Produto p = listaProdutos.get(x);
            if (id == p.getIdProduto()) {
                txtNome.setText(p.getNome());
                txtDesc.setText(p.getDescricao());
                classe = p.getClassetox();
                if (classe.equals("Classe I - extremamente tóxico – cor vermelha")) {
                    jcbClasseTox.setSelectedIndex(0);
                } else if (classe.equals("Classe II - altamente tóxico – cor amarela")) {
                    jcbClasseTox.setSelectedIndex(1);
                } else if (classe.equals("Classe III - medianamente tóxico – cor azul")) {
                    jcbClasseTox.setSelectedIndex(2);
                } else if (classe.equals("Classe IV – pouco tóxico – cor verde")) {
                    jcbClasseTox.setSelectedIndex(3);
                }
                if (p == null) {
                    p = new Produto();
                }
                jcbEmbalagem.removeAllItems();
                jcbEmbalagem.addItem(carregaEmbalagemTabela(p.getIdEmbalagem()));
                carregaEmbalagem();
                produto = p;
                break;
            }
        }
    }

    private void gravarDados() {
        if (produto == null) {
            produto = new Produto();
        }

        produto.setNome(txtNome.getText());
        produto.setDescricao(txtDesc.getText());
        produto.setClassetox(jcbClasseTox.getSelectedItem().toString());
        produto.setIdEmbalagem(buscaIdEmbalagem());

        if (pc == null) {
            pc = new ProdutoController();
        }

        if (pc.insereCadastroProduto(produto)) {
            JOptionPane.showMessageDialog(this, "Cadastro Gravadao com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Problema ao gravar dados", "Erro", JOptionPane.ERROR_MESSAGE);
            txtNome.grabFocus();
        }
        exibirDadosCadastros();
    }

    public void excluirDados() {
        if (0 == JOptionPane.showConfirmDialog(rootPane, "Deseja excluir essas informações?", "Excluir", JOptionPane.YES_NO_OPTION)) {
            if (pc == null) {
                pc = new ProdutoController();
            }
            pc.excluirCadastroProduto(getIdProdutoSelecionado());
            limparCampos();
            exibirDadosCadastros();
        }
    }

    private String carregaEmbalagemTabela(int idEmbalagem) {
        String embalagem = "";
        if (ec == null) {
            ec = new EmbalagemController();
        }
        return embalagem = pc.buscarEmbalagem(idEmbalagem);
    }

    private int buscaIdEmbalagem() {
        for (Embalagem e : listaEmbalagem) {
            if (jcbEmbalagem.getSelectedItem() == e.getDescricao()) {
                idEmbalagem = e.getIdEmbalagem();
            }
        }
        return idEmbalagem;
    }

    private void carregaEmbalagem() {
        if (ec == null) {
            ec = new EmbalagemController();
        }
        listaEmbalagem = ec.buscaCadastroEmbalagem();
        for (Embalagem e : listaEmbalagem) {
            jcbEmbalagem.addItem(e.getDescricao());
        }
    }

}
