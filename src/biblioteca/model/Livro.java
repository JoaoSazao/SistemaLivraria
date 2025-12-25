package biblioteca.model;

import java.time.LocalDate;

public class Livro {

    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    private boolean disponivelPadrao = true;

    public Livro(int id, String titulo, Autor autor, boolean disponivelPadrao) {}
}
