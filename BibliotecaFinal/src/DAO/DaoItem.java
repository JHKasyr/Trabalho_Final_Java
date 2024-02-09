/*
package DAO;
import Model.AutorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
public class DaoItem {
       public void inserirClienteDAO(AutorModel cadastrarAutor) {
       String sql = "INSERT INTO AUTOR (nome, nacionalidade VALUES (?,?)";
       PreparedStatement stmt = null;
       Connection connection = null;

       try {
           connection = new ConexaoDaoUsuario().getConnection();
           stmt = connection.prepareStatement(sql);
           
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Cadastro de autor realizado");
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Erro ao realizar registro!");
       } finally {
           try {
               if (stmt != null) {
                   stmt.close();
               }
           } catch (Exception e) {
               System.out.println("Erro ao finalizar steatment!");
               e.printStackTrace();
           }

           try {
               if (connection != null) {
                   connection.close();
               }
           } catch (Exception e) {
               System.out.println("Erro ao finalizar conexao com o banco de dados!");
               e.printStackTrace();

           }

       }
       }

}*/