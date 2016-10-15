
package dao;

import Model.Cidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CidadeDao {

    Statement st;
    PreparedStatement prepst;

    static String INSERT = "INSERT INTO cidades(idCidade, idEstado, nome) "
            + "VALUES ((SELECT COALESCE(max(idcidade)+1,1) FROM cidades),?,?);";
    static String SELECTALL = "SELECT idCidade, idEstado, nome"
            + " FROM cidades order by nome;";
    static String UPDATE = "UPDATE cidades SET idCidade = ?, idEstado = ?, nome = ? "
            + "WHERE idCidade = ? ;";
    static String DELETE = "DELETE FROM cidades  WHERE idCidade = ?;";
    static String SELECTESTADOCIDADE = "SELECT a.nome FROM cidades a "
            + " INNER JOIN estados USING (idEstado) where estados.sigla = ?;";
    static String SELECBUSCACIDADE = "SELECT nome FROM cidades WHERE idCidade = ?;";

    public boolean insereCadastroCidade(Cidade cidade) {
        ResultSet rs;
        int id = 0;
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(INSERT);
            preparedStatement.setInt(1, cidade.getIdEstado());
            preparedStatement.setString(2, cidade.getNome());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao inserir Cadastro Cidade: " + ex);
        }
        return false;
    }

    public ArrayList<Cidade> buscaCadastroCidade() {
        ArrayList<Cidade> lista = new ArrayList<Cidade>();
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setIdCidade(rs.getInt("idCidade"));
                cidade.setIdEstado(rs.getInt("idEstado"));
                cidade.setNome(rs.getString("nome"));
                lista.add(cidade);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar cadastro de cidades: " + ex);
        }
        return lista;
    }

    public boolean updateCadastroCidade(Cidade cidade) {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(UPDATE);
            preparedStatement.setInt(1, cidade.getIdCidade());
            preparedStatement.setInt(2, cidade.getIdEstado());
            preparedStatement.setString(3, cidade.getNome());
            preparedStatement.setInt(4, cidade.getIdCidade());
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao fazer update do update do cadastro de cidade: " + ex);
        }
        return false;
    }

    public boolean excluirCadastroCidade(int id) {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao deletar o cidade do cadastro cidade: " + ex);
        }
        return false;
    }

    public ArrayList<Cidade> buscaEstadoCidade(String estado) {
        ArrayList<Cidade> lista = new ArrayList<Cidade>();
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTESTADOCIDADE);
            preparedStatement.setString(1, estado);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setNome(rs.getString("nome"));
                lista.add(cidade);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar cadastro de cidades: " + ex);
        }
        return lista;
    }

    public String buscarCidade(int idCidade) {
        String cidade = "";
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECBUSCACIDADE);
            preparedStatement.setInt(1, idCidade);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                cidade = rs.getString("nome");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problema ao carregar cadastro de cidades: " + ex);
        }
        return cidade;
    }
}
