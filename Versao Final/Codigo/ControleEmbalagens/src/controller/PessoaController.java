
package controller;

import Model.Pessoa;
import dao.PessoaDao;
import java.util.ArrayList;

public class PessoaController {

    PessoaDao pessoaDao;

    public PessoaController() {
        if (pessoaDao == null) {
            pessoaDao = new PessoaDao();
        }
    }

    public boolean insereCadastroPessoa(Pessoa pessoa) {
        if (pessoa.getIdPessoa() != 0) {
            return pessoaDao.updateCadastroPessoa(pessoa);
        } else {
            return pessoaDao.insereCadastroPessoa(pessoa);
        }
    }

    public ArrayList<Pessoa> buscaCadastroPessoa() {
        return pessoaDao.buscaCadastroPessoa();
    }

    public boolean excluirCadastroPessoa(int id) {
        return pessoaDao.excluirCadastroPessoa(id);
    }

    public int buscaIdNomePessoa(String nome) {
        return pessoaDao.buscaIdNomePessoa(nome);
    }
    
    public int buscaIdNomeCidade(String nome) {
        return pessoaDao.buscaIdNomeCidade(nome);
    }
}
