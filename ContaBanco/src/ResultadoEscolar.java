
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 

        System.err.println("digite a nota do aluno");
        int nota = scanner.nextInt();

        if (nota>= 7)
            System.out.println("Aprovado");

            else
            System.err.println("Reprovado");
    }
    
}
