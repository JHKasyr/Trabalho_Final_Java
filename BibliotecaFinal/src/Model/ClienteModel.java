package Model;

import DAO.DaoUsuario;

public class ClienteModel {
    
    int id;
    String cpf;
    String nome;
    String endereço;
    String dataNascimento;
    String email;
    
    // Construtores
    public ClienteModel() {
    }

    public ClienteModel(String cpf, String nome, String endereço, String dataNascimento, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public ClienteModel(int id, String cpf, String nome, String endereço, String dataNascimento, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
    
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public void cadastrarClienteDAO(ClienteModel novoCliente) {
        DaoUsuario novoRegistro = new DaoUsuario();
        novoRegistro.inserirClienteDAO(novoCliente);
    }
}
