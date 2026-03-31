package FilasEPilhas.Exercicios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

        System.out.println("\n\nExercício 3");

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

        System.out.println("\n\nExercício 4\n");
        Queue<String> removerEspecifico = new LinkedList<>();
        removerEspecifico.add(new String("Gabriel"));
        removerEspecifico.add(new String("Ana"));
        removerEspecifico.add(new String("Pedro"));
        removerEspecifico.add(new String("Ana"));
        removerEspecifico.add(new String("Lucas"));

        boolean executandoRemover = true;
        while (executandoRemover) {
            int posicoesRemover = 1;
            System.out.println("- - - FILA - - -");
            for (String k : removerEspecifico){
                System.out.println(posicoesRemover + "º: " + k);
                posicoesRemover++;
            }

            if (removerEspecifico.size()<5){
                break;
            } else {
                boolean remover = true;
                System.out.println("\nRemovendo todos os nomes \"Ana\" da fila.\n");
                while (remover) {
                    int quantidade = 1;
                    remover = removerEspecifico.remove("Ana");
                    quantidade++;
                    if (!remover) {
                        System.out.println("Quantidade encontrada: " + quantidade + "\n");
                        break;
                    }
                }

            }

        }

        System.out.println("\n\nExercício 5\n");

        Queue<String> inverterFila = new LinkedList<>();
        Stack<String> filaInvertida = new Stack<>();

        inverterFila.add(new String("A"));
        inverterFila.add(new String("B"));
        inverterFila.add(new String("C"));
        inverterFila.add(new String("D"));
        inverterFila.add(new String("E"));

        while (!inverterFila.isEmpty()){
            String l = inverterFila.peek();
            filaInvertida.push(l);
            System.out.println(inverterFila.poll());
        }

        System.out.println("\nFila invertida (com Stack)");
        while (!filaInvertida.isEmpty()){
            System.out.println(filaInvertida.pop());
        }

        System.out.println("\n\nExercício 6\n");

        Queue<Integer> pares = new LinkedList<>();

        pares.add(1);
        pares.add(2);
        pares.add(3);
        pares.add(4);
        pares.add(5);
        pares.add(6);

        System.out.println("Todos os números informados:");
        for (int i : pares){
            System.out.println(i);
        }

        System.out.println("\nNúmeros que são pares (sem remover da fila):");
        int quantidadePares = 0;
        for (int i : pares){
            int par = i;

            if (par % 2 == 0){
                System.out.println(i);
                quantidadePares++;
            }
        }
        System.out.println("\nQuantos números são pares?\n" + quantidadePares);

        System.out.println("\n\nExercício 7\n");
        Queue<Integer> filaNormal = new LinkedList<>();
        Queue<Integer> filaPrioridade = new LinkedList<>();

        filaNormal.add(20);
        filaNormal.add(25);
        filaNormal.add(59);
        filaNormal.add(42);
        filaNormal.add(31);
        filaNormal.add(27);

        filaPrioridade.add(60);
        filaPrioridade.add(72);

        System.out.println("Fila normal:");
        int lugarNaFilaNormal = 1;
        for (int i : filaNormal) {
            System.out.println(lugarNaFilaNormal + "º: " + i);
            lugarNaFilaNormal++;
        }

        int lugarNaFilaPreferencial = 1;


        System.out.println("\nFila prioridade:");
        for (int i : filaPrioridade) {
            System.out.println(lugarNaFilaPreferencial + "º: " + i);
            lugarNaFilaPreferencial++;
        }

        System.out.println("\nAndamento da fila:");
        int contador = 0;
        while (!filaNormal.isEmpty() || !filaPrioridade.isEmpty()){

            if (!filaNormal.isEmpty() && contador < 2){
                System.out.println("Atendendo pessoa com a idade de "+ filaNormal.poll() + " anos.");
                contador++;
            }

            if (contador == 2 && !filaPrioridade.isEmpty()){
                System.out.println("Atendendo pessoa com prioridade de idade de "+ filaPrioridade.poll() + " anos.");
                contador = 0;
            }

            if (filaPrioridade.isEmpty() && !filaNormal.isEmpty() && contador == 2){
                contador = 0;
            }

            if (filaNormal.isEmpty() && !filaPrioridade.isEmpty()){
                System.out.println("Atendendo pessoa com prioridade de idade de "+ filaPrioridade.poll() + " anos.");
            }
        }

        System.out.println("\n\nRefazendo exercício 7\n");
        Queue<Integer> filaNorm = new LinkedList<>();
        Queue<Integer> filaPref = new LinkedList<>();

        filaNorm.add(20);
        filaNorm.add(21);
        filaNorm.add(22);
        filaNorm.add(23);
        filaNorm.add(24);
        filaNorm.add(25);
        filaNorm.add(26);

        filaPref.add(70);
        filaPref.add(75);
        filaPref.add(60);

        System.out.println("Posições da fila normal:");

        int posicaoNorm = 1;
        for (int i : filaNorm){
            System.out.println(posicaoNorm + "º: " + i);
            posicaoNorm++;
        }

        System.out.println("\nPosições da fila preferencial:");

        int posicoesPref = 1;
        for (int i : filaPref) {
            System.out.println(posicoesPref + "º: " + i);
            posicoesPref++;
        }

        int contagem = 0;
        while (!filaNorm.isEmpty() || !filaPref.isEmpty()){

            if (!filaNorm.isEmpty() && contagem < 2) {
                System.out.println("Atendendimento normal - idade: " + filaNorm.poll());
                contagem++;
            }

            if (!filaPref.isEmpty() && contagem == 2) {
                System.out.println("Atendimento prioritário - idade: " + filaPref.poll());
                contagem = 0;
            }

            if (filaPref.isEmpty() && !filaNorm.isEmpty() && contagem == 2) {
                contagem = 0;
            }

            if (filaNorm.isEmpty() && !filaPref.isEmpty()) {
                System.out.println("Atendimento prioritário - idade: " + filaPref.poll());
            }


        }

        System.out.println("\n\nExercício 8\n");

    }
}
