import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\n--- Menu Agenda ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato por nome");
            System.out.println("4. Remover contato por nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contato contato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(contato);
                    System.out.println("Contato adicionado.");
                }

                case 2 -> agenda.listarContatos();

                case 3 -> {
                    System.out.print("Nome a buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Contato encontrado = agenda.buscarPorNome(nomeBusca);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                }

                case 4 -> {
                    System.out.print("Nome a remover: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = agenda.removerPorNome(nomeRemover);
                    System.out.println(removido ? "Contato removido." : "Contato não encontrado.");
                }

                case 0 -> {
                    System.out.println("Encerrando...");
                    System.exit(0);
                }

                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
