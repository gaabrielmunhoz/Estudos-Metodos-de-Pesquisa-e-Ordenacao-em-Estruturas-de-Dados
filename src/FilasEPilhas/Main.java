package FilasEPilhas;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nPrimeiro classe e objeto básico, só pra relembrar:\n\n");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        System.out.println("\nTítulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAno()+"\n");


        System.out.println("\nAgora uma LinkedList básica:");
    }
}
