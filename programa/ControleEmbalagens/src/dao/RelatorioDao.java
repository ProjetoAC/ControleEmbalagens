
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RelatorioDao {

    Statement st;
    ResultSet rs;
    static String SELECTRelEmbAent = "SELECT (SELECT SUM(quantidade) FROM devolucao WHERE flagentrega = 'F') AS qtdTotal, "
            + "e.descricao, SUM(quantidade) FROM devolucao INNER JOIN produtos p USING (idProduto) "
            + "INNER JOIN embalagens e USING (idEmbalagem) "
            + "WHERE flagentrega = 'F' GROUP BY e.descricao;";
    static String SELECTRelEmbDev = "SELECT (SELECT SUM(quantidade) FROM devolucao WHERE flagentrega = 'T') AS qtdTotal, "
            + "e.descricao AS descricao, SUM(quantidade) FROM devolucao INNER JOIN produtos p USING (idProduto) "
            + "INNER JOIN embalagens e USING (idEmbalagem) WHERE flagentrega = 'T' GROUP BY e.descricao;";
    static String SELECTRelEmbEmp = "SELECT e.nome AS empresa, p.nome AS produto, SUM(d.quantidade) AS qtd "
            + "FROM devolucao d INNER JOIN empresas e USING (idEmpresa) INNER JOIN produtos p USING (idProduto) "
            + "GROUP BY p.nome, e.nome ORDER BY e.nome;";
    static String SELECTRelEmbPes = "SELECT a.nome AS nome, p.nome AS produto, SUM(d.quantidade) AS qtd "
            + "FROM devolucao d INNER JOIN pessoas a USING (idPessoa) INNER JOIN produtos p USING (idProduto) "
            + "GROUP BY p.nome, a.nome ORDER BY a.nome;";
    static String SELECTRelEmbPro = "SELECT p.nome, e.descricao, SUM(d.quantidade) "
            + "FROM devolucao d INNER JOIN produtos p USING (idProduto) INNER JOIN embalagens e USING (idEmbalagem) "
            + "GROUP BY p.nome, e.descricao;";
    static String SELECTRelEmbClasse = "SELECT p.classetox, p.nome, SUM(d.quantidade) FROM devolucao d "
            + "INNER JOIN produtos p USING (idProduto) WHERE flagentrega = 'F' "
            + "GROUP BY p.classetox, p.nome ORDER BY p.classetox, p.nome;";

    public ResultSet relatorioEmbAentregar() {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTRelEmbAent);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados no BD: " + ex);
        }
        return rs;
    }

    public ResultSet relatorioEmbDevolvidas() {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTRelEmbDev);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados no BD: " + ex);
        }
        return rs;
    }

    public ResultSet relatorioEmbEmpresa() {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTRelEmbEmp);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados no BD: " + ex);
        }
        return rs;
    }

    public ResultSet relatorioEmbPessoa() {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTRelEmbPes);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados no BD: " + ex);
        }
        return rs;
    }

    public ResultSet relatorioEmbProduto() {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTRelEmbPro);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados no BD: " + ex);
        }
        return rs;
    }

    public ResultSet relatorioEmbClasse() {
        try {
            PreparedStatement preparedStatement = Conexao.getConexao().prepareStatement(SELECTRelEmbClasse);
            rs = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados no BD: " + ex);
        }
        return rs;
    }
}
