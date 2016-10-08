
package controller;

import Model.Cidade;
import dao.CidadeDao;
import java.util.ArrayList;

public class CidadeController {

    CidadeDao cidadeDao;

    public CidadeController() {
        if (cidadeDao == null) {
            cidadeDao = new CidadeDao();
        }
    }

    public boolean insereCadastroCidade(Cidade cidade) {
        if (cidade.getIdCidade() != 0) {
            return cidadeDao.updateCadastroCidade(cidade);
        } else {
            return cidadeDao.insereCadastroCidade(cidade);
        }
    }

    public ArrayList<Cidade> buscaCadastroCidade() {
        return cidadeDao.buscaCadastroCidade();
    }

    public boolean excluirCadastroCidade(int id) {
        return cidadeDao.excluirCadastroCidade(id);
    }

    public ArrayList<Cidade> buscaEstadoCidade(String estado) {
        return cidadeDao.buscaEstadoCidade(estado);
    }

    public String buscarCidade(int idCidade) {
        return cidadeDao.buscarCidade(idCidade);
    }
}
