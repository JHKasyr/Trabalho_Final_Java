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
                    cliente.setStatus(rs.getBoolean("Status"));
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
    public void alterarCliente(ClienteModel alterarCliente) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.usuario SET nome=?, cpf=?, email=?, endereco=?, datanascimento=? WHERE codigo=?";

        try {
            conn = new ConexaoDaoUsuario().getConnection(); 
            stmt = conn.prepareStatement(sql); 
            stmt.setString(1, alterarCliente.getNome());
            stmt.setString(2, alterarCliente.getCpf());
            stmt.setString(3, alterarCliente.getEmail());
            stmt.setString(4, alterarCliente.getEndereço());
            stmt.setString(5, alterarCliente.getDataNascimento());
            stmt.setInt(6, alterarCliente.getId());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Sucesso ao alterar contato");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao alterar contato \n" + e);
            System.out.println("erro ao alterar contato \n" + e);
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

    }

    public void excluirCliente(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.usuario WHERE codigo=?";

        try {
            conn = new ConexaoDaoUsuario().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão de dados " + e);
        }
    }
        public ArrayList<ClienteModel> searchModel(String id) {

            
            System.out.println("Valor do ID: " + id);
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        ClienteModel cliente = null;
        ArrayList<ClienteModel> listaClientes = null;

        String sql = "SELECT * FROM ROOT.USUARIO WHERE nome LIKE '%"+ id +"%' ORDER BY nome";

        try {
            conn = new ConexaoDaoUsuario().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaClientes = new ArrayList<>();
                while (rs.next()) {
                    cliente = new ClienteModel();
                    cliente.setId(rs.getInt("codigo"));
                    cliente.setNome(rs.getString("nome"));
                    String statusString = rs.getString("status");
                    boolean status;
    
    if (statusString != null && !statusString.isEmpty()) {
        // Se o campo status não for nulo e não estiver vazio, 
        // então assumimos que ele contém um valor verdadeiro
        status = true;
    } else {
        // Se o campo status for nulo ou vazio, 
        // então assumimos que ele contém um valor falso
        status = false;
    }
    
    cliente.setStatus(status);
                    
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
        public void emprestarLivro(int idCliente, int idLivro){
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE FROM ROOT.usuario SET status = true WHERE id=?";

        try {
            conn = new ConexaoDaoUsuario().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setBoolean(7,status);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão de dados " + e);
        }
        }
}
