package biblioteca;

import biblioteca.model.Autor;
import biblioteca.model.Livro;
import biblioteca.service.Biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor(1,"Robert Martin", LocalDate.of(1952, 12, 5));
        Autor autor2 = new Autor(2, "John Carter",  LocalDate.of(1997, 2, 15));
        Autor autor3 = new Autor(3, "Phillips", LocalDate.of(2005, 6, 5));

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);
        biblioteca.adicionarAutor(autor3);

        Livro livro1 = new Livro(1, "Java Básico", autor1);
        Livro livro2 = new Livro(2, "Um time show de Bola do Baska", autor2);
        Livro livro3 = new Livro(3, "Diário de um banana", autor3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("|| SEJA BEM VINDO AO SISTEMA DA LIVRARIA! ||");
        System.out.println("Deseja ver a lista de livros disponíveis? (SIM/NÃO)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("SIM")) {
            biblioteca.listarLivrosDisponiveis();

            System.out.println("Para realizar o empréstimo do Livro, insira o ID:");

            int solicitarID;

            try {
                solicitarID = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ID Inválido, encerrando o sistema...");
                scanner.close();
                return;
            }

            System.out.println("Insira seu nome para registro:");
            String solicitarNome = scanner.nextLine();

            if (solicitarNome.isBlank()) {
                System.out.println("Nome inválido. Encerrando o sistema.");
                scanner.close();
                return;
            }

            biblioteca.realizarEmprestimo(solicitarID, solicitarNome);

            biblioteca.listarLivrosDisponiveis();

            System.out.println("Até logo...");
        } else {
            System.out.println("Sem problemas! Até logo...");
        }

        scanner.close();
    }
}
