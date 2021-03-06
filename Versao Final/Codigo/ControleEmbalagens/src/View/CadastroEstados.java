
package View;

import Model.Estado;
import controller.EstadoController;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class CadastroEstados extends javax.swing.JInternalFrame {

    Estado estado;
    EstadoController ec;
    ArrayList<Estado> listaEstados;

    public CadastroEstados() {
        initComponents();
        this.setTitle("Cadastro de Estados");
        desativaBotao();
        modeloTabela();
        exibirDadosCadastros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSigla = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstados = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nome:");

        jLabel2.setText("Sigla:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtSigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSiglaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
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
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        tblEstados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEstados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if ((txtSigla.getText().length() == 2) && (txtNome.getText() != "")) {
            gravarDados();
        } else {
            JOptionPane.showMessageDialog(null, "Dados informados não são válidos!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            txtNome.grabFocus();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblEstadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstadosMouseClicked
        carregaDadosCadastro();
    }//GEN-LAST:event_tblEstadosMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        String validar = "1234567890.,;-/?*&%$#@";
        if (validar.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        if (evt.getKeyChar() == 10) {
            txtSigla.grabFocus();
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtSiglaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSiglaKeyTyped
        String validar = "1234567890.-?";
        if (validar.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
        if (evt.getKeyChar() == 10) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSiglaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstados;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSigla;
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
        "Código", "Nome", "Sigla"}, 0) {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    private void modeloTabela() {
        tblEstados.setModel(modeloTabela);
        ajustaTamanhoColunaTabela();
    }

    private void ajustaTamanhoColunaTabela() {
        tblEstados.getColumnModel().getColumn(0).setPreferredWidth(60);//codigo
        tblEstados.getColumnModel().getColumn(1).setPreferredWidth(200);//nome
        tblEstados.getColumnModel().getColumn(2).setPreferredWidth(50);//cpf
    }

    private void limparCampos() {
        txtNome.setText("");
        txtSigla.setText("");
        exibirDadosCadastros();
        txtNome.grabFocus();
    }

    private void insereDadosTabela(Estado estado) {
        Object[] dados = new Object[3];
        dados[0] = estado.getIdEstado();
        dados[1] = estado.getNome();
        dados[2] = estado.getSigla();
        modeloTabela.addRow(dados);
    }

    private int getIdPessoaSelecionado() {
        return Integer.parseInt(modeloTabela.getValueAt(tblEstados.getSelectedRow(), 0).toString());
    }

    public void exibirDadosCadastros() {
        modeloTabela.getDataVector().removeAllElements();
        modeloTabela();
        ArrayList<Estado> lista;
        if (ec == null) {
            ec = new EstadoController();
        }
        lista = ec.buscaCadastroEstado();

        for (int x = 0; x < lista.size(); x++) {
            Estado e = lista.get(x);
            insereDadosTabela(e);
        }
        listaEstados = lista;
    }

    private void carregaDadosCadastro() {
        int id = getIdPessoaSelecionado();
        for (int x = 0; x < listaEstados.size(); x++) {
            Estado e = listaEstados.get(x);
            if (id == e.getIdEstado()) {
                txtNome.setText(e.getNome());
                txtSigla.setText(e.getSigla());
                estado = e;
                break;
            }
        }
    }

    private void gravarDados() {
        if (estado == null) {
            estado = new Estado();
        }
        if (ec == null) {
            ec = new EstadoController();
        }

        estado.setNome(txtNome.getText());
        estado.setSigla(txtSigla.getText());

        if (ec.insereCadastroEstado(estado)) {
            JOptionPane.showMessageDialog(null, "Cadastro Gravadao com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Problema ao gravar dados", "Erro", JOptionPane.ERROR_MESSAGE);
            txtNome.grabFocus();
        }
        exibirDadosCadastros();
    }

    public void excluirDados() {
        if (0 == JOptionPane.showConfirmDialog(rootPane, "Deseja excluir essas informações?", "Excluir", JOptionPane.YES_NO_OPTION)) {
            if (ec == null) {
                ec = new EstadoController();
            }
            ec.excluirCadastroEstado(getIdPessoaSelecionado());
            limparCampos();
            exibirDadosCadastros();
        }
    }
}
