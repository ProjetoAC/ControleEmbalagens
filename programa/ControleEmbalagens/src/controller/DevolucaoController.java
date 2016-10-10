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

    public String buscarNomeEmpresa(int idDevolucao) {
        return devolucaoDao.buscarNomeEmpresa(idDevolucao);
    }

    public String buscarDescricaoEmbalagem(int idProduto) {
        return devolucaoDao.buscarDescricaoEmbalagem(idProduto);
    }

    public String buscarNomePessoa(int idDevolucao) {
        return devolucaoDao.buscarNomePessoa(idDevolucao);
    }

    public String buscarClasseTox(int idDevolucao) {
        return devolucaoDao.buscarClasseTox(idDevolucao);
    }

    public String buscarNomeProduto(int idDevolucao) {
        return devolucaoDao.buscarNomeProduto(idDevolucao);
    }
    
     public ArrayList<Devolucao> pesquisaProduto(String nome){
        return devolucaoDao.pesquisaProduto(nome);
    }

}
