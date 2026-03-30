package AtividadeFormativa3;

public class Pilha {
    private Usuario usuario;
    private Livro livro;
    private String historico;

    public Pilha (Usuario usuario, Livro livro, String historico){
        this.usuario = usuario;
        this.livro = livro;
        this.historico = historico;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getHistorico() {
        return historico;
    }
}
