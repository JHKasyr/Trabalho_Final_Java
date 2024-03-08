package Controller;

import Model.ClienteModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteController {
    
    public void cadastrarClienteController(String cpf, String nome, String endereço, String dataNascimento, String email){
        
        if((cpf != null && cpf.length()>0) && 
                (nome != null && nome.length()>0) &&
                (endereço != null && endereço.length()>0) &&
                (dataNascimento != null && dataNascimento.length()>0) &&
                (email != null && email.length()>0)){
            
            ClienteModel novoCliente = new ClienteModel(cpf, nome, endereço, dataNascimento, email, false);
            novoCliente.cadastrarClienteDAO(novoCliente);
        } else {           
            
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }
        public ArrayList<ClienteModel> listarClientesController(){
        ClienteModel Cliente = new ClienteModel();
        return Cliente.buscarCliente();
    }
        public void alterarClienteController(int id, String nome, String cpf, String email, String endereco,  String dataNascimento){
        if((id != 0) &&
                (nome != null && nome.length() > 0)
                && (cpf != null && cpf.length() > 0)
                && (email != null && email.length() > 0)
                && (endereco != null && endereco.length() > 0)
                && (dataNascimento != null && dataNascimento.length() > 0)) {
            
            ClienteModel clienteAjuste = new ClienteModel(id, cpf, nome, endereco, dataNascimento, email, false);
            clienteAjuste.alterarClienteModel(clienteAjuste);
            JOptionPane.showMessageDialog(null, "chgando ate controller cliente");
        }
    }
            
    public void excluirCliente(int id){
        ClienteModel idUsuario = new ClienteModel();
        idUsuario.excluirCliente(id);
        JOptionPane.showMessageDialog(null, "chgando ate controller cliente");
    }
    
        public ArrayList<ClienteModel> searchCliente(String id){
        ClienteModel contato = new ClienteModel();
        return contato.searchCliente(id);
        

    }
        public void emprestarLivroController(int id, Boolean status){
             try {
            // Buscar o cliente pelo ID
            ClienteModel cliente = ClienteDAO.buscarClientePorId(clienteId);
            if (cliente == null) {
                System.out.println("Cliente não encontrado com o ID: " + clienteId);
                return;
            }
            
            // Buscar o livro pelo ID
            LivroModel livro = LivroDAO.buscarLivroPorId(livroId);
            if (livro == null) {
                System.out.println("Livro não encontrado com o ID: " + livroId);
                return;
            }
            
            // Verificar se o livro já está emprestado
            if (livro.isStatusEmprestado()) {
                System.out.println("O livro já está emprestado.");
                return;
            }
            
            // Alterar o status do livro para emprestado
            livro.setStatusEmprestado(true);
            LivroDAO.atualizarLivro(livro);
            
            // Aqui você também pode implementar outras ações, como atualizar o status do cliente
            
            System.out.println("Livro emprestado com sucesso para o cliente com ID: " + clienteId);
        } catch (Exception e) {
            System.out.println("Erro ao emprestar livro: " + e.getMessage());
        }
    }
        }
}
