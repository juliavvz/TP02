package questao02;

import java.util.*;

public class Questao02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        
        int maiorN = 0;
        for (int n : numeros) {
            if (n > maiorN) {
                maiorN = n;
            }
        }

        int soma = 0;;
        for (int i : numeros) {
            soma = soma + i;
        }

        int media = soma / 10;

        System.out.println("Maior número: " + maiorN);
        System.out.println("Some: " + soma);
        System.out.println("média: " + media);

        sc.close();

    }
}
