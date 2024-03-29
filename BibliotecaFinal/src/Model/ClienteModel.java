package Model;

import DAO.DaoUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteModel {
    
    int id;
    String cpf;
    String nome;
    String endereço;
    String dataNascimento;
    String email;
    boolean status;
    
    // Construtores
    public ClienteModel() {
    }

    public ClienteModel(String cpf, String nome, String endereço, String dataNascimento, String email, boolean status) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.status = status;
    }

    public ClienteModel(int id, String cpf, String nome, String endereço, String dataNascimento, String email, boolean status) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public void cadastrarClienteDAO(ClienteModel novoCliente) {
        DaoUsuario novoRegistro = new DaoUsuario();
        novoRegistro.inserirClienteDAO(novoCliente);
    }
    public ArrayList<ClienteModel> buscarCliente() {
    return new DaoUsuario().listarTodosClientesTabela();
    }
    
    public void alterarClienteModel(ClienteModel alterarCliente) {
        new DaoUsuario().alterarCliente(alterarCliente);
    }

    public void excluirCliente(int id) {
        new DaoUsuario().excluirCliente(id);
    }
    public ArrayList<ClienteModel> searchCliente(String id) {
    return new DaoUsuario().searchModel(id);
    }
    public void emprestarLivroModel(int clienteId, int livroId){
        new DaoUsuario().emprestarLivro(clienteId, livroId);
        
    }
    

}
