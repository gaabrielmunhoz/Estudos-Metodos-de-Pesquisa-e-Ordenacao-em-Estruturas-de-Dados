package AtividadeFormativa3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    //metodo para exibir o menu de livros
    public static void exibirMenuLivros(LinkedList<Livro>livros){
        System.out.println("- - - Lista de livros - - -\n");
        int posicao = 1;
        for (Livro menuLivros : livros) {
            System.out.println("("+posicao+") "+ menuLivros.getTitulo());
            posicao++;
        }
        System.out.println("(0) Digite 0 para sair da lista de livros");
    }

    // metodo para exibir os detalhes do livro que o usuário selecionar

    public static Usuario buscarUsuarioCpf(LinkedList<Usuario>usuarios, String cpf){

        for (Usuario usuario : usuarios){
            if (usuario.getCpf().equals(cpf)){
                return usuario;
            }
        }
        return null;
    }

    public static void exibirDetalhesLivro(Livro livros){
        System.out.println("\nDetalhes do livro:");
        System.out.println("Título: " + livros.getTitulo());
        System.out.println("Autor(a): " + livros.getAutor());
        System.out.println("Ano de publicação: " + livros.getAnoPublicacao());
        System.out.println(livros.verificarDisponibilidade());
    }

    public static void exibirMenuPerfil() {
        System.out.println("- - - Selecione uma opção - - -");
        System.out.println("(1) Exibir lista de livros da bíblioteca");
        System.out.println("(2) Exibir histórico de visualização");
        System.out.println("(0) Fazer Log-out");
    }

    // metodo para identificar o usuário por cpf

    public static void main(String[] args) {

        // criando usuários

        LinkedList<Usuario> usuario = new LinkedList<>();
        usuario.add(new Usuario("Gabriel", "01234567890", "gabriel@email.com"));
        usuario.add(new Usuario("Fernanda", "11111111111", "fernanda@email.com"));
        usuario.add(new Usuario("Gisele", "22222222222", "gisele@email.com"));
        usuario.add(new Usuario("Maurício", "33333333333", "mauricio@email.com"));

        // Criando a linked list
        LinkedList<Livro> livros = new LinkedList<>();

        // Adicionando livros na LinkedList
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));

        // Criando fila para aluguel de livros

        Queue<Fila> filaEspera = new LinkedList<>();

        // Criando pilhas paravisualização de histórico do usuário

        Stack<Pilha> historico = new Stack<>();

        // abrindo scanner para o usuário digitar no terminal

        Scanner scanner = new Scanner(System.in);

        // para fazer o login, digite um dos cpfs da LinkedList de usuários

        boolean executandoLogin = true;
        while (executandoLogin) {
            System.out.println("- - - Login bíblioteca - - -");
            System.out.println("Digite o seu CPF (tecle 0 para sair): ");
            String cpfDigitado = scanner.next();

            if (cpfDigitado.equals("0")){
                System.out.println("Encerrando programa...");
                break;
            }

            Usuario usuarioEncontrado = buscarUsuarioCpf(usuario,cpfDigitado);
            if (usuarioEncontrado != null){
                System.out.println("\nBem vindo(a), " + usuarioEncontrado.getNome() + "!\n");

                // laço que mostra o menu do perfil

                boolean menuPerfil = true;
                while (menuPerfil) {
                    exibirMenuPerfil();
                    System.out.println("Digite a opção desejada: ");
                    String selecionar = scanner.next();

                    if (selecionar.equals("0")){
                        System.out.println("\nRealizando log-out...");
                        break;

                    } else if (selecionar.equals("1")){

                        // laço para listar os livros que a bíblioteca possuí
                        boolean executando = true;
                        while (executando){
                            exibirMenuLivros(livros);
                            System.out.println("\nDigite o número do livro que você deseja: ");
                            if (!scanner.hasNextInt()){
                                System.out.println("\nOpção inválida.\n");
                                scanner.next();
                                continue;
                            }
                            int opcao = scanner.nextInt();
                            if (opcao == 0){
                                executando = false;
                                System.out.println("\nVoltando para o menu do perfil...");
                            } else {
                                int indice = opcao -1;
                                if (indice >= 0 && indice < livros.size()){
                                    Livro selecionado = livros.get(indice);
                                    exibirDetalhesLivro(selecionado);

                                    // salva a visualização no histórico
                                    Pilha historicoVisualizacao = new Pilha(usuarioEncontrado, selecionado, "Visualizado");
                                    historico.push(historicoVisualizacao);

                                    if (selecionado.isDisponivel()) {
                                        System.out.println("Deseja alugar este livro? (s/n): ");
                                        String alugar = scanner.next();

                                        if (alugar.equalsIgnoreCase("s")){
                                            selecionado.alugarLivro();
                                            System.out.println("\nLivro \"" + selecionado.getTitulo() + "\" alugado com sucesso!\n");

                                        } else if (alugar.equalsIgnoreCase("n")){
                                            System.out.println("\nVoltando para a lista de livros da bíblioteca...\n");

                                        } else {
                                            System.out.println("\nOpção inválida. Voltando para a lista de livros da bíblioteca...\n");

                                        }
                                    } else {
                                        System.out.println("\nLivro indisponível para aluguel.\n" +
                                                "Deseja ser notificado quando for a sua vez de alugar o livro? (s/n)\n");
                                        String entrouNaFila = scanner.next();
                                        if (entrouNaFila.equals("n")){
                                            System.out.println("Não notificar. Voltando para a lista de livros da bíblioteca...");
                                        } else if (entrouNaFila.equals("s")){

                                            // a pessoa entra na fila de espera e mostra a posição dela na fila par alugar o livro
                                            int posicao = filaEspera.size()+1;
                                            filaEspera.add(new Fila(usuarioEncontrado,posicao,selecionado));
                                            System.out.println("Você entrou na fila de espera para o livro \"" + selecionado.getTitulo() + "\" na posição " + posicao + ".");
                                        }

                                    }
                                } else {
                                    System.out.println("\nOpção inválida.\n");
                                }
                            }
                        }
                    } else if (selecionar.equals("2")){
                        System.out.println("\n- - - Histórico de visualização - - -\n");

                        // laço for para mostrar o histórico de visualização do mais recente para o primeiro visualizado
                        boolean encontrouHistorico = false;
                        for (int i = historico.size() - 1; i >= 0; i--) {
                            Pilha item = historico.get(i);

                            if (item.getUsuario().getCpf().equals(usuarioEncontrado.getCpf())) {
                                System.out.println(item.getHistorico() + " o livro: " + item.getLivro().getTitulo());
                            }
                        }
                        if (!encontrouHistorico){
                            System.out.println("Não há visualizações recentes.\n");
                        }
                    }
                }

            } else {
                System.out.println("\nCPF incorreto ou inexistente. Tente novamente.\n");
            }
        }

        scanner.close();

    }
}
