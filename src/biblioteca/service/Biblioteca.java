package biblioteca.service;

import biblioteca.model.Autor;
import biblioteca.model.Livro;
import biblioteca.model.Emprestimo;

import java.time.LocalDate;
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
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    ;

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void realizarEmprestimo(int idLivro, String nomeCliente) {

        Livro livro = buscarLivroPorId(idLivro);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        } else if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo!");
            return;
        } else {
            Emprestimo emprestimo = new Emprestimo(emprestimos.size() + 1, livro, nomeCliente);
            emprestimos.add(emprestimo);

            livro.setDisponivel(false);
            livro.setDataAtualizacao(LocalDate.now());

            System.out.println("Empréstimo realizado com sucesso!");
        }


    }

}
