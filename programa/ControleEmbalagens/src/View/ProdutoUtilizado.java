package View;

import Model.Devolucao;
import Model.Empresa;
import Model.Pessoa;
import controller.DevolucaoController;
import controller.EmpresaController;
import controller.PessoaController;
import controller.ProdutoController;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ProdutoUtilizado extends javax.swing.JInternalFrame {

    ProdutoController pc;
    Devolucao devolucao;
    DevolucaoController dv;
    private int idProduto, idDevolucao;
    ArrayList<Pessoa> listaPessoa;
    ArrayList<Empresa> listaEmpresa;
    PessoaController pec;
    EmpresaController ec;

    public ProdutoUtilizado() {
        initComponents();
        this.setTitle("Lançamento de Embalagens Vazias");
        desativaBotao();
        carregaNomePessoa();
        carregaNomeEmpresa();
    }

    Principal telaPrincipal;
    ProdUtiPesqProd telaPesqProduto;
    ProdUtiPesq telaPesqTabela;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnPesqP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEmbalagem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtde = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtClasseTox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbEmpresa = new javax.swing.JComboBox<>();
        jcbPessoa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnPesq1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        btnGravar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();

        setClosable(true);

        jLabel3.setText("Produto:");

        txtProduto.setEditable(false);

        btnPesqP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnPesqP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesqP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqPActionPerformed(evt);
            }
        });

        jLabel4.setText("Embalagem:");

        txtEmbalagem.setEditable(false);

        jLabel5.setText("Data:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("");

        jLabel6.setText("Quantidade:");

        txtQtde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel1.setText("Classe Toxicológica:");

        txtClasseTox.setEditable(false);

        jLabel7.setText("Empresa:");

        jLabel2.setText("Nome:");

        btnPesq1.setText("Pesquisar");
        btnPesq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesq1ActionPerformed(evt);
            }
        });

        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnGravar1.setText("Gravar");
        btnGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmbalagem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesqP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtClasseTox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jcbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesq1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClasseTox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar1)
                    .addComponent(btnExcluir1)
                    .addComponent(btnLimpar1)
                    .addComponent(btnPesq1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setText("Sair");
        btnSair.setPreferredSize(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesqPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqPActionPerformed
        if (telaPesqProduto == null) {
            telaPesqProduto = new ProdUtiPesqProd();
        }
        Principal.jdpPrincipal.add(telaPesqProduto);
        telaPesqProduto.setVisible(true);
        telaPrincipal.centralizaForm(telaPesqProduto);
        this.dispose();
    }//GEN-LAST:event_btnPesqPActionPerformed

    private void btnPesq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesq1ActionPerformed
        if (telaPesqTabela == null) {
            telaPesqTabela = new ProdUtiPesq();
        }
        Principal.jdpPrincipal.add(telaPesqTabela);
        telaPesqTabela.setVisible(true);
        telaPrincipal.centralizaForm(telaPesqTabela);
        this.dispose();
    }//GEN-LAST:event_btnPesq1ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        excluirDados();
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravar1ActionPerformed
        if (!txtData.getText().equals("") && !txtQtde.getText().equals("")) {
            gravarDados();
        } else {
            JOptionPane.showMessageDialog(null, "Dados informados não são válidos!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            btnPesqP.grabFocus();
        }
    }//GEN-LAST:event_btnGravar1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnGravar1;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesq1;
    private javax.swing.JButton btnPesqP;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbEmpresa;
    private javax.swing.JComboBox<String> jcbPessoa;
    private javax.swing.JTextField txtClasseTox;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmbalagem;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JFormattedTextField txtQtde;
    // End of variables declaration//GEN-END:variables

    private void desativaBotao() {
        this.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        Container norteh = (Container) ui.getNorthPane();
        norteh.remove(0);
        norteh.validate();
        norteh.repaint();
    }

    private void limparCampos() {
        jcbPessoa.removeAllItems();
        carregaNomePessoa();
        txtProduto.setText("");
        txtEmbalagem.setText("");
        txtClasseTox.setText("");
        txtQtde.setText("");
        txtData.setText("");
        btnPesqP.grabFocus();
    }

    public void excluirDados() {
        if (0 == JOptionPane.showConfirmDialog(rootPane, "Deseja excluir essas informações?", "Excluir", JOptionPane.YES_NO_OPTION)) {
            if (new DevolucaoController().excluirCadastroDevolucao(idDevolucao)) {
                limparCampos();
            }
        }
    }

    private void gravarDados() {
        if (devolucao == null) {
            devolucao = new Devolucao();
        }
        if (dv == null) {
            dv = new DevolucaoController();
        }
        if (pec == null) {
            pec = new PessoaController();
        }
        if (ec == null) {
            ec = new EmpresaController();
        }
        devolucao.setIdDevolucao(idDevolucao);
        devolucao.setIdEmpresa(ec.buscaIdNomEmpresa(jcbEmpresa.getSelectedItem().toString()));
        devolucao.setIdPessoa(pec.buscaIdNomePessoa(jcbPessoa.getSelectedItem().toString()));
        devolucao.setIdProduto(idProduto);
        devolucao.setData(txtData.getText());
        devolucao.setQuantidade(Integer.parseInt(txtQtde.getText()));

        if (dv.insereCadastroDevolucao(devolucao)) {
            JOptionPane.showMessageDialog(this, "Cadastro Gravadao com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Problema ao gravar dados", "Erro", JOptionPane.ERROR_MESSAGE);
            txtData.grabFocus();
        }
    }

    private void carregaNomePessoa() {
        if (pec == null) {
            pec = new PessoaController();
        }
        listaPessoa = pec.buscaCadastroPessoa();
        for (Pessoa p : listaPessoa) {
            jcbPessoa.addItem(p.getNome());
        }
    }

    private void carregaNomeEmpresa() {
        if (ec == null) {
            ec = new EmpresaController();
        }
        listaEmpresa = ec.buscaCadastroEmpresa();
        for (Empresa e : listaEmpresa) {
            jcbEmpresa.addItem(e.getNome());
        }
    }

    public void dadosPesquisProduto(int a, int b, String c, String d) {
        idProduto = a;
        if (pc == null) {
            pc = new ProdutoController();
        }
        txtEmbalagem.setText(pc.buscarEmbalagem(b));
        txtProduto.setText(c);
        txtClasseTox.setText(d);
        jcbPessoa.grabFocus();
    }

    public void selecionaDadosTabela(int a, int b, int c, String d) {
        if (dv == null) {
            dv = new DevolucaoController();
        }
        idDevolucao = a;
        idProduto = b;
        jcbPessoa.setSelectedItem(dv.buscarNomePessoa(idDevolucao));
        jcbEmpresa.setSelectedItem(dv.buscarNomeEmpresa(idDevolucao));
        txtProduto.setText(dv.buscarNomeProduto(idDevolucao));
        txtEmbalagem.setText(dv.buscarDescricaoEmbalagem(idProduto));
        txtClasseTox.setText(dv.buscarClasseTox(idDevolucao));
        txtQtde.setText(String.valueOf(c));
        txtData.setText(d);
        btnPesqP.grabFocus();
    }
}
