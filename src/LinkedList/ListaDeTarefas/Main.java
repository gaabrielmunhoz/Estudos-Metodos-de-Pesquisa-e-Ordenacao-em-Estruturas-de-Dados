package LinkedList.ListaDeTarefas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n------To-do List------");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Marcar tarefa como conluída");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Data: ");
                    String data = scanner.nextLine();
                    System.out.print("Concluído (s/n): ");
                    String valor = scanner.nextLine();

                    boolean concluido = "s".equalsIgnoreCase(valor);

                    Tarefa tarefa = new Tarefa(titulo, data, concluido);
                    lista.adicionar(tarefa);

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    lista.listar();
                    break;

                case 3:
                    System.out.print("Digite o título da tarefa que deseja remover: ");
                    String tituloRemover = scanner.nextLine();

                    boolean removida = lista.removerPorTitulo(tituloRemover);

                    if (removida) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o título da tarefa: ");
                    String tituloStatus = scanner.nextLine();

                    System.out.print("Marcar como concluída? (s/n): ");
                    String valorStatus = scanner.nextLine();

                    boolean novoStatus = "s".equalsIgnoreCase(valorStatus);
                    boolean alterada = lista.alterarStatus(tituloStatus, novoStatus);

                    if (alterada) {
                        System.out.println("Status alterado com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }

                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}