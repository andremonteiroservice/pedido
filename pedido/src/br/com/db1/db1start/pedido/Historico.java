package br.com.db1.db1start.pedido;

import java.time.LocalDateTime;

public class Historico {
    private LocalDateTime date;
    private StatusPedido statuspedido;

    public Historico(LocalDateTime date, StatusPedido statuspedido){
        this.date = date;
        this.statuspedido = statuspedido;
    }
}
