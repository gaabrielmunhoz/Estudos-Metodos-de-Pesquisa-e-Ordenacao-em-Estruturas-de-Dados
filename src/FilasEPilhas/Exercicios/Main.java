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
            System.out.println(posicao + "º: " + indice);
            posicao++;
        }

    }
}
