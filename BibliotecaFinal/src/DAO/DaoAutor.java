
package DAO;

import Model.AutorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoAutor {
       public void inserirAutorDAO(AutorModel cadastrarAutor) {
       String sql = "INSERT INTO AUTOR (nome, nacionalidade) VALUES (?,?)";
       PreparedStatement stmt = null;
       Connection connection = null;

       try {
           connection = new ConexaoDaoAutor().getConnection();
           stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadastrarAutor.getNome());
            stmt.setString(2, cadastrarAutor.getNacionalidade());
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
    public ArrayList<AutorModel> listarTodosAutoresTabela() {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        AutorModel autor = null;
        ArrayList<AutorModel> listaAutor = null;

        String sql = "SELECT * FROM ROOT.autor";

        try {
            conn = new ConexaoDaoAutor().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaAutor = new ArrayList<>();
                while (rs.next()) {
                    autor = new AutorModel();
                    autor.setId(rs.getInt("codigo"));
                    autor.setNome(rs.getString("nome"));
                    autor.setNacionalidade(rs.getString("nacionalidade"));
                    listaAutor.add(autor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar regitro!");
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
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
        return listaAutor;
    }  


}
