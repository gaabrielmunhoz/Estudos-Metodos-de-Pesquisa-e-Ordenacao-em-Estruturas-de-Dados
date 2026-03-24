package LinkedList.ListaDeTarefas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------To-do List------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Data: ");
        String data = scanner.nextLine();
        System.out.print("Concluído(s/n): ");
        String valor = scanner.nextLine();
        scanner.close();

        boolean concluido;
        if ("s".equalsIgnoreCase(valor)) {
            concluido = true;
        } else {
            concluido = false;
        }

        ListaTarefas lista = new ListaTarefas();

        Tarefa tarefa = new Tarefa(titulo, data, concluido);
        lista.adicionar(tarefa);
        lista.listar();
        scanner.close();
    }
}