/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Devolucao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author j0nas
 */
public class DevolucaoDao {

    Statement st;
    PreparedStatement prepst;
//idDevolucao, idempresa, iddevolucao, idpessoa, data, quantidade,  flagentrega, dataentrega
    static String INSERT = "INSERT INTO devolucao(idDevolucao, idEmpresa, idPessoa, idProduto, "
            + "data, quantidade,  flagentrega, dataentrega) "
            + "VALUES ((SELECT COALESCE(max(idDevolucao)+1,1) FROM devolucao),?,?,?,?,?,?,?);";
    static String SELECTALL = "SELECT idDevolucao, idempresa, iddevolucao, idpessoa, data, "
            + "quantidade,  flagentrega, dataentrega FROM devolucao order by idDevolucao;";
    static String UPDATE = "UPDATE devolucao SET idDevolucao = ?, idempresa = ?, iddevolucao = ?, "
            + "idpessoa = ?, data = ?, quantidade = ?,  flagentrega = ?, dataentrega = ? "
            + "WHERE idDevolucao = ? ;";
    static String DELETE = "DELETE FROM devolucao  WHERE idDevolucao = ?;";

    public boolean insereCadastroDevolucao(Devolucao devolucao) {
        ResultSet rs;
        int id = 0;
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(INSERT);
            preparedStatement.setInt(1, devolucao.getIdEmpresa());
            preparedStatement.setInt(2, devolucao.getIdPessoa());
            preparedStatement.setInt(3, devolucao.getIdProduto());
            preparedStatement.setString(4, devolucao.getData());
            preparedStatement.setInt(5, devolucao.getQuantidade());
            preparedStatement.setString(6, String.valueOf(devolucao.getFlagDevolucao()));//flagDevolucao
            preparedStatement.setString(7, devolucao.getDataEntrega());//DataEntrega
            System.out.println(""+ preparedStatement.toString());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problema ao inserir Cadastro Devolucao: " + ex);
            JOptionPane.showMessageDialog(null, "Erro:" + ex);
        }
        return false;
    }

    public ArrayList<Devolucao> buscaCadastroDevolucao() {
        ArrayList<Devolucao> lista = new ArrayList<Devolucao>();

        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTALL);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Devolucao devolucao = new Devolucao();
                devolucao.setIdDevolucao(rs.getInt("idDevolucao"));
                devolucao.setIdEmpresa(rs.getInt("idEmpresa"));
                devolucao.setIdPessoa(rs.getInt("idPessoa"));
                devolucao.setIdProduto(rs.getInt("idProduto"));
                devolucao.setData(rs.getString("data"));
                devolucao.setQuantidade(rs.getInt("quantidade"));
                devolucao.setFlagDevolucao(rs.getString("flagDevolucao").charAt(0));
                devolucao.setDataEntrega(rs.getString("dataEntrega"));
                lista.add(devolucao);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar cadastro de devolucao :" + ex);
        }
        return lista;
    }

    public boolean updateCadastroDevolucao(Devolucao devolucao) {
        try {

            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(UPDATE);
            preparedStatement.setInt(1, devolucao.getIdDevolucao());
            preparedStatement.setInt(2, devolucao.getIdEmpresa());
            preparedStatement.setInt(3, devolucao.getIdPessoa());
            preparedStatement.setInt(4, devolucao.getIdProduto());
            preparedStatement.setString(5, devolucao.getData());
            preparedStatement.setInt(6, devolucao.getQuantidade());
            preparedStatement.setString(7, String.valueOf(devolucao.getFlagDevolucao()));//flagDevolucao
            preparedStatement.setString(8, devolucao.getDataEntrega());//DataEntrega
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao fazer update do update do cadastro de devolucao:" + ex);
        }
        return false;
    }

    public boolean excluirCadastroDevolucao(int id) {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao deletar o cadastro devolucao:" + ex);
        }
        return false;
    }
}
