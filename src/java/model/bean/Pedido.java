/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Timestamp;

/**
 *
 * @author Joao Guilherme
 */
public class Pedido {

    private int idPedido;
    private int usuario;
    private int endereco_entrega;
<<<<<<< HEAD:Mercado Web/src/java/model/bean/Pedido.java
    private float valorTotal;
    private Date data_pedido;
=======
    private Timestamp data_pedido;
    private float valor_total;
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Pedido.java

    public Pedido() {
    }

<<<<<<< HEAD:Mercado Web/src/java/model/bean/Pedido.java
    public Pedido(int idPedido, int usuario, int endereco_entrega, float valorTotal, Date data_pedido) {
=======
    public Pedido(int idPedido, int usuario, int endereco_entrega, Timestamp data_pedido, float valor_total) {
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Pedido.java
        this.idPedido = idPedido;
        this.usuario = usuario;
        this.endereco_entrega = endereco_entrega;
        this.valorTotal = valorTotal;
        this.data_pedido = data_pedido;
        this.valor_total = valor_total;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getEndereco_entrega() {
        return endereco_entrega;
    }

    public void setEndereco_entrega(int endereco_entrega) {
        this.endereco_entrega = endereco_entrega;
    }

<<<<<<< HEAD:Mercado Web/src/java/model/bean/Pedido.java
    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData_pedido() {
=======
    public Timestamp getData_pedido() {
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Pedido.java
        return data_pedido;
    }

    public void setData_pedido(Timestamp data_pedido) {
        this.data_pedido = data_pedido;
    }

<<<<<<< HEAD:Mercado Web/src/java/model/bean/Pedido.java
    
    
=======
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Pedido.java
}
