package AtividadeFormativa3;

public class LivrosAlugados {
    private Usuario usuario;
    private Livro livro;
    private boolean alugado;

    public LivrosAlugados (Usuario usuario, Livro livro, boolean alugado) {
        this.usuario = usuario;
        this.livro = livro;
        this.alugado = alugado;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public boolean getAlugado(){
        return alugado;
    }

    public boolean isAlugado() {
        return alugado;
    }
}
