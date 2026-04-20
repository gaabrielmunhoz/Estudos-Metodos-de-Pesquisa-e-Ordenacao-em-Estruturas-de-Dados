package Arvores.Exercicios.Questao1;

public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(int numero){
        raiz = inserirRecursivo(raiz, numero);
    }

    public No inserirRecursivo(No atual, int numero){
        if (atual == null){
            return new No(numero);
        }

        if (numero < atual.numero){
            atual.esquerda = inserirRecursivo(atual.esquerda, numero);
        } else {
            atual.direita = inserirRecursivo(atual.direita, numero);
        }
        return atual;
    }

    public boolean buscar(No atual, int numero){
        if (atual == null){
            return false;
        }

        if (numero == atual.numero){
            return true;
        }

        if (numero < atual.numero){
            return buscar(atual.esquerda, numero);
        } else {
            return buscar(atual.direita, numero);
        }

    }

    public void imprimirArvore(No no){
        if (no == null) return;

        String esq = (no.esquerda != null) ? String.valueOf(no.esquerda.numero) : "";
        String dir = (no.direita != null) ? String.valueOf(no.direita.numero) : "";

        System.out.println(esq + " <– " + no.numero + " –> " + dir);
        imprimirArvore(no.esquerda);
        imprimirArvore(no.direita);
    }
}
