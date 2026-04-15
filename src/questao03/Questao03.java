package questao03;
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char opcao;
    
   do {
            int n;
            do {
                System.out.print("Digite a quantidade de valores (1 a 19): ");
                n = scanner.nextInt();
                if (n <= 0 || n >= 20) {
                    System.out.println("ERRO! Digite um valor entre 1 e 19.");
                }
            } while (n <= 0 || n >= 20);
            

            int positivo = 0, negativo = 0;
            double soma = 0, maior = -999999, menor = 999999;
            
            for (int i = 0; i < n; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                double num = scanner.nextDouble();
                
                soma += num;
                
                if (num > maior) maior = num;
                if (num < menor) menor = num;
                
                if (num >= 0) positivo++;
                else negativo++;
            }
            
            System.out.println("\nMaior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + (soma / n));
            System.out.println("% Positivos: " + (positivo * 100.0 / n) + "%");
            System.out.println("% Negativos: " + (negativo * 100.0 / n) + "%");
    
            do {
                System.out.print("\nExecutar novamente? (S/N): ");
                opcao = scanner.next().charAt(0);
                opcao = Character.toUpperCase(opcao);
            } while (opcao != 'S' && opcao != 'N');
            
        } while (opcao == 'S');
        
        System.out.println("Fim!");
        scanner.close();
    }

}
