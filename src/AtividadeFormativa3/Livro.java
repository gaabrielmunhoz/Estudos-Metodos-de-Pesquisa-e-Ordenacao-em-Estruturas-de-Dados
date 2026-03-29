package AtividadeFormativa3;

public class Livro {

    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;


    // contrutores
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // métodos getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
}
