package View;

import Model.Empresa;
import controller.CidadeController;
import controller.EmpresaController;
import controller.EstadoController;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class PesquisarEmpresa extends javax.swing.JInternalFrame {

    EmpresaController ec;
    EstadoController eco;
    CidadeController cc;
    CadastroEmpresa enviaDados;
    Empresa empresa;
    ArrayList<Empresa> listaEmpresas;
    Principal telaPrincipal;

    public PesquisarEmpresa() {
        initComponents();
        this.setTitle("Consulta de Cadastro de Empresas");
        desativaBotao();
        txtPesqEmp.grabFocus();
        modeloTabela();
        exibirDadosCadastros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesqEmp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesqEmpresa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSelecionar1 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(662, 533));

        jLabel1.setText("Nome:");

        txtPesqEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesqEmpKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqEmpKeyReleased(evt);
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
                .addComponent(txtPesqEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesqEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPesqEmpresa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPesqEmpresa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblPesqEmpresa);

        btnSelecionar1.setText("Selecionar");
        btnSelecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionar1ActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCancelar.setText("Sair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnSelecionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar1)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionar1ActionPerformed
        if (tblPesqEmpresa.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Favor selecione uma linha na tabela!", "AVISO!", JOptionPane.WARNING_MESSAGE);
        } else {
            selecionaDadosTabela();
        }
    }//GEN-LAST:event_btnSelecionar1ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparPesquisa();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPesqEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqEmpKeyReleased
        pesquisarNome();
    }//GEN-LAST:event_txtPesqEmpKeyReleased

    private void txtPesqEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqEmpKeyTyped
        String validar = "1234567890.,;-/?";
        if (validar.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesqEmpKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSelecionar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesqEmpresa;
    private javax.swing.JTextField txtPesqEmp;
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
        "Código", "Nome", "CNPJ", "Endereco", "Numero", "Bairro", "Complemento",
        "CEP", "Cidade", "Estado", "Tel Fixo", "Tel Celular", "E-mai"}, 0) {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    private void modeloTabela() {
        tblPesqEmpresa.setModel(modeloTabela);
        tblPesqEmpresa.setAutoResizeMode(tblPesqEmpresa.AUTO_RESIZE_OFF);
        ajustaTamanhoColunaTabela();
    }

    private void ajustaTamanhoColunaTabela() {
        tblPesqEmpresa.getColumnModel().getColumn(0).setMinWidth(0);
        tblPesqEmpresa.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblPesqEmpresa.getColumnModel().getColumn(0).setMaxWidth(0);
        tblPesqEmpresa.getColumnModel().getColumn(1).setPreferredWidth(200);//nome
        tblPesqEmpresa.getColumnModel().getColumn(2).setPreferredWidth(120);//cnpj
        tblPesqEmpresa.getColumnModel().getColumn(3).setPreferredWidth(200);//endereco
        tblPesqEmpresa.getColumnModel().getColumn(4).setPreferredWidth(60);//numero
        tblPesqEmpresa.getColumnModel().getColumn(5).setPreferredWidth(150);//bairro
        tblPesqEmpresa.getColumnModel().getColumn(6).setPreferredWidth(200);//complemento
        tblPesqEmpresa.getColumnModel().getColumn(7).setPreferredWidth(80);//cep
        tblPesqEmpresa.getColumnModel().getColumn(8).setPreferredWidth(150);//NomeCidade
        tblPesqEmpresa.getColumnModel().getColumn(9).setPreferredWidth(60);//estado
        tblPesqEmpresa.getColumnModel().getColumn(10).setPreferredWidth(110);//tel fixo
        tblPesqEmpresa.getColumnModel().getColumn(11).setPreferredWidth(110);//tel cell
        tblPesqEmpresa.getColumnModel().getColumn(12).setPreferredWidth(250);//email
    }

    private void limparPesquisa() {
        txtPesqEmp.setText("");
        exibirDadosCadastros();
    }

    private String carregaEstado(int idCidade) {
        String sigla;
        if (eco == null) {
            eco = new EstadoController();
        }
        return sigla = eco.buscarSiglaEstado(idCidade);
    }

    private String carregaCidade(int idCidade) {
        String nomeCidade;
        if (cc == null) {
            cc = new CidadeController();
        }
        return nomeCidade = cc.buscarCidade(idCidade);
    }

    private void insereDadosTabela(Empresa empresa) {
        Object[] dados = new Object[13];
        dados[0] = empresa.getIdEmpresa();
        dados[1] = empresa.getNome();
        dados[2] = empresa.getCnpj();
        dados[3] = empresa.getEndereco();
        dados[4] = empresa.getNumero();
        dados[5] = empresa.getBairro();
        dados[6] = empresa.getComplemento();
        dados[7] = empresa.getCep();
        dados[8] = carregaCidade(empresa.getIdCidade());
        dados[9] = carregaEstado(empresa.getIdCidade());
        dados[10] = empresa.getTelfixo();
        dados[11] = empresa.getTelcell();
        dados[12] = empresa.getEmail();
        modeloTabela.addRow(dados);
    }

    private int getIdEmpresaSelecionado() {
        return Integer.parseInt(modeloTabela.getValueAt(tblPesqEmpresa.getSelectedRow(), 0).toString());
    }

    public void exibirDadosCadastros() {
        modeloTabela.getDataVector().removeAllElements();
        modeloTabela();
        ArrayList<Empresa> lista;
        if (ec == null) {
            ec = new EmpresaController();
        }
        lista = ec.buscaCadastroEmpresa();
        for (int x = 0; x < lista.size(); x++) {
            Empresa p = lista.get(x);
            insereDadosTabela(p);
        }
        listaEmpresas = lista;
    }

    private void pesquisarNome() {
        modeloTabela.getDataVector().removeAllElements();
        modeloTabela();
        for (Empresa p : listaEmpresas) {
            if (p.getNome().toLowerCase().contains(txtPesqEmp.getText().toLowerCase())) {
                insereDadosTabela(p);
            }
        }
    }

    private void carregaDadosCadastro() {
        int id = getIdEmpresaSelecionado();
        for (int x = 0; x < listaEmpresas.size(); x++) {
            Empresa p = listaEmpresas.get(x);
            empresa = p;
            break;
        }
    }

    private void selecionaDadosTabela() {
        int id = getIdEmpresaSelecionado();
        int a = 0, b = 0, c = 0;
        String d = "", e = "", f = "", g = "", h = "", i = "", j = "", k = "", l = "", m = "";
        for (Empresa p : listaEmpresas) {
            if (p.getIdEmpresa() == id) {
                a = p.getIdEmpresa();
                b = p.getIdCidade();
                m = carregaEstado(p.getIdCidade());
                d = p.getNome();
                e = p.getCnpj();
                f = p.getEndereco();
                c = p.getNumero();
                g = p.getBairro();
                h = p.getComplemento();
                i = p.getCep();
                j = p.getTelfixo();
                k = p.getTelcell();
                l = p.getEmail();
                break;
            }
        }
        if (enviaDados == null) {
            enviaDados = new CadastroEmpresa();
        }
        Principal.jdpPrincipal.add(enviaDados);
        enviaDados.setVisible(true);
        telaPrincipal.centralizaForm(enviaDados);
        enviaDados.recebeDados(a, b, c, d, e, f, g, h, i, j, k, l, m);
        this.dispose();
    }
}
