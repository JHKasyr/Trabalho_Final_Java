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
    
        public ArrayList<ClienteModel> searchClient(int id){
        ClienteModel contato = new ClienteModel();
        JOptionPane.showMessageDialog(null, "chegando até controller");
        return contato.searchCliente(id);
    }
}
