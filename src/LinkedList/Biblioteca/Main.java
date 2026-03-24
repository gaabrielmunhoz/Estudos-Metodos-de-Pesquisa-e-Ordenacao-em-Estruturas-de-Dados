package LinkedList.Biblioteca;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Livro> biblioteca = new LinkedList<>();

        biblioteca.add(new Livro("titulo 1", "autor 1", 2024));
        biblioteca.add(new Livro("titulo 2", "autor 2", 2025));
        biblioteca.add(new Livro("titulo 3", "autor 3", 2026));

        for (Livro livro : biblioteca) {
            System.out.print(String.format("\nTítulo do livro: %s\nNome do autor: %s\nAno de publicação: %d\n",
                    livro.getTitulo(),livro.getAutor(),livro.getAno()));
        }
    }
}
