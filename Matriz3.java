/*3. Crie em Java uma matriz 4x4 de decimais, preencha a matriz e depois: 
a) Exiba os valores da sua diagonal principal; 
b) Exiba os valores da sua diagonal secundária; 
c) A sua matriz transposta. */

public class Matriz3 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 101);
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz completa:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Diagonal principal
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // Diagonal secundária
        System.out.println("\n\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
        }
    }
}
