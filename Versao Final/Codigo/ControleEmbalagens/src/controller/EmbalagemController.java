
package controller;

import dao.EmbalagemDao;
import Model.Embalagem;
import java.util.ArrayList;

public class EmbalagemController {

    EmbalagemDao embalagemDao;

    public EmbalagemController() {
        if (embalagemDao == null) {
            embalagemDao = new EmbalagemDao();
        }
    }

    public boolean insereCadastroEmbalagem(Embalagem embalagem) {
        if (embalagem.getIdEmbalagem() != 0) {
            return embalagemDao.updateCadastroEmbalagem(embalagem);
        } else {
            return embalagemDao.insereCadastroEmbalagem(embalagem);
        }
    }

    public ArrayList<Embalagem> buscaCadastroEmbalagem() {
        return embalagemDao.buscaCadastroEmbalagem();
    }

    public boolean excluirCadastroEmbalagem(int id) {
        return embalagemDao.excluirCadastroEmbalagem(id);
    }

    public String buscarEmbalagem(int idEmbalagem) {
        return embalagemDao.buscarEmbalagem(idEmbalagem);
    }
}
