/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

<<<<<<< HEAD:Mercado Web/src/java/model/dao/ProdutoPedidoDAO.java
import java.sql.Connection;
=======

>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/model/dao/ProdutoPedidoDAO.java
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Joao Guilherme
 */
public class ProdutoPedidoDAO {
    private void aaa() {
        try {
            java.sql.Connection conexao = Conexao.getConn();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            String query = "";
            
            stmt = conexao.prepareStatement(query);
            
            
            rs.close();
            stmt.close();
            conexao.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
                   
        }
    }    
}
