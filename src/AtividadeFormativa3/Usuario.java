package AtividadeFormativa3;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private Livro alugados;

    public Usuario (String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.alugados = null;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEmail(){
        return email;
    }

    public Livro getAlugados(){
        return alugados;
    }
}
