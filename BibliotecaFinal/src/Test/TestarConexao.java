package Test;

import DAO.ConexaoDaoUsuario;

import java.sql.Connection;
import java.sql.SQLException;

public class TestarConexao {
    public static void main(String[] args) {
        ConexaoDaoUsuario conexaoDaoUsuario = new ConexaoDaoUsuario();

        try {
            Connection connection = conexaoDaoUsuario.getConnection();
            if (connection != null) {
                System.out.println("Conexão bem-sucedida! Agora você pode realizar operações no banco de dados.");
                // Adicione aqui as operações que deseja realizar no banco de dados
                // Exemplo: consulta, inserção, atualização, exclusão, etc.
                connection.close(); // Certifique-se de fechar a conexão quando terminar
            } else {
                System.out.println("Falha ao obter conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro durante a execução do teste de conexão: " + e.getMessage());
        }
    }
}