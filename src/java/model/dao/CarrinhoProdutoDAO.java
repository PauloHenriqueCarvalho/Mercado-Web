/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

<<<<<<< HEAD:Mercado Web/src/java/model/dao/CarrinhoProdutoDAO.java
import java.sql.Connection;
=======

>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/dao/CarrinhoProdutoDAO.java
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Carrinho;
import model.bean.Produto;

/**
 *
 * @author Joao Guilherme
 */
public class CarrinhoProdutoDAO {

    /*try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "";
            
            stmt = conexao.prepareStatement(query);
            
            
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
                   
        }*/
    private void adicionarProdutoAoCarrinho(Produto p, Carrinho c) {
        try {
           java.sql.Connection conexao = Conexao.getConn();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO produto_pedido (carrinho, produto) VALUES (?, ?)");
            stmt.setInt(1, c.getIdCarrinho());
            stmt.setInt(2, p.getIdProduto());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
