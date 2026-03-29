package FilasEPilhas;

import java.util.LinkedList;
import java.util.Queue;

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

        System.out.println("\n\nOk, agora vamos começar os estudos da semana 3.\n\n ------ FILAS E PILHAS ------\n");
        System.out.println("Precismos importar java.util.Queue e java.util.LinkedList\n\nA fila segue a seguinte estrutura:\nQueue<String> fila = new LinkedList<>();\n");

        Queue<String> fila = new LinkedList<>();
        fila.add("João");
        fila.add("Maria");
        fila.add("José");

        System.out.println("Veja que fica em formato de lista e que joão é o primeiro da fila: \n" + fila);
        // se rodar o código vai retornar [João, Maria, Jose]

        System.out.println("\nVer quem é o próximo da fila sem remover: \n" + fila.peek());
        System.out.println("\nRemover o primeiro da fila: \n" + fila.poll());
        System.out.println("\nVeja como ficou a lista agora:\n" + fila);
        System.out.println("\nAgora o próximo da fila é:\n" + fila.peek());

        System.out.println("\nEntão fila.add() adiciona um elemento no final da fila. Vamos adicionar 'Elemento'.");
        fila.add("Elemento");
        System.out.println("fila.peek() mostra quem é o próximo da fila: " + fila.peek());
        System.out.println("e fila.pool() remove o primeiro elemento da fila: " + fila.poll());
        System.out.println("Agora a lista da fila está assim: " + fila);



    }
}
