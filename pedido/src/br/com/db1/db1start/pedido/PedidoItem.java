package br.com.db1.db1start.pedido;

public class PedidoItem {
    private Produto produto;
    private double quantidade;
    private double valor;

    public PedidoItem(Produto produto, double quantidade, double valor){
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor  = valor;
    }
}
