package LinkedList.ListaDeTarefas;
public class Tarefa {

    // atributos
    private String descricaoTarefa;
    private String dataVencimento;
    private Boolean concluida;

    // contrutores
    public Tarefa (String descricaoTarefa, String dataVencimento, Boolean concluida) {
        this.descricaoTarefa = descricaoTarefa;
        this.dataVencimento = dataVencimento;
        this.concluida = concluida;
    }

    // getters
    public String getDescricaoTarefa(){
        return descricaoTarefa;
    }

    public String getDataVencimento(){
        return dataVencimento;
    }

    public Boolean getConcluida(){
        return concluida;
    }

    // setters para a modificação dos atributos

    public void setDescricaoTarefa(String descricaoTarefa){
        this.descricaoTarefa = descricaoTarefa;
    }

    public void setDataVencimento(String dataVencimento){
        this.dataVencimento = dataVencimento;
    }

    public void setConcluida(Boolean concluida){
        this.concluida = concluida;
    }

}
