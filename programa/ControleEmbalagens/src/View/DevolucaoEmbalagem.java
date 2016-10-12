package View;

import Model.Devolucao;
import controller.DevolucaoController;
import controller.EmpresaController;
import controller.PessoaController;
import controller.ProdutoController;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class DevolucaoEmbalagem extends javax.swing.JInternalFrame {

    ProdutoController pc;
    DevolucaoController dc;
    PessoaController pec;
    EmpresaController ec;
    Devolucao d;
    int idDevolucao;

    public DevolucaoEmbalagem() {
        initComponents();
        this.setTitle("Lançamento de Devolução");
        desativaBotao();
    }

    Principal telaPrincipal;
    DevEmbPesq telaPesqProdutoDev;
    DevEmbPesqProd telaPesqProduto;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbSim = new javax.swing.JCheckBox();
        jcbNao = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtProduto = new javax.swing.JTextField();
        btnPesqP = new javax.swing.JButton();
        txtEmbalagem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnPesq = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();

        jLabel1.setText("Produto:");

        jLabel3.setText("Embalagem vazia foi devolvida:");

        jcbSim.setText("Sim");
        jcbSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbSimMouseClicked(evt);
            }
        });

        jcbNao.setSelected(true);
        jcbNao.setText("Não");
        jcbNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbNaoMouseClicked(evt);
            }
        });

        jLabel2.setText("Data Devolução:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setToolTipText("");

        txtProduto.setEditable(false);

        btnPesqP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnPesqP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesqP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqPActionPerformed(evt);
            }
        });

        txtEmbalagem.setEditable(false);

        jLabel7.setText("Embalagem:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesqP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmbalagem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSim)
                                .addGap(18, 18, 18)
                                .addComponent(jcbNao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnPesqP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbSim)
                    .addComponent(jcbNao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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

        btnPesq.setText("Pesquisar");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnPesq))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesqPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqPActionPerformed
        if (telaPesqProduto == null) {
            telaPesqProduto = new DevEmbPesqProd();
        }
        Principal.jdpPrincipal.add(telaPesqProduto);
        telaPesqProduto.setVisible(true);
        telaPrincipal.centralizaForm(telaPesqProduto);
        this.dispose();
    }//GEN-LAST:event_btnPesqPActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if (!txtData.getText().equals("") && jcbSim.isSelected()) {
            gravarDados();
        } else {
            JOptionPane.showMessageDialog(null, "Dados informados não são válidos!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            btnPesqP.grabFocus();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        if (telaPesqProdutoDev == null) {
            telaPesqProdutoDev = new DevEmbPesq();
        }
        Principal.jdpPrincipal.add(telaPesqProdutoDev);
        telaPesqProdutoDev.setVisible(true);
        telaPrincipal.centralizaForm(telaPesqProdutoDev);
        this.dispose();
    }//GEN-LAST:event_btnPesqActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jcbSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbSimMouseClicked
        if (jcbNao.isSelected()) {
            jcbSim.setSelected(true);
            jcbNao.setSelected(false);
        }
        if ((jcbSim.isSelected() == false) && (jcbNao.isSelected() == false)) {
            jcbSim.setSelected(true);
        }
    }//GEN-LAST:event_jcbSimMouseClicked

    private void jcbNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbNaoMouseClicked
        if (jcbSim.isSelected()) {
            jcbNao.setSelected(true);
            jcbSim.setSelected(false);
        }
        if ((jcbNao.isSelected() == false) && (jcbSim.isSelected() == false)) {
            jcbNao.setSelected(true);
        }
    }//GEN-LAST:event_jcbNaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnPesqP;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox jcbNao;
    private javax.swing.JCheckBox jcbSim;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmbalagem;
    private javax.swing.JTextField txtProduto;
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
        txtProduto.setText("");
        txtEmbalagem.setText("");
        jcbNao.setSelected(true);
        jcbSim.setSelected(false);
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
        char opcao = ' ';
        if (d == null) {
            d = new Devolucao();
        }
        if (dc == null) {
            dc = new DevolucaoController();
        }
        if (pec == null) {
            pec = new PessoaController();
        }
        if (ec == null) {
            ec = new EmpresaController();
        }
        if (jcbNao.isSelected()) {
            JOptionPane.showMessageDialog(null, "Opção selecionada inválida. Favor selecione SIM");
            jcbSim.grabFocus();
        } else {
            opcao = 'T';
        }

        //d.setIdProduto(idDevolucao);
        //d.setFlagDevolucao(opcao);
        //d.setData(txtData.getText());
        String data = txtData.getText();
        if (dc.atualizaDevolucao(idDevolucao, opcao, data)) {
            JOptionPane.showMessageDialog(this, "Cadastro Gravadao com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Problema ao gravar dados", "Erro", JOptionPane.ERROR_MESSAGE);
            txtData.grabFocus();
        }
    }

    public void dadosPesquisaProduto(int a, int b) {
        if (pc == null) {
            pc = new ProdutoController();
        }
        idDevolucao = a;
        txtProduto.setText(pc.buscarNomeProduto(b));
        txtEmbalagem.setText(pc.buscarEmbalagem(b));
        jcbSim.grabFocus();
    }

    public void selecionaDadosTabela(int a, int b, char c, String d) {
        if (pc == null) {
            pc = new ProdutoController();
        }
        idDevolucao = a;
        txtProduto.setText(pc.buscarNomeProduto(b));
        txtEmbalagem.setText(pc.buscarEmbalagem(b));
        if (c == 'T') {
            jcbSim.setSelected(true);
            jcbNao.setSelected(false);
        } else if (c == 'F') {
            jcbSim.setSelected(false);
            jcbNao.setSelected(true);
        }
        jcbSim.grabFocus();
    }
}
