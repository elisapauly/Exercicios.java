/*3. Faça um programa que receba do usuário um vetor com 10 posições. Em seguida 
deverá ser impresso o maior e o menor elemento do vetor.*/

import java.util.Scanner;

public class Vetor3{

    public static void main(String[] args) {

    int[] numeros = new int[10];
    Scanner scanner = new Scanner(System.in);

        
    for (int i = 0; i < 10; i++) {
    System.out.print("Digite o número " + (i + 1) + ": ");
    numeros[i] = scanner.nextInt();
     }

        
    int maior = numeros[0];
    int menor = numeros[0];

       
 for (int i = 1; i < numeros.length; i++) {
 if (numeros[i] > maior) {
 maior = numeros[i];
 }
 if (numeros[i] < menor) {
 menor = numeros[i];
 }
 }

      
    System.out.println("\nMaior número: " + maior);
     System.out.println("Menor número: " + menor);

    }
}

