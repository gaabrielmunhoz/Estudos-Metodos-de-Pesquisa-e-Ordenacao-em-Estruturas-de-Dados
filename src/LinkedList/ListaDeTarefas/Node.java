package LinkedList.ListaDeTarefas;
public class Node {
    private Tarefa tarefa;
    private Node next;

    // construtor
    public Node(Tarefa tarefa, Node next) {
        this.tarefa = tarefa;
        this.next = next;
    }

    // getter
    public Tarefa getTarefa() {
        return tarefa;
    }

    public Node getNext() {
        return next;
    }

    // setter
    public void setNext(Node next){
        this.next = next;
    }
}
