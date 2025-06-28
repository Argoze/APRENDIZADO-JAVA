
import java.util.Scanner;


public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25.0;
        
        System.out.println("Digite o valor desejado para saque");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo){ // so passa pelo if caso o valor do saldo for maior que o valor do valorSolicitado
            saldo = saldo - valorSolicitado;
            System.err.println("Saldo atual: " +saldo);
            

    }else{
        System.out.println("Saldo insuficiente " );
        System.out.println("Saldo atual: "+ saldo);


    }   
    }
}
