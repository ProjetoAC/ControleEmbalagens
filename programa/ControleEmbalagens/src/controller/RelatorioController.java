/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RelatorioDao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author j0nas
 */
public class RelatorioController {

    RelatorioDao relatorioDao;

    public RelatorioController() {
        if (relatorioDao == null) {
            relatorioDao = new RelatorioDao();
        }
    }

    public ResultSet relatorioEmbAentregar() {
        return relatorioDao.relatorioEmbAentregar();
    }

    public ResultSet relatorioEmbDevolvidas() {
        return relatorioDao.relatorioEmbDevolvidas();
    }

    public ResultSet relatorioEmbPessoa() {
        return relatorioDao.relatorioEmbPessoa();
    }

    public ResultSet relatorioEmbEmpresa() {
        return relatorioDao.relatorioEmbEmpresa();
    }

    public ResultSet relatorioEmbProduto() {
        return relatorioDao.relatorioEmbProduto();
    }

    public ResultSet relatorioEmbClasse() {
        return relatorioDao.relatorioEmbClasse();
    }
}
