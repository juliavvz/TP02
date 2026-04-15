package questao01;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
       System.out.println("Digite o primeiro valor");
       int v1 = scanner.nextInt();

       int v2;

    do {
       System.out.println("Digite o segundo valor, sendo ele maior que o primeiro valor");
       v2  = scanner.nextInt();
       }
    while (v2 <= v1);

    System.out.println(v1 + " e " + v2);
    scanner.close();

    }
}
