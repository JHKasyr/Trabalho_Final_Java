package DAO;

import Model.LivroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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

    public ArrayList<LivroModel> listarTodosLivrosTabela() {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        LivroModel livro = null;
        ArrayList<LivroModel> listaLivro = null;

        String sql = "SELECT * FROM ROOT.livro";

        try {
            conn = new ConexaoDaoLivro().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaLivro = new ArrayList<>();
                while (rs.next()) {
                    livro = new LivroModel();
                    livro.setId(rs.getInt("codigo"));
                    livro.setTitulo(rs.getString("titulo"));
                    livro.setGenero(rs.getString("genero"));
                    livro.setPaginas(rs.getString("paginas"));
                    livro.setResumo(rs.getString("sinopse"));
                    listaLivro.add(livro);
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
        return listaLivro;
    }

    public void alterarLivro(LivroModel alterarLivro) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.livro SET titulo=?, genero=?, paginas=?, sinopse=? WHERE codigo=?";

        try {
            conn = new ConexaoDaoLivro().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, alterarLivro.getTitulo());
            stmt.setString(2, alterarLivro.getGenero());
            stmt.setString(3, alterarLivro.getPaginas());
            stmt.setString(4, alterarLivro.getResumo());
            stmt.setInt(5, alterarLivro.getId());
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

    public void excluirLivro(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.livro WHERE codigo=?";

        try {
            conn = new ConexaoDaoLivro().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão de dados " + e);
        }
    }
}
