package AtividadeFormativa3;

public class Livro {

    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;
    private boolean alugar;


    // contrutores
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
        this.alugar = true;
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

    public String verificarDisponibilidade(){
        if (disponivel){
            return "Disponivel";
        } else {
            return "Indisponível";
        }
    }

    public String alugarLivro(){
        if (disponivel == true){
            return "Deseja alugar este livro? (s/n): ";
        } else {
            return null;
        }
    }

}
