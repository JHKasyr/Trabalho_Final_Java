package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDaoUsuario {
    public Connection getConnection(){
    
        Connection conn = null;
        String className = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/bibliotecaUsuario";
        String user = "";
        String password = "";
        
        try {
            Class.forName(className);
            System.out.println("ClasseName com valor correto!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar conexão!");
        }
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Falha ao conectar \n erro: "+e);
        }
        return conn;
    }
}
