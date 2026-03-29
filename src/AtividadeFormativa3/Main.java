package AtividadeFormativa3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Criando a linked list
        LinkedList<Livro> livro = new LinkedList<>();

        // Adicionando livros na LinkedList
        livro.add(new Livro("1984", "George Orwell", 1949));
        livro.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livro.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));

        // Laço for para listar os livros disponíveis

        System.out.println("\n- - - Biblioteca - - -\n");
        System.out.println("Lista de livros:");
        for (Livro infoLivro : livro) {
            System.out.println("\nTítulo: " + infoLivro.getTitulo());
            System.out.println("Autor(a): " + infoLivro.getAutor());
            System.out.println("Ano de publicação: " + infoLivro.getAnoPublicacao());
        }
    }
}
