package Model;

import DAO.DaoAutor;
import java.util.ArrayList;

public class AutorModel {
    
    int id;
    String nome;
    String nacionalidade;
    
    // Construtores
    public AutorModel() {
    }
    
    public AutorModel(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public AutorModel(int id, String nome, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
     public void cadastrarAutorDAO(AutorModel novoAutor) {
         DaoAutor novoRegistro = new DaoAutor();
        novoRegistro.inserirAutorDAO(novoAutor);
    }
     public ArrayList<AutorModel> buscarAutor() {
    return new DaoAutor().listarTodosAutoresTabela();
    }
}
