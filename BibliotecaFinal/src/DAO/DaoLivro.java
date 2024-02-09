
package DAO;

import Model.LivroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DaoLivro {
       public void inserirLivroDAO(LivroModel cadastrarLivro) {
       String sql = "INSERT INTO LIVRO (titulo, genero, paginas, sinopse) VALUES (?,?,?,?)";
       PreparedStatement stmt = null;
       Connection connection = null;

       try {
           connection = new ConexaoDaoLivro().getConnection();
           stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadastrarLivro.getTitulo());
            stmt.setString(2, cadastrarLivro.getGenero());
            stmt.setString(3, cadastrarLivro.getPaginas());
            stmt.setString(4, cadastrarLivro.getResumo());
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Cadastro de livro realizado");
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

