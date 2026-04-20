package Arvores.Exercicios.Questao1;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(13);
        arvore.inserir(17);


        System.out.println(arvore.raiz.esquerda.numero + " <– " + arvore.raiz.numero + " –> " + arvore.raiz.direita.numero);
        System.out.println(arvore.raiz.esquerda.esquerda.numero + " <– " + arvore.raiz.esquerda.numero + " –> " + arvore.raiz.esquerda.direita.numero);
        System.out.println(arvore.raiz.direita.esquerda.numero + " <– " + arvore.raiz.direita.numero + " –> " + arvore.raiz.direita.direita.numero);

        System.out.println("tem 7? " + arvore.buscar(arvore.raiz, 7));
        System.out.println("tem 20? " + arvore.buscar(arvore.raiz, 20));

    }
}
