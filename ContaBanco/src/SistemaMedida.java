
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a medida:");
        String sigla = scanner.nextLine();

        if (sigla == "P"){
            System.out.println("Pequeno");
        }else if( sigla == "M"){
            System.err.println("MEDIO");
        }else if(sigla == "G"){
            System.out.println("GRANDE");
        }else {
            System.out.println("INDEFINIDO");
        }
        
        }

    }
