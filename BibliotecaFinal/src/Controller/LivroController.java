package Controller;

import Model.LivroModel;
import javax.swing.JOptionPane;

public class LivroController {
    
    public void cadastrarLivroController(String titulo, String genero, String paginas, String resumo){
        
        if((titulo != null && titulo.length()>0) && 
                (genero != null && genero.length()>0) &&
                (paginas != null && paginas.length()>0) &&
                (resumo != null && resumo.length()>0)){
            
            LivroModel novoLivro = new LivroModel(titulo, genero, paginas, resumo);
            novoLivro.cadastrarLivroDAO(novoLivro);
        } else {           
            
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }
}
