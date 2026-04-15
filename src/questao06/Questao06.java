package questao06;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] nomes = new String[2][3];

        // Entrada de dados
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.print("Digite o nome para [" + i + "][" + j + "]: ");
                nomes[i][j] = sc.nextLine();
            }
        }

        // Exibir matriz
        System.out.println("\nNomes digitados:");

        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.print(nomes[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
