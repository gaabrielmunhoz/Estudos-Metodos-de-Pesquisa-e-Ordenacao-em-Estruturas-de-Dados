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




        arvore.imprimirArvore(arvore.raiz);

    }
}
