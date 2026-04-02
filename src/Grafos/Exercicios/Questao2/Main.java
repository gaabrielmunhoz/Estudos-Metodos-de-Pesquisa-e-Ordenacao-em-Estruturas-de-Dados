package Grafos.Exercicios.Questao2;

// 2. Adicionar conexões
// Agora faça:
// Criar conexões entre cidades (tipo “Curitiba → SP”)

import java.util.ArrayList;
import java.util.LinkedList;

class Grafo {
    private ArrayList<String> cidades;
    private ArrayList<LinkedList<String>> rotas;

    // construtores
    public Grafo() {
        cidades = new ArrayList<>();
        rotas = new ArrayList<>();
    }

    public void adicionarCidade(String cidade) {
        cidades.add(cidade);
        rotas.add(new LinkedList<>());
    }

    public void adicionarRotas(String origem, String destino){
        int iOrigem = cidades.indexOf(origem);
        int iDestino = cidades.indexOf(destino);

        if (iOrigem != -1 && iDestino != -1) {
            rotas.get(iOrigem).add(destino);
        }
    }

    public void imprimir(){
        for (int i = 0; i < cidades.size(); i++) {
            System.out.print(cidades.get(i) + " -> ");

            for (String destino : rotas.get(i)){
                System.out.print(destino);
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
        g.adicionarRotas("Brasília", "São Paulo");
        g.adicionarRotas("São Paulo", "Rio de Janeiro");
        g.adicionarRotas("Rio de Janeiro", "Brasília");
        g.imprimir();
    }
}
