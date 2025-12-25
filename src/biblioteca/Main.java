package biblioteca;

import biblioteca.model.Autor;
import biblioteca.model.Livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor(1,"Robert Martin", LocalDate.of(1952, 12, 5));

        System.out.println(autor);
    }
}
