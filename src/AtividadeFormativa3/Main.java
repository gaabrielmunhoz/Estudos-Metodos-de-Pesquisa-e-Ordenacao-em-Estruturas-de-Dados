package AtividadeFormativa3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    //metodo para exibir o menu de livros
    public static void exibirMenuLivros(LinkedList<Livro>livros){
        System.out.println("- - - Menu de livros - - -\n");
        int posicao = 1;
        for (Livro menuLivros : livros) {
            System.out.println("("+posicao+") "+ menuLivros.getTitulo());
            posicao++;
        }
    }

    // metodo para exibir os detalhes do livro que o usuário selecionar

    public static void exibirDetalhesLivro(Livro livros){
        System.out.println("\nDetalhes do livro:");
        System.out.println("Título: " + livros.getTitulo());
        System.out.println("Autor(a): " + livros.getAutor());
        System.out.println("Ano de publicação: " + livros.getAnoPublicacao());
        System.out.println(livros.verificarDisponibilidade());
        System.out.println(livros.alugarLivro());
    }

    public static void main(String[] args) {

        // Criando a linked list
        LinkedList<Livro> livros = new LinkedList<>();

        // Adicionando livros na LinkedList
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));

        // abrindo scanner para o usuário digitar no terminal

        Scanner scanner = new Scanner(System.in);
        // menu de livros
        boolean executando = true;
        while (executando){
            exibirMenuLivros(livros);
            System.out.println("\nDigite o número do livro que você deseja ou 0 para sair: ");
            if (!scanner.hasNextInt()){
                System.out.println("\nOpção inválida.\n");
                scanner.next();
                continue;
            }
            int opcao = scanner.nextInt();
            if (opcao == 0){
                executando = false;
                System.out.println("\nEncerrando sistema...");
            } else {
                int indice = opcao -1;
                if (indice >= 0 && indice < livros.size()){
                    Livro selecionado = livros.get(indice);
                    exibirDetalhesLivro(selecionado);
                    String alugar = scanner.next();
                    if (alugar.equals("s")){
                        System.out.println("\nLivro \"" + selecionado.getTitulo() + "\" alugado com sucesso!\n");
                    } else if (alugar.equals("n")){
                        System.out.println("\nVoltando para o menu inicial...\n");
                    } else {
                        System.out.println("\nOpção inválida. Voltando para o menu inicial...\n");
                    }
                } else {
                    System.out.println("\nOpção inválida.\n");
                }
            }
        }
    }
}
