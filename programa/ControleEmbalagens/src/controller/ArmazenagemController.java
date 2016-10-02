/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Armazenagem;
import dao.ArmazenagemDao;
import java.util.ArrayList;

/**
 *
 * @author j0nas
 */
public class ArmazenagemController {
    
    ArmazenagemDao armazenagemDao;

    public ArmazenagemController() {
        if (armazenagemDao == null) {
            armazenagemDao = new ArmazenagemDao();
        }
    }

    public boolean insereCadastroArmazenagem(Armazenagem armazenagem) {
        if (armazenagem.getIdArmazenagem() != 0) {
            return armazenagemDao.updateCadastroArmazenagem(armazenagem);
        } else {
            return armazenagemDao.insereCadastroArmazenagem(armazenagem);
        }
    }

    public ArrayList<Armazenagem> buscaCadastroArmazenagem() {
        return armazenagemDao.buscaCadastroArmazenagem();
    }

    public boolean excluirCadastroArmazenagem(int id) {
        return armazenagemDao.excluirCadastroArmazenagem(id);
    }

    /*
    public ArrayList<Cidade> buscaEstadoCidade(String estado) {
        return cidadeDao.buscaEstadoCidade(estado);
    }

    public String buscarCidade(int idCidade) {
        return cidadeDao.buscarCidade(idCidade);
    }*/
}
