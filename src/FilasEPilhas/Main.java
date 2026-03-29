package FilasEPilhas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

        System.out.println("\n\nExercício 4 - Filas (Queue)\n");

        System.out.println("Lista de livros disponíveis: ");
        for (Livro livros : biblioteca) {
            System.out.println("\n\nTítulo: " + livros.getTitulo() + "\nAutor: " + livros.getAutor()
                    + "\nAnos de publicação: " + livros.getAno());
        }

        Queue<String> filaLivro = new LinkedList<>();
        filaLivro.add("Gabriel");
        filaLivro.add("Gisele");
        filaLivro.add("Fernanda");

        System.out.println("\n\nPosições da fila:");
        int posicao = 1;
        for (String nome : filaLivro) {
            System.out.println(posicao +"º: " + nome);
            posicao++;
        }

        System.out.println("\nPróximo da fila: "+filaLivro.peek());

        String atendido = filaLivro.poll();
        System.out.println("Livros entregues para: " + atendido);

        System.out.println("\nPosições da fila:");
        int novaPosicao = 1;
        for (String nome : filaLivro) {
            System.out.println(novaPosicao +"º: " + nome);
            novaPosicao++;
        }

        System.out.println("\n\nExercício 5 - Pilhas (Stack)");
        System.out.println("\nAntes de iniciar o exercício 5, vou revisar alguns conceitos sobre pilhas.");
        System.out.println("Imagine uma pilha de pratos, o último a ser colocado na pilha\n" +
                "é o primeiro que a gente vai pegar. - - - LIFO: Last In - Fist Out");

        System.out.println("\n\nPrecisamos importar: java.util.Stack;");
        System.out.println("\nE criar assim: \nStack<String> historico = new Stack<>();");

        System.out.println("\n\nMétodos principais da pilha:");
        System.out.println("push(): adiciona um item no topo da pilha.");
        System.out.println("peek(): mostra o item que está no topo da pilha.");
        System.out.println("pop(): remove o item que está no topo da pilha.\n\n");

        System.out.println("Criando a pilha...\n");
        Stack<String> historico = new Stack<>();
        historico.push("Dom Casmurro");
        historico.push("1984");
        historico.push("Harry Potter");

        System.out.println("Ordem adicionada:");
        for (String pilha : historico) {
            System.out.println(pilha);
        }

        System.out.println("Último adicionado (topo da pilha): " + historico.peek());
        System.out.println("Removendo o livro que está no topo da pilha...");
        String removido = historico.pop();
        System.out.println("Livro removido: " + removido);
        System.out.println("Livro que está no topo da pilha: " + historico.peek());

    }
}
