package dao;

import Model.Devolucao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DevolucaoDao {

    Statement st;
    PreparedStatement prepst;

    static String INSERT = "INSERT INTO devolucao(idDevolucao, idEmpresa, idPessoa, idProduto, "
            + "data, quantidade, flagEntrega, dataEntrega) "
            + "VALUES ((SELECT COALESCE(max(idDevolucao)+1,1) FROM devolucao),?,?,?,?,?,?,?);";
    static String SELECTALL = "SELECT idDevolucao, idempresa, idProduto, idpessoa, data, "
            + "quantidade,  flagEntrega, dataentrega FROM devolucao order by idDevolucao;";
    static String UPDATE = "UPDATE devolucao SET idDevolucao = ?, idempresa = ?, iddevolucao = ?, "
            + "idpessoa = ?, data = ?, quantidade = ?,  flagentrega = ?, dataentrega = ? "
            + "WHERE idDevolucao = ? ;";
    static String UPDATEDEVOLUCAO = "UPDATE devolucao SET idDevolucao = ?, flagentrega = ?, dataentrega = ? "
            + "WHERE idDevolucao = ?;";
    static String DELETE = "DELETE FROM devolucao  WHERE idDevolucao = ?;";
    static String SELECTBUSCANOMEEMPRESA = "SELECT e.nome FROM devolucao INNER JOIN empresas e "
            + "USING (idEmpresa) WHERE idDevolucao = ?;";
    static String SELECTBUSCAEMBALAGEM = "SELECT e.descricao FROM devolucao INNER JOIN produtos USING (idProduto) "
            + "INNER JOIN embalagens as e USING (idEmbalagem) WHERE idProduto = ?;";
    static String SELECTBUSCANOMEPESSOA = "SELECT p.nome FROM devolucao INNER JOIN pessoas p USING (idPessoa) "
            + "where idDevolucao = ?;";
    static String SELECTBUSCACLASSETOX = "SELECT p.classeTox FROM devolucao INNER JOIN produtos p USING (idProduto) "
            + "WHERE idDevolucao = ?;";
    static String SELECTBUSCANOMEPRODUTO = "SELECT p.nome FROM devolucao INNER JOIN produtos p "
            + "USING (idProduto) WHERE idDevolucao = ?;";

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
            preparedStatement.setString(6, String.valueOf('F'));
            preparedStatement.setString(7, "");
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao inserir Cadastro Devolucao: " + ex);
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
                devolucao.setFlagDevolucao(rs.getString("flagEntrega").charAt(0));
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
            preparedStatement.setString(7, String.valueOf(devolucao.getFlagDevolucao()));
            preparedStatement.setString(8, devolucao.getDataEntrega());
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

    public boolean updateDevolucao(Devolucao devolucao) {
        try {

            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(UPDATEDEVOLUCAO);
            preparedStatement.setInt(1, devolucao.getIdDevolucao());
            preparedStatement.setString(2, String.valueOf(devolucao.getFlagDevolucao()));
            preparedStatement.setString(3, devolucao.getDataEntrega());
            preparedStatement.setInt(4, devolucao.getIdDevolucao());
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao fazer update do update do cadastro de devolucao:" + ex);
        }
        return false;
    }

    public String buscarNomeEmpresa(int idDevolucao) {
        String nome = "";
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTBUSCANOMEEMPRESA);
            preparedStatement.setInt(1, idDevolucao);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nome = rs.getString("nome");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar nome empresa : " + ex);
        }
        return nome;
    }

    public String buscarDescricaoEmbalagem(int idProduto) {
        String embalagem = "";
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTBUSCAEMBALAGEM);
            preparedStatement.setInt(1, idProduto);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                embalagem = rs.getString("descricao");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar descrição embalagem : " + ex);
        }
        return embalagem;
    }

    public String buscarNomePessoa(int idDevolucao) {
        String nome = "";
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTBUSCANOMEPESSOA);
            preparedStatement.setInt(1, idDevolucao);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nome = rs.getString("nome");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar nome pessoa : " + ex);
        }
        return nome;
    }

    public String buscarClasseTox(int idDevolucao) {
        String descricao = "";
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTBUSCACLASSETOX);
            preparedStatement.setInt(1, idDevolucao);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                descricao = rs.getString("classetox");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar classe toxicológica : " + ex);
        }
        return descricao;
    }

    public String buscarNomeProduto(int idDevolucao) {
        String nome = "";
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTBUSCANOMEPRODUTO);
            preparedStatement.setInt(1, idDevolucao);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nome = rs.getString("nome");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar nome do produto : " + ex);
        }
        return nome;
    }

}
