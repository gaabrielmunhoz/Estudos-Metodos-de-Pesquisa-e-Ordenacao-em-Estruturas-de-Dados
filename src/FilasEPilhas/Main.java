package FilasEPilhas;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nPrimeiro classe e objeto básico, só pra relembrar:\n\n");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAno()+"\n");


        System.out.println("\nAgora uma LinkedList básica:");

        LinkedList<Livro> biblioteca = new LinkedList<>();
        biblioteca.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        biblioteca.add(new Livro("1984", "George Orwell", 1949));
        biblioteca.add(new Livro("Capitães da Areia","Jorge Amado", 1937));

        for (Livro livros : biblioteca) {
            System.out.println("\n\nTítulo: " + livros.getTitulo() + "\nAutor: " + livros.getAutor()
                    + "\nAnos de publicação: " + livros.getAno());
        }
    }
}
