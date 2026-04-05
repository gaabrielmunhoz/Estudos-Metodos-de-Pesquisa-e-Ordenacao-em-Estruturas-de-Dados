package LinkedList.Exercicios.Questao2;
import java.util.LinkedList;

class ListaNumerosInteiros {
    private LinkedList<Integer> numeros;

    //construtor
    public ListaNumerosInteiros(){
        numeros = new LinkedList<>();
    }

    public void inserirNumero(int numero){
        numeros.add(numero);
    }

    public void inserirNoInicio(int numero){
        numeros.addFirst(numero);
    }

    public void inserirNoFinal(int numero){
        numeros.addLast(numero);
    }

    public void inserirNoMeio(int indice, int numero){
        numeros.add(indice, numero);
    }

    public void imprimir(){
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaNumerosInteiros l = new ListaNumerosInteiros();
        l.inserirNumero(1);
        l.inserirNumero(3);
        l.inserirNumero(7);
        l.inserirNumero(10);
        System.out.println("Lista inicial:");
        l.imprimir();
        l.inserirNoInicio(0);
        l.inserirNoFinal(20);
        l.inserirNoMeio(3,15);
        System.out.println("Lista final:");
        l.imprimir();
    }
}
