package AtividadeFormativa3;

public class Fila {
    private Usuario usuario;
    private int posicao;
    private Livro livro;

    public Fila(Usuario usuario, int posicao, Livro livro){
        this.usuario = usuario;
        this.posicao = posicao;
        this.livro = livro;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public int getPosicao(){
        return posicao;
    }

    public Livro getLivro(){
        return livro;
    }
}
