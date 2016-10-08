
package controller;

import Model.Empresa;
import dao.EmpresaDao;
import java.util.ArrayList;

public class EmpresaController {

    EmpresaDao empresaDao;

    public EmpresaController() {
        if (empresaDao == null) {
            empresaDao = new EmpresaDao();
        }
    }

    public boolean insereCadastroEmpresa(Empresa empresa) {
        if (empresa.getIdEmpresa() != 0) {
            return empresaDao.updateCadastroEmpresa(empresa);
        } else {
            return empresaDao.insereCadastroEmpresa(empresa);
        }
    }

    public ArrayList<Empresa> buscaCadastroEmpresa() {
        return empresaDao.buscaCadastroEmpresa();
    }

    public boolean excluirCadastroEmpresa(int id) {
        return empresaDao.excluirCadastroEmpresa(id);
    }

    public int buscaIdNomEmpresa(String nome) {
        return empresaDao.buscaIdNomeEmpresa(nome);
    }

    public int buscaIdNomeCidade(String nome) {
        return empresaDao.buscaIdNomeCidade(nome);
    }
}
