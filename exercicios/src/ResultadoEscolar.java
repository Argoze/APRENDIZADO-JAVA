
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 

        System.err.println("digite a nota do aluno");
        int nota = scanner.nextInt();

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado" ;
        System.out.println(resultado);
    }
    
}
