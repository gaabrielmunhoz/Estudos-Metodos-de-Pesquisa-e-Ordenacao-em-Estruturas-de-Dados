package FilasEPilhas.Exercicios;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nExercício 1\n");
        Queue<String> nomes = new LinkedList<>();

        nomes.add(new String("Gabriel"));
        nomes.add(new String("Gisele"));
        nomes.add(new String("Fernanda"));

        int posicao = 1;
        for (String indice : nomes) {
            System.out.println(posicao + "º" + indice);
            posicao++;
        }

        System.out.println("\n\nExercício 2");
        Queue<String> atenderFila = new LinkedList<>();

        atenderFila.add(new String("Gabriel"));
        atenderFila.add(new String("Fernanda"));
        atenderFila.add(new String("Gisele"));
        atenderFila.add(new String("Maurício"));
        atenderFila.add(new String("Anna"));

        boolean executando = true;
        while (executando) {
            int posicaoFila = 1;
            System.out.println("\n- - - Posições na fila - - -");
            for (String i : atenderFila){
                System.out.println(posicaoFila + "º" + i);
                posicaoFila++;
            }

            System.out.println("\nAtendendo: " + atenderFila.poll());
            System.out.println("Restam: " + atenderFila.size() + " pessoas.");

            if (atenderFila.size() == 0){
                System.out.println("\nTodos foram atendidos.");
                break;
            }

        }

        System.out.println("\nExercício 3");

        System.out.println("\nMostrar quem é o próximo da fila sem remover.");
        Queue<String> proximoFila = new LinkedList<>();
        proximoFila.add(new String("João"));
        proximoFila.add(new String("Maria"));
        proximoFila.add(new String("José"));

        int posicoes = 1;
        for (String j : proximoFila){
            System.out.println(posicoes + "º: " + j);
            posicoes++;
        }
        System.out.println("Próximo da fila: " + proximoFila.peek());

    }
}
