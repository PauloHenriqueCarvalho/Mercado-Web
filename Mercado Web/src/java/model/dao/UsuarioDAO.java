/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Usuario;

/**
 *
 * @author Senai
 */
public class UsuarioDAO {
    public boolean create(Usuario u){
        try{
            Connection c = Conexao.conexao();
            PreparedStatement ps = c.prepareStatement("INSERT INTO usuario(nome, email, senha, cpf, telefone) values (?,?,?,?,?)");
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.setString(4, u.getCpf());
            ps.setString(5, u.getTelefone());
            
            ps.executeUpdate();
            
            ps.close();
            c.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean logar(String nome, String senha){
        try{
            Connection c = Conexao.conexao();
            PreparedStatement ps = c.prepareStatement("Select * from usuario where nome = ? AND senha = ?");
            ps.setString(1, nome);
            ps.setString(2, senha);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                ps.close();
                c.close();
                return true;
                
            } else{
                ps.close();
                c.close();
                return false;
            }

        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
}
