/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Blob;

/**
 *
 * @author Joao Guilherme
 */
public class Produto {
    private int idProduto;
    private int categoria;
    private String nome;
    private Float valor;
    private Float desconto;
    private Float valorFinal;
<<<<<<< HEAD:Mercado Web/src/java/model/bean/Produto.java
    private int clube;
=======
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Produto.java
    private Blob imagem;

    public Produto() {
    }

<<<<<<< HEAD:Mercado Web/src/java/model/bean/Produto.java
    public Produto(int idProduto, int categoria, String nome, Float valor, Float desconto, Float valorFinal, int clube, Blob imagem) {
=======
    public Produto(int idProduto, int categoria, String nome, Float valor, Float desconto, Float valorFinal, Blob imagem) {
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Produto.java
        this.idProduto = idProduto;
        this.categoria = categoria;
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
        this.valorFinal = valorFinal;
<<<<<<< HEAD:Mercado Web/src/java/model/bean/Produto.java
        this.clube = clube;
=======
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Produto.java
        this.imagem = imagem;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public Float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Float valorFinal) {
        this.valorFinal = valorFinal;
    }

<<<<<<< HEAD:Mercado Web/src/java/model/bean/Produto.java
    public int getClube() {
        return clube;
    }

    public void setClube(int clube) {
        this.clube = clube;
    }

=======
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Produto.java
    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }

<<<<<<< HEAD:Mercado Web/src/java/model/bean/Produto.java
   

=======
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/bean/Produto.java
    
    
}
