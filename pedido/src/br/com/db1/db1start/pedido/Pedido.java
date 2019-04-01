package br.com.db1.db1start.pedido;

import java.util.List;
import java.util.Random;

public class Pedido {
    private StatusPedido statuspedido;
    private Cliente cliente;
    private List<Produto> itens;
    private String numero;

    public Pedido(StatusPedido statuspedido, Cliente cliente, List<Produto> itens, String numero){
        this.statuspedido = statuspedido;
        this.cliente = cliente;
        this.itens = itens;
        this.numero = numero;
    }

    public Pedido efetuarPedido(List<Produto> produtos, Cliente cliente){
        validarNumeroDeItens(produtos);
        statusDoClienteParaEfetuarPedido(cliente.getStatus());
        statusDoProdutoParaValidarPedido(produtos);
        return gerarPedido(produtos, cliente);

    }
    private Pedido gerarPedido(List<Produto> produtos, Cliente cliente){
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setItens(produtos);
        pedido.setNumero("9");
        return pedido;
    }

    public Pedido() {
    }

    private void statusDoProdutoParaValidarPedido(List<Produto> produtos) {
        produtos.forEach(this::isAtivo);
    }

    private void statusDoClienteParaEfetuarPedido(StatusCliente status) {
        if( status.equals(StatusCliente.INATIVO)){
            throw new RuntimeException("O cliente está INATIVO");
        }
    }

    private void validarNumeroDeItens(List<Produto> produtos) {
        if (produtos.size()>10 || produtos.size()<1){
            throw new RuntimeException ("Número de produtos inválido");
        }

    }
    private void isAtivo(Produto produto){
        if( produto.getStatusDoProduto().equals(ProdutoStatus.INATIVO)){
          throw new RuntimeException("Produto se encontra INATIVO");
        }
    }

    public StatusPedido getStatuspedido() {
        return statuspedido;
    }

    public void setStatuspedido(StatusPedido statuspedido) {
        this.statuspedido = statuspedido;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public String getNumero() {
        return numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
