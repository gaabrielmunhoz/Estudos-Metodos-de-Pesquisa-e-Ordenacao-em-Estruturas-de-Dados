package LinkedList.ListaDeTarefas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListaTarefas {
    private Node primeiro;

    // construtor
    public ListaTarefas(){
        this.primeiro = null;
    }

    public void adicionar(Tarefa t){
        Node novo = new Node(t,null);

        if (primeiro == null){
            primeiro = novo;
        } else {
            Node atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }

    public void listar() {
        if (primeiro == null) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        Node atual = primeiro;

        while (atual != null) {
            Tarefa t  = atual.getTarefa();
            System.out.println("-------------------------");
            System.out.println("Tarefa: " + t.getDescricaoTarefa());
            System.out.println("Data de vencimento: " + t.getDataVencimento());
            System.out.println("Concluída: " + t.getConcluida());
            atual = atual.getProximo();
        }
    }

    public void salvarEmArquivo(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tarefas.txt"))){
            Node atual = primeiro;

            while (atual != null){
                Tarefa t = atual.getTarefa();

                writer.write(t.getDescricaoTarefa() + ";" + t.getDataVencimento() + ";" + t.getConcluida());
                writer.newLine();
                atual = atual.getProximo();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

}
