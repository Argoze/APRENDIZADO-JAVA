import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida (B/M/T): ");
        String plano = scanner.nextLine();

        switch (plano) {
            case "T": {
                System.out.println("5Gb youtube");  
            }
            case "M":{
                System.err.println("Whats e intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            default:
                throw new AssertionError();
        }
    }
}
