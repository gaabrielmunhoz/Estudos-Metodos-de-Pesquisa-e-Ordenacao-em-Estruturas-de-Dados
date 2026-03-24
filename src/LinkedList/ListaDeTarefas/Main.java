package LinkedList.ListaDeTarefas;

public class Main {
    public static void main(String[] args) {
        System.out.println("rodou");
        ListaTarefas lista = new ListaTarefas();
        Tarefa t1 = new Tarefa("Arrumar quarto", "24/03/2026", false);
        Tarefa t2 = new Tarefa("Lavar banheiro", "24/03/2026", false);
        lista.adicionar(t1);
        lista.adicionar(t2);
        lista.listar();

    }
}