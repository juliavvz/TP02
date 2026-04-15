package questao08;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int[][] resultado = new int[3][4];

        // Entrada de dados
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Constante multiplicativa
        System.out.print("\nDigite a constante multiplicativa: ");
        int constante = sc.nextInt();

        // Multiplicação
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] * constante;
            }
        }

        // Exibir matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibir matriz resultado
        System.out.println("\nMatriz multiplicada:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
