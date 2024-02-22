package DAO;


import Model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DaoUsuario {
    public void inserirClienteDAO(ClienteModel novoUsuario) {
        String sql = "INSERT INTO usuario (nome, cpf, email, endereco, datanascimento) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        Connection connection = null;

        try {
            connection = new ConexaoDaoUsuario().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoUsuario.getNome());
            stmt.setString(2, novoUsuario.getCpf());
            stmt.setString(3, novoUsuario.getEmail());
            stmt.setString(4, novoUsuario.getEndereço());
            stmt.setString(5, novoUsuario.getDataNascimento());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastro de usuario Realizado com sucesso");
            JOptionPane.showMessageDialog(null, "Dao funcionou");
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
        
    public ArrayList<ClienteModel> listarTodosClientesTabela() {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        ClienteModel cliente = null;
        ArrayList<ClienteModel> listaClientes = null;

        String sql = "SELECT * FROM ROOT.usuario";

        try {
            conn = new ConexaoDaoUsuario().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaClientes = new ArrayList<>();
                while (rs.next()) {
                    cliente = new ClienteModel();
                    cliente.setId(rs.getInt("codigo"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereço(rs.getString("Endereco"));
                    cliente.setDataNascimento(rs.getString("dataNascimento"));
                    listaClientes.add(cliente);
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
        return listaClientes;
    }  
}
