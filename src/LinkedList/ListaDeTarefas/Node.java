package LinkedList.ListaDeTarefas;
public class Node {
    private Tarefa tarefa;
    private Node proximo;

    // construtor
    public Node(Tarefa tarefa, Node proximo) {
        this.tarefa = tarefa;
        this.proximo = proximo;
    }

    // getter
    public Tarefa getTarefa() {
        return tarefa;
    }

    public Node getProximo() {
        return proximo;
    }

    // setter
    public void setProximo(Node proximo){
        this.proximo = proximo;
    }
}
