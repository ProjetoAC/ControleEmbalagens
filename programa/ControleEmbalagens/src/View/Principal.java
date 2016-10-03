/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author j0nas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    CadastroPessoa telaCadPessoas;
    CadastroEmpresa telaCadEmpresa;
    CadastroEstados telaCadEstados;
    CadastroCidades telaCadCidades;
    CadastroEmbalagens telaCadEmbalagem;
    CadastroProdutos telaCadProduto;
    ProdutoUtilizado telaProdUtilizado;
    Devolucao telaDevolucao;
    Sobre telaSobre;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivos = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmCadastro = new javax.swing.JMenu();
        jmiEstados = new javax.swing.JMenuItem();
        jmiCidades = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiPessoas = new javax.swing.JMenuItem();
        jmiEmpresas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiCadEmbalagem = new javax.swing.JMenuItem();
        jmiProdutos = new javax.swing.JMenuItem();
        jmArmaz = new javax.swing.JMenu();
        jmiLancamento = new javax.swing.JMenuItem();
        jmDev = new javax.swing.JMenu();
        jmiDevolver = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmArquivos.setText("Arquivo");

        jMenuItem6.setText("Sair");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmArquivos.add(jMenuItem6);

        jMenuBar1.add(jmArquivos);

        jmCadastro.setText("Cadastros");

        jmiEstados.setText("Estados");
        jmiEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstadosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiEstados);

        jmiCidades.setText("Cidades");
        jmiCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadesActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCidades);
        jmCadastro.add(jSeparator1);

        jmiPessoas.setText("Pessoas");
        jmiPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPessoasActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiPessoas);

        jmiEmpresas.setText("Empresas");
        jmiEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmpresasActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiEmpresas);
        jmCadastro.add(jSeparator2);

        jmiCadEmbalagem.setText("Embalagens");
        jmiCadEmbalagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadEmbalagemActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadEmbalagem);

        jmiProdutos.setText("Produtos");
        jmiProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutosActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiProdutos);

        jMenuBar1.add(jmCadastro);

        jmArmaz.setText("Consumo");

        jmiLancamento.setText("Lançar Produto Utilizado");
        jmiLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLancamentoActionPerformed(evt);
            }
        });
        jmArmaz.add(jmiLancamento);

        jMenuBar1.add(jmArmaz);

        jmDev.setText("Devolução");

        jmiDevolver.setText("Lançar Devolução");
        jmiDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDevolverActionPerformed(evt);
            }
        });
        jmDev.add(jmiDevolver);

        jMenuBar1.add(jmDev);

        jmSobre.setText("Sobre");
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });

        jmiSobre.setText("Informações");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmSobre.add(jmiSobre);

        jMenuBar1.add(jmSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPessoasActionPerformed
        if (telaCadPessoas == null) {
            telaCadPessoas = new CadastroPessoa();
        }
        jdpPrincipal.add(telaCadPessoas);
        telaCadPessoas.setVisible(true);
        centralizaForm(telaCadPessoas);
    }//GEN-LAST:event_jmiPessoasActionPerformed

    private void jmiEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpresasActionPerformed
        if (telaCadEmpresa == null) {
            telaCadEmpresa = new CadastroEmpresa();
        }
        jdpPrincipal.add(telaCadEmpresa);
        telaCadEmpresa.setVisible(true);
        centralizaForm(telaCadEmpresa);
    }//GEN-LAST:event_jmiEmpresasActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jmiEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstadosActionPerformed
        if (telaCadEstados == null) {
            telaCadEstados = new CadastroEstados();
        }
        jdpPrincipal.add(telaCadEstados);
        telaCadEstados.setVisible(true);
        centralizaForm(telaCadEstados);
    }//GEN-LAST:event_jmiEstadosActionPerformed

    private void jmiCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadesActionPerformed
        if (telaCadCidades == null) {
            telaCadCidades = new CadastroCidades();
        }
        jdpPrincipal.add(telaCadCidades);
        telaCadCidades.setVisible(true);
        centralizaForm(telaCadCidades);
    }//GEN-LAST:event_jmiCidadesActionPerformed

    private void jmiCadEmbalagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadEmbalagemActionPerformed
        if (telaCadEmbalagem == null) {
            telaCadEmbalagem = new CadastroEmbalagens();
        }
        jdpPrincipal.add(telaCadEmbalagem);
        telaCadEmbalagem.setVisible(true);
        centralizaForm(telaCadEmbalagem);
    }//GEN-LAST:event_jmiCadEmbalagemActionPerformed

    private void jmiProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutosActionPerformed
        if (telaCadProduto == null) {
            telaCadProduto = new CadastroProdutos();
        }
        jdpPrincipal.add(telaCadProduto);
        telaCadProduto.setVisible(true);
        centralizaForm(telaCadProduto);
    }//GEN-LAST:event_jmiProdutosActionPerformed

    private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed

    }//GEN-LAST:event_jmSobreActionPerformed

    private void jmiLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLancamentoActionPerformed
        if (telaProdUtilizado == null) {
            telaProdUtilizado = new ProdutoUtilizado();
        }
        jdpPrincipal.add(telaProdUtilizado);
        telaProdUtilizado.setVisible(true);
        centralizaForm(telaProdUtilizado);
    }//GEN-LAST:event_jmiLancamentoActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        if (telaSobre == null) {
            telaSobre = new Sobre();
        }
        jdpPrincipal.add(telaSobre);
        telaSobre.setVisible(true);
        centralizaForm(telaSobre);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jmiDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDevolverActionPerformed
        if (telaDevolucao == null) {
            telaDevolucao = new Devolucao();
        }
        jdpPrincipal.add(telaDevolucao);
        telaDevolucao.setVisible(true);
        centralizaForm(telaDevolucao);
    }//GEN-LAST:event_jmiDevolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmArmaz;
    private javax.swing.JMenu jmArquivos;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmDev;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuItem jmiCadEmbalagem;
    private javax.swing.JMenuItem jmiCidades;
    private javax.swing.JMenuItem jmiDevolver;
    private javax.swing.JMenuItem jmiEmpresas;
    private javax.swing.JMenuItem jmiEstados;
    private javax.swing.JMenuItem jmiLancamento;
    private javax.swing.JMenuItem jmiPessoas;
    private javax.swing.JMenuItem jmiProdutos;
    private javax.swing.JMenuItem jmiSobre;
    // End of variables declaration//GEN-END:variables

    public static void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = jdpPrincipal.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
}
