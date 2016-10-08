
package controller;

import Model.Devolucao;
import dao.DevolucaoDao;
import java.util.ArrayList;

public class DevolucaoController {

    DevolucaoDao devolucaoDao;

    public DevolucaoController() {
        if (devolucaoDao == null) {
            devolucaoDao = new DevolucaoDao();
        }
    }

    public boolean insereCadastroDevolucao(Devolucao devolucao) {
        if (devolucao.getIdDevolucao() != 0) {
            return devolucaoDao.updateCadastroDevolucao(devolucao);
        } else {
            return devolucaoDao.insereCadastroDevolucao(devolucao);
        }
    }

    public ArrayList<Devolucao> buscaCadastroDevolucao() {
         return devolucaoDao.buscaCadastroDevolucao();
    }

    public boolean excluirCadastroDevolucao(int id) {
        return devolucaoDao.excluirCadastroDevolucao(id);
    }

    public boolean atualizaDevolucao(Devolucao devolucao) {
            return devolucaoDao.updateDevolucao(devolucao);
    }
    
}
