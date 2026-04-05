package LinkedList.Exercicios.Questao3;
import java.util.LinkedList;

class Lista {
    private LinkedList<Integer> numeros;

    public Lista(){
        numeros = new LinkedList<>();
    }

    public void inserirNumero(int numero){
        numeros.add(numero);
    }

    public void removerElementos(){
        //remove o 3º elemento da lista
        numeros.remove(2);

        // remove primeiro
        numeros.pollFirst();

        // remove o último
        numeros.pollLast();
    }

    public void imprimir(){
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();

        l.inserirNumero(1);
        l.inserirNumero(2);
        l.inserirNumero(3);
        l.inserirNumero(4);
        l.inserirNumero(5);
        l.inserirNumero(6);
        System.out.println("Lista completa:");
        l.imprimir();
        System.out.println("\nLista com os elementos removidos:");
        l.removerElementos();
        l.imprimir();
    }
}
