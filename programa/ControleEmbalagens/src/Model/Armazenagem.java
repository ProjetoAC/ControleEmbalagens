/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author j0nas
 */
public class Armazenagem {

        private int idArmazenagem;
        private int idPessoa;
        private int idEmpresa;
        private int idProduto;
        private Date dtEntrada;
        private int qtdEntrada;
        private char flagSaida;
        private Date dtSaida;
        private int qtdSaida;

    public int getIdArmazenagem() {
        return idArmazenagem;
    }

    public void setIdArmazenagem(int idArmazenagem) {
        this.idArmazenagem = idArmazenagem;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public int getQtdEntrada() {
        return qtdEntrada;
    }

    public void setQtdEntrada(int qtdEntrada) {
        this.qtdEntrada = qtdEntrada;
    }

    public char getFlagSaida() {
        return flagSaida;
    }

    public void setFlagSaida(char flagSaida) {
        this.flagSaida = flagSaida;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public int getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(int qtdSaida) {
        this.qtdSaida = qtdSaida;
    }
}
