/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Senai
 */
public class Conexao {
<<<<<<< HEAD:Mercado Web/src/java/conexao/Conexao.java
    private static final String url = "jdbc:mysql://localhost:3306/banco";
    private static final String usuario = "root";
    private static final String senha = "1234";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e){
=======

    private static Connection conn;
    
    public static Connection getConn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banco-ds", "root", "");
        } catch(Exception e){
>>>>>>> dbe6cd28b41a34279dd0186395eb2071d4f28903:src/java/conexao/Conexao.java
            e.printStackTrace();
        }
        return conn;
    }
  
    
}
