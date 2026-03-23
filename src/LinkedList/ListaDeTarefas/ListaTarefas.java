package LinkedList.ListaDeTarefas;
public class ListaTarefas {
    private Node primeiro;

    // construtor
    public ListaTarefas(){
        this.primeiro = null;
    }

    public void adicionar(Tarefa t){
        if (primeiro == null){
            primeiro = new Node(t,null);
        }
    }

}
