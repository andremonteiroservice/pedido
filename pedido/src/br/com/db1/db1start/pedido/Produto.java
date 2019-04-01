package br.com.db1.db1start.pedido;

public class Produto {
    private String codigo;
    private String nomedoproduto;
    private double valor;
    private ProdutoStatus statusDoProduto;

    public Produto(String codigo, String nomedoproduto, double valor, ProdutoStatus statusDoProduto){
        this.codigo = codigo;
        this.nomedoproduto = nomedoproduto;
        this.valor = valor;
        this.statusDoProduto = statusDoProduto;
    }

    public ProdutoStatus getStatusDoProduto() {
        return statusDoProduto;
    }
}
