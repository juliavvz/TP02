package questao10;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Orden da matriz (MAX: 10)");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("tamanho maior que 10");
            sc.close();
            return;
        }

        int[][] matriz = new int[n][n];
        int[][] InMatriz = new int[n][n];

        // Entrada matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.err.println("Digite [" + i + "] [" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // matriz inversa 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                InMatriz[i][j] = matriz[j][i];
            }
        }

        // Exibir original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibir inversa
        System.out.println("\nMatriz inversa (transposta):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(InMatriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
