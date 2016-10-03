/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Devolucao;
import dao.DevolucaoDao;
import java.util.ArrayList;

/**
 *
 * @author j0nas
 */
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

    /*
    public ArrayList<Cidade> buscaEstadoCidade(String estado) {
        return cidadeDao.buscaEstadoCidade(estado);
    }

    public String buscarCidade(int idCidade) {
        return cidadeDao.buscarCidade(idCidade);
    }*/
}
