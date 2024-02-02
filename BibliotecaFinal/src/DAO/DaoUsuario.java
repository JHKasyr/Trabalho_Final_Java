/*
package DAO;


import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DaoUsuario {
    public void inserirClienteDAO(UsuarioModel novoUsuario) {
        String sql = "INSERT INTO usuario (nome, cpf, email, endereco, datanascimento) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        Connection connection = null;

        try {
            connection = new ConexaoDaoUsuario().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoUsuario.getNome());
            stmt.setString(2, novoUsuario.getCpf());
            stmt.setString(3, novoUsuario.getEmail());
            stmt.setString(4, novoUsuario.getEndereco());
            stmt.setString(5, novoUsuario.getDataNascimento());
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
    
*/