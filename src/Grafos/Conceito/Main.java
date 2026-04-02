package Grafos.Conceito;

import java.util.ArrayList;
import java.util.LinkedList;

class Grafo {
    private ArrayList<String> cidades;
    private ArrayList<LinkedList<String>> rotas;

    // construtor
    public Grafo (){
        cidades = new ArrayList<>();
        rotas = new ArrayList<>();
    }

    // adicionar cidade
    public void adicionarCidade(String cidade){
        cidades.add(cidade);
        rotas.add(new LinkedList<>());
    }

    // adicionar conexão/rota (não direcionado)
    public void adicionarRota(String origem, String destino){
        int iOrigem = cidades.indexOf(origem);
        int iDestino = cidades.indexOf(destino);

        // em java, quando alguma coisa da errado, no terminal ele retorna "-1"
        // então se tudo der certo, o programa vai seguir essa cpndição a seguir:
        if (iOrigem != -1 && iDestino != -1){
            rotas.get(iOrigem).add(destino);
            rotas.get(iDestino).add(origem);
        }
    }

    // imprimir o grafo
    public void imprimir(){
        // em java, o ".size()" equivale à função "len()" em python
        for (int i = 0; i < cidades.size(); i++) {
            System.out.print(cidades.get(i) + "->");

            for (String destino : rotas.get(i)) {
                System.out.print(destino + " ");
            }
            System.out.println();
        }
    }

}

public class Main {

    public static void main(String[] args) {

        System.out.println("Primeiro nós importamos:");
        System.out.println("import java.util.ArrayList;");
        System.out.println("import java.util.LinkedList;");

        System.out.println("\nIdeia mental - você vai ter:\n");
        System.out.println("•Uma lista de cidades (nós)");
        System.out.println("•Uma lista de conexões (arestas)\n");

        System.out.println("Assim: ");
        System.out.println("ArrayList<String> cidades;");
        System.out.println("ArrayList<LinkedList<String>> rotas;");

        System.out.println("Antes de dar continuidade on código, observe a classe Grafo lá em cima, " +
                "depois volte aqui para ver como vamos usar.\n");

        Grafo g = new Grafo();

        // adicionando cidades:
        g.adicionarCidade("Brasília");
        g.adicionarCidade("Rio de Janeiro");
        g.adicionarCidade("São Paulo");

        // adicionando rotas:
        g.adicionarRota("Brasília", "São Paulo");
        g.adicionarRota("São Paulo", "Rio de Janeiro");

        g.imprimir();

    }
}
