package Controller;

import Model.AutorModel;
import javax.swing.JOptionPane;

public class AutorController {
    
    public void cadastrarAutorController(String nome, String nacionalidade){
        
        if((nome != null && nome.length()>0) && (nacionalidade != null && nacionalidade.length()>0)){
            
            AutorModel novoAutor = new AutorModel(nome, nacionalidade);
            novoAutor.cadastrarAutorDAO(novoAutor);
        } else {           
            
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }
}
