package questao11;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ordem;
        do {
            System.out.print("Digite a ordem da matriz quadrada M (max 10): ");
            ordem = scanner.nextInt();
            if (ordem > 10) {
                System.out.println("Erro: ordem maxima 10!");
            }
        } while (ordem > 10);
        
        double[][] matriz = new double[ordem][ordem];
        
        System.out.println("Digite os elementos da matriz " + ordem + "x" + ordem + ":");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        
        double determinante = calcularDeterminante(matriz, ordem);
        System.out.println("Determinante da matriz: " + determinante);
        
        scanner.close();
    }
    
    public static double calcularDeterminante(double[][] mat, int n) {
        if (n == 1) return mat[0][0];
        if (n == 2) return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        
        double det = 0;
        for (int c = 0; c < n; c++) {
            double[][] menor = new double[n-1][n-1];
            for (int i = 1; i < n; i++) {
                int colMenor = 0;
                for (int j = 0; j < n; j++) {
                    if (j == c) continue;
                    menor[i-1][colMenor] = mat[i][j];
                    colMenor++;
                }
            }
            det += mat[0][c] * Math.pow(-1, c) * calcularDeterminante(menor, n-1);
        }
        return det;
    }
}
