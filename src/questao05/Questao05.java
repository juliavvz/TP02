package questao05;
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz3x2 = new int[3][2];
        System.out.println("Digite 6 valores para matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz3x2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz3x2[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
