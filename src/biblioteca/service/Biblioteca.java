package biblioteca.service;

import biblioteca.model.Autor;
import biblioteca.model.Livro;
import biblioteca.model.Emprestimo;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarTodosOsLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public Livro buscarLivroPorId(int id) {
        for  (Livro livro : livros) {
            if(livro.getId() == id) {
                return livro;
            }
        }
        return null;
    };

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

}
