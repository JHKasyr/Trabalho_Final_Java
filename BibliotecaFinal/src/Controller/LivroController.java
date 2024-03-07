package Controller;

import Model.LivroModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroController {

    public void cadastrarLivroController(String titulo, String genero, String paginas, String resumo) {

        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (paginas != null && paginas.length() > 0)
                && (resumo != null && resumo.length() > 0)) {

            LivroModel novoLivro = new LivroModel(titulo, genero, paginas, resumo);
            novoLivro.cadastrarLivroDAO(novoLivro);
        } else {

            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }

    public ArrayList<LivroModel> listarLivrosController() {
        LivroModel Livro = new LivroModel();
        return Livro.buscarLivro();
    }

    public void alterarLivroController(int id, String titulo, String genero, String paginas, String Sinopse) {
        if ((id != 0)
                && (titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (paginas != null && genero.length() > 0)
                && (Sinopse != null && genero.length() > 0)) {

            LivroModel alterarLivro = new LivroModel(id, titulo, genero, paginas, Sinopse);
            alterarLivro.alterarLivroModel(alterarLivro);
            JOptionPane.showMessageDialog(null, "chgando ate controller cliente");
        }
    }

    public void excluirLivro(int id) {
        LivroModel idLivro = new LivroModel();
        idLivro.excluirLivro(id);
        JOptionPane.showMessageDialog(null, "chgando ate controller cliente");
    }
}