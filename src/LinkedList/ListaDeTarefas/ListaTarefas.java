package LinkedList.ListaDeTarefas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

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

    public void carregarDeArquivo(){
        File arquivo = new File("Tarefas.txt");

        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                String descricao = partes[0];
                String data = partes[1];
                Boolean concluida = Boolean.parseBoolean(partes[2]);
                Tarefa tarefa = new Tarefa(descricao,data,concluida);
                adicionar(tarefa);
            }

            reader.close();
        } catch (IOException e){
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    public boolean removerPorTitulo(String titulo) {
        if (primeiro == null) {
            return false;
        }

        if (primeiro.getTarefa().getDescricaoTarefa().equalsIgnoreCase(titulo)){
            primeiro = primeiro.getProximo();
            return true;
        }

        Node anterior = primeiro;
        Node atual = primeiro.getProximo();

        while (atual != null) {
            if (atual.getTarefa().getDescricaoTarefa().equalsIgnoreCase(titulo)){
                anterior.setProximo(atual.getProximo());
                return true;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

        return false;
    }

    public boolean alterarStatus(String titulo, boolean concluida) {
        Node atual = primeiro;

        while (atual != null) {

            Tarefa t = atual.getTarefa();

            if (t.getDescricaoTarefa().equalsIgnoreCase(titulo)){
                t.setConcluida(concluida);
                return true;
            }

            atual = atual.getProximo();
        }

        return false;
    }

}
