package Grafos.Exercicios.Refazendo3;

// 3. Metodo adicionarRota
// Crie um metodo:
// adicionarRota(String origem, String destino)
// 👉 Ele deve:
// conectar as duas cidades
// funcionar como grafo não direcionado (vai e volta)
// 💡 dica mental:
// adiciona 2 vezes (ida e volta)

// importações necessárias
import java.util.ArrayList;
import java.util.LinkedList;

// classe Grafo
class Grafo {
    // armazenar cidades e rotas
    private ArrayList<String>  cidades;
    private ArrayList<LinkedList<String>> rotas;

    // construtores
    public Grafo() {
        cidades = new ArrayList<>();
        rotas = new ArrayList<>();
    }

    // inserir cidade
    public void inserirCidade(String cidade) {
        cidades.add(cidade);
        rotas.add(new LinkedList<>());
    }

    // criar rotas não direcionadas
    public void criarRotas(String origem, String destino){
        int iOrigem = cidades.indexOf(origem);
        int iDestino = cidades.indexOf(destino);

        if (iOrigem != -1 && iDestino != -1) {
            rotas.get(iOrigem).add(destino);
            rotas.get(iDestino).add(origem);
        }
    }

    public void imprimir() {
        for(int origem = 0; origem < cidades.size(); origem++) {
            System.out.print(cidades.get(origem) + " -> ");

            for (String destino : rotas.get(origem)){
                System.out.print(destino + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();

        g.inserirCidade("BSB");
        g.inserirCidade("SP");
        g.inserirCidade("RJ");
        g.criarRotas("BSB","SP");
        g.criarRotas("SP","RJ");
        g.imprimir();
    }
}
