/*
package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class DaoAutor {
    public void inserirClienteDAO(AutorModel novoAutor) {
       String sql = "INSERT INTO autor (nome, nacionalidade) VALUES(?,?)";
       PreparedStatement stmt = null;
       Connection connection = null;

       try {
           connection = new ConexaoDaoAutor().getConnection();
           stmt = connection.prepareStatement(sql);
           stmt.setString(1, novoAutor.getNome());
           stmt.setString(2, novoAutor.getNacionalidade());
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Cadastros feito");
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

}

}*/