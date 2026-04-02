package Grafos.Exercicios.Questao3;

// 3. Metodo adicionarRota
// Crie um metodo:
// adicionarRota(String origem, String destino)
// 👉 Ele deve:
// conectar as duas cidades
// funcionar como grafo não direcionado (vai e volta)
// 💡 dica mental:
// adiciona 2 vezes (ida e volta)

import java.util.ArrayList;
import java.util.LinkedList;

class Grafo {
    private ArrayList<String> cidades;
    private ArrayList<LinkedList<String>> rotas;

    //construtor
    public Grafo(){
        cidades = new ArrayList<>();
        rotas = new ArrayList<>();
    }

    // adicionar cidade
    public void adicionarCidade(String cidade) {
        cidades.add(cidade);
        rotas.add(new LinkedList<>());
    }

    // adicionar rotas não direcionadas
    public void adicionarRota(String origem, String destino) {
        int iOrigem = cidades.indexOf(origem);
        int iDestino = cidades.indexOf(destino);

        if (iOrigem != -1 && iDestino != -1) {
            rotas.get(iOrigem).add(destino);
            rotas.get(iDestino).add(origem);
        }
    }

    public void imprimir(){
        for (int i = 0; i < cidades.size(); i++) {
            System.out.print(cidades.get(i) + " -> ");

            for (int j = 0; j < rotas.get(i).size(); j++){
                String destino = rotas.get(i).get(j);

                if (j == rotas.get(i).size()-1) {
                    System.out.print(destino);
                } else {
                    System.out.print(destino + ", ");
                }
            }
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Grafo g = new Grafo();

        g.adicionarCidade("Brasília");
        g.adicionarCidade("São Paulo");
        g.adicionarCidade("Rio de Janeiro");

        g.adicionarRota("Brasília", "São Paulo");
        g.adicionarRota("São Paulo", "Rio de Janeiro");

        g.imprimir();
    }
}
