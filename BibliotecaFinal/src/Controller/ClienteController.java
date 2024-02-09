package Controller;

import Model.ClienteModel;
import javax.swing.JOptionPane;

public class ClienteController {
    
    public void cadastrarClienteController(String cpf, String nome, String endereço, String dataNascimento, String email){
        
        if((cpf != null && cpf.length()>0) && 
                (nome != null && nome.length()>0) &&
                (endereço != null && endereço.length()>0) &&
                (dataNascimento != null && dataNascimento.length()>0) &&
                (email != null && email.length()>0)){
            
            ClienteModel novoCliente = new ClienteModel(cpf, nome, endereço, dataNascimento, email);
            novoCliente.cadastrarClienteDAO(novoCliente);
        } else {           
            
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }
}
