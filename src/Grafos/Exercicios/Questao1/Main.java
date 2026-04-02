package Grafos.Exercicios.Questao1;
import java.util.ArrayList;

// 1. Criar um grafo simples
// Crie um grafo que armazene apenas nomes de cidades (String)
// Faça:
// Adicione 3 cidades
// Imprima todas

// Criar a classe Cidades

class Cidades {
    private ArrayList<String> cidades;

    // Construtor
    public Cidades(){
        cidades = new ArrayList<>();
    }

    // Adicionar cidade no ArrayList
    public void adicionarCidade(String cidade) {
        cidades.add(cidade);
    }

    // imprimir a lista das cidades adicionadas

    public void imprimir(){
        for (String i : cidades) {
            System.out.println(i);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Cidades c = new Cidades();

        // adicionando cidades no ArrayList com a classe Cidades
        c.adicionarCidade("Brasília");
        c.adicionarCidade("São Paulo");
        c.adicionarCidade("Rio de janeiro");

        // imprimir a ArrayList da cidades com a classe Cidade
        c.imprimir();
    }
}
