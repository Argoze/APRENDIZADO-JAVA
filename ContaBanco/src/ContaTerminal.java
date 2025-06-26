
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TO DO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner (System.in);

        // TO DO: Exibir as mensagens para o nosso usuario
        System.out.println("Digite o numero da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o numedo da agencia:");
        String agencia =  scanner.nextLine();

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        // TO DO: Exibir a mensagem da conta criada
        System.out.println("\nOlá " + nome + 
        " obrigado por criar uma conta em nosso banco, sua agência: " + agencia + 
        " sua conta: " + numero + 
        " e seu saldo: " + saldo + " já está disponível para saque");
    }
}
