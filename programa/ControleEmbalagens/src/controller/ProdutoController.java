
package controller;

import Model.Produto;
import dao.ProdutoDao;
import java.util.ArrayList;

public class ProdutoController {

    ProdutoDao produtoDao;

    public ProdutoController() {
        if (produtoDao == null) {
            produtoDao = new ProdutoDao();
        }
    }

    public boolean insereCadastroProduto(Produto produto) {
        if (produto.getIdProduto() != 0) {
            return produtoDao.updateCadastroProduto(produto);
        } else {
            return produtoDao.insereCadastroProduto(produto);
        }
    }

    public ArrayList<Produto> buscaCadastroProduto() {
        return produtoDao.buscaCadastroProduto();
    }

    public boolean excluirCadastroProduto(int id) {
        return produtoDao.excluirCadastroProduto(id);
    }

    public String buscarEmbalagem(int idEmbalagem) {
        return produtoDao.buscarEmbalagem(idEmbalagem);
    }
    
    public String buscarNomeProduto(int idProduto) {
        return produtoDao.buscarNomeProduto(idProduto);
    }
}
