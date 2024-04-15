/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author Joao Guilherme
 */
public class Pedido {
    private int idPedido;
    private int usuario;
    private int endereco_entrega;
    private float valorTotal;
    private Date data_pedido;

    public Pedido() {
    }

    public Pedido(int idPedido, int usuario, int endereco_entrega, float valorTotal, Date data_pedido) {
        this.idPedido = idPedido;
        this.usuario = usuario;
        this.endereco_entrega = endereco_entrega;
        this.valorTotal = valorTotal;
        this.data_pedido = data_pedido;
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

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    
    
}
