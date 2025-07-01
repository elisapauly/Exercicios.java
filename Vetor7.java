/*7. Faça um programa que receba 6 numeros inteiros e mostre: 
• Os numeros pares digitados; 
• A soma dos numeros pares digitados; 
• Os numeros ımpares digitados; 
• A quantidade de numeros ımpares digitados;
*/

import java.util.Scanner;

public class Vetor7 {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        int somaPares = 0;
        int quantidadeImpares = 0;

        Scanner scanner = new Scanner(System.in);

       
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Números pares digitados: ");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                somaPares += numeros[i];
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);

        System.out.print("Números ímpares digitados: ");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
                quantidadeImpares++;
            }
        }

        System.out.println("\nQuantidade de números ímpares: " + quantidadeImpares);

    }
}
