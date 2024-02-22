package Model;

import DAO.DaoLivro;
import java.util.ArrayList;

public class LivroModel {
    
    int id;
    String titulo;
    String genero;
    String paginas;
    String resumo;
    
    // Construtores
    public LivroModel() {
    }

    public LivroModel(String titulo, String genero, String paginas, String resumo) {
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
        this.resumo = resumo;
    }

    public LivroModel(int id, String titulo, String genero, String paginas, String resumo) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
        this.resumo = resumo;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
         public void cadastrarLivroDAO(LivroModel novoLivro) {
         DaoLivro novoRegistro = new DaoLivro();
        novoRegistro.inserirLivroDAO(novoLivro);
    }
    public ArrayList<LivroModel> buscarLivro() {
    return new DaoLivro().listarTodosLivrosTabela();
    }
}
