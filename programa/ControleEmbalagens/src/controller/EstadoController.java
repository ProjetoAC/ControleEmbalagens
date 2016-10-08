
package controller;

import Model.Estado;
import dao.EstadoDao;
import java.util.ArrayList;

public class EstadoController {
    EstadoDao estadoDao;

    public EstadoController() {
        if (estadoDao == null) {
            estadoDao = new EstadoDao();
        }
    }

    public boolean insereCadastroEstado(Estado estado) {
        if (estado.getIdEstado() != 0) {
            return estadoDao.updateCadastroEstado(estado);
        } else {
            return estadoDao.insereCadastroEstado(estado);
        }
    }

    public ArrayList<Estado> buscaCadastroEstado() {
        return estadoDao.buscaCadastroEstado();
    }

    public boolean excluirCadastroEstado(int id) {
        return estadoDao.excluirCadastroEstado(id);
    }
    
    public String buscarSiglaEstado(int idCidade) {
        return estadoDao.buscarSiglaEstado(idCidade);
    }
}
