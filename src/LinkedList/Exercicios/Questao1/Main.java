package LinkedList.Exercicios.Questao1;
import java.util.LinkedList;

class Lista {
    // atributo
    private LinkedList<String> nomes;

    // construtor
    public Lista() {
        nomes = new LinkedList<>();
    }

    // inserir nomes
    public void inseirNomes(String nome){
        nomes.add(nome);
    }

    public void imprimir(){
        for (int i = 0; i<nomes.size(); i++){
            System.out.println(i+1 + "- " + nomes.get(i));
        }
    }

}
public class Main {

    public static void main(String[] args) {
        Lista l = new Lista();
        l.inseirNomes("Gabriel");
        l.inseirNomes("Fernanda");
        l.inseirNomes("Gisele");
        l.inseirNomes("Maurício");
        l.imprimir();
    }
}
