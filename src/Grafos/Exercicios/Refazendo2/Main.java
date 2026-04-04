package Grafos.Exercicios.Refazendo2;

// 2. Adicionar conexões
// Agora faça:
// Criar conexões entre cidades (tipo “Curitiba → SP”)

//Importações necessárias:
import java.util.ArrayList;
import java.util.LinkedList;

// classe Grafo
class Grafo {
    // armazenar cidades e rotas
    private ArrayList<String> cidades;
    private ArrayList<LinkedList<String>> rotas;

    //construtores
    public Grafo(){
        cidades = new ArrayList<>();
        rotas = new ArrayList<>();
    }

    // adicionar cidade
    public void adicionarCidade(String cidade){
        cidades.add(cidade);
        rotas.add(new LinkedList<>());
    }

    // criar rota
    public void criarRota(String origem, String destino) {
        int iOrigem = cidades.indexOf(origem);
        int iDestino = cidades.indexOf(destino);

        // != -1 indica que não houveram erros no java
        if (iOrigem != -1 && iDestino != -1) {
            rotas.get(iOrigem).add(destino);
        }
    }

    // imprimir
    public void imprimir(){
        for (int origem = 0; origem < cidades.size(); origem++){
            System.out.print(cidades.get(origem) + " -> ");

            for (String destino : rotas.get(origem)) {
                System.out.print(destino);
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();

        g.adicionarCidade("BSB");
        g.adicionarCidade("SP");
        g.adicionarCidade("RJ");
        g.criarRota("BSB", "SP");
        g.criarRota("SP", "RJ");
        g.criarRota("RJ", "BSB");
        g.imprimir();
    }

}
