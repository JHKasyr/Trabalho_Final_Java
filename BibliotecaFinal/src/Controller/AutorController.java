package Controller;

import Model.AutorModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AutorController {

    public void cadastrarAutorController(String nome, String nacionalidade) {

        if ((nome != null && nome.length() > 0) && (nacionalidade != null && nacionalidade.length() > 0)) {

            AutorModel novoAutor = new AutorModel(nome, nacionalidade);
            novoAutor.cadastrarAutorDAO(novoAutor);
        } else {

            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public ArrayList<AutorModel> listarAutoresController() {
        AutorModel Livro = new AutorModel();
        return Livro.buscarAutor();
    }
     public void alterarAutorController(int id, String nome, String nacionalidade){
        if ((id != 0) &&
                (nome != null && nome.length() > 0)
                && (nacionalidade != null && nacionalidade.length() > 0)){
               
            AutorModel alterarAutor = new AutorModel(id, nome, nacionalidade);
            alterarAutor.alterarAutorModel(alterarAutor);
            JOptionPane.showMessageDialog(null, "chgando ate controller cliente");
        }
    }
            
    public void excluirAutor(int id){
        AutorModel idAutor = new AutorModel();
        idAutor.excluirCliente(id);
        JOptionPane.showMessageDialog(null, "chgando ate controller cliente");
    }
}
