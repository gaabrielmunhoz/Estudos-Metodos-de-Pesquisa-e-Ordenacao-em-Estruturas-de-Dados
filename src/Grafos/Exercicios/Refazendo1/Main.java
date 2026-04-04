package Grafos.Exercicios.Refazendo1;

// 1. Criar um grafo simples
// Crie um grafo que armazene apenas nomes de cidades (String)
// Faça:
// Adicione 3 cidades
// Imprima todas

import java.util.ArrayList;

// classe Grafo
class Grafo {

    // criando o ArrayList para armazenar as cidades
    private ArrayList<String> cidades;

    // construtor
    public Grafo (){
        cidades = new ArrayList<>();
    }

    // método para adicionar cidade
    public void adicionarCidade(String cidade){
        cidades.add(cidade);
    }

    // imprimir as cidades adicionadas na lista
    public void imprimir() {
        for (String i : cidades) {
            System.out.println(i);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Grafo g = new Grafo();

        g.adicionarCidade("Brasília");
        g.adicionarCidade("São Paulo");
        g.adicionarCidade("Rio de Janeiro");
        g.imprimir();
    }
}
