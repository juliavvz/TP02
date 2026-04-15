package questao09;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m, n;
        do {
            System.out.print("Digite a quantidade de linhas M (max 10): ");
            m = scanner.nextInt();
            System.out.print("Digite a quantidade de colunas N (max 10): ");
            n = scanner.nextInt();
            if (m > 10 || n > 10) {
                System.out.println("Erro: maximo 10x10!");
            }
        } while (m > 10 || n > 10);
        
        int[][] matriz = new int[m][n];
        
        System.out.println("Digite os elementos da matriz " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int[][] transposta = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz transposta " + n + "x" + m + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
