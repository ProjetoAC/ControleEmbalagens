package View;

import Model.Embalagem;
import controller.EmbalagemController;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class CadastroEmbalagens extends javax.swing.JInternalFrame {

    EmbalagemController ec;
    Embalagem embalagem;
    ArrayList<Embalagem> listaEmbalagems;

    public CadastroEmbalagens() {
        initComponents();
        this.setTitle("Cadastro de Embalagens");
        desativaBotao();
        modeloTabela();
        exibirDadosCadastros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmb = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Descrição:");

        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescKeyTyped(evt);
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
                .addComponent(txtDesc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Gravar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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
                .addGap(55, 55, 55)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        tblEmb.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmb);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jButton1.setText("Sair");
        jButton1.setMaximumSize(new java.awt.Dimension(54, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(54, 32));
        jButton1.setPreferredSize(new java.awt.Dimension(54, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtDesc.getText().equals("")) {
            gravarDados();
        } else {
            JOptionPane.showMessageDialog(null, "Dados informados não são válidos!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            txtDesc.grabFocus();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblEmbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmbMouseClicked
        carregaDadosCadastro();
    }//GEN-LAST:event_tblEmbMouseClicked

    private void txtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescKeyTyped
        String validar = ".,;-/?*&$%#@";
        if (validar.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        if (evt.getKeyChar() == 10) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtDescKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmb;
    private javax.swing.JTextField txtDesc;
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
        "Código", "Descrição"}, 0) {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    private void modeloTabela() {
        tblEmb.setModel(modeloTabela);
        modeloTabela.setNumRows(0);
        ajustaTamanhoColunaTabela();
    }

    private void ajustaTamanhoColunaTabela() {
        tblEmb.getColumnModel().getColumn(0).setPreferredWidth(50);//codigo
        tblEmb.getColumnModel().getColumn(1).setPreferredWidth(200);//descricao
    }

    private void limparCampos() {
        txtDesc.setText("");
        exibirDadosCadastros();
    }

    private void insereDadosTabela(Embalagem embalagem) {
        Object[] dados = new Object[3];
        dados[0] = embalagem.getIdEmbalagem();
        dados[1] = embalagem.getDescricao();
        modeloTabela.addRow(dados);
    }

    private int getIdPessoaSelecionado() {
        return Integer.parseInt(modeloTabela.getValueAt(tblEmb.getSelectedRow(), 0).toString());
    }

    public void exibirDadosCadastros() {
        modeloTabela.getDataVector().removeAllElements();
        modeloTabela();
        ArrayList<Embalagem> lista;
        if (ec == null) {
            ec = new EmbalagemController();
        }
        if (ec == null) {
            ec = new EmbalagemController();
        }
        lista = ec.buscaCadastroEmbalagem();

        for (int x = 0; x < lista.size(); x++) {
            Embalagem e = lista.get(x);
            insereDadosTabela(e);
        }
        listaEmbalagems = lista;
    }

    private void carregaDadosCadastro() {
        int id = getIdPessoaSelecionado();
        for (int x = 0; x < listaEmbalagems.size(); x++) {
            Embalagem e = listaEmbalagems.get(x);
            if (id == e.getIdEmbalagem()) {
                txtDesc.setText(e.getDescricao());
                embalagem = e;
                break;
            }
        }
    }

    private void gravarDados() {
        if (embalagem == null) {
            embalagem = new Embalagem();
        }
        if (ec == null) {
            ec = new EmbalagemController();
        }
        embalagem.setDescricao(txtDesc.getText());
        if (ec.insereCadastroEmbalagem(embalagem)) {
            JOptionPane.showMessageDialog(this, "Cadastro Gravadao com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Problema ao gravar dados", "Erro", JOptionPane.ERROR_MESSAGE);
            txtDesc.grabFocus();
        }
        exibirDadosCadastros();
    }

    public void excluirDados() {
        if (0 == JOptionPane.showConfirmDialog(rootPane, "Deseja excluir essas informações?", "Excluir", JOptionPane.YES_NO_OPTION)) {
            if (ec == null) {
                ec = new EmbalagemController();
            }
            ec.excluirCadastroEmbalagem(getIdPessoaSelecionado());
            limparCampos();
            exibirDadosCadastros();
        }
    }

    private void pesquisar() {
        modeloTabela();
        for (Embalagem e : listaEmbalagems) {
            if (e.getDescricao().toLowerCase().contains(txtDesc.getText().toLowerCase())) {
                insereDadosTabela(e);
            }
        }
    }

}
