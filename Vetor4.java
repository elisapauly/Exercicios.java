/*4. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos na ordem inversa.*/

import java.util.Scanner;

public class Vetor4{

    public static void main(String[] args) {

    int[] numeros = new int[6];
    Scanner scanner = new Scanner(System.in);

        
    for (int i = 0; i < 6; i++) {
    System.out.print("Digite o número " + (i + 1) + ": ");
    numeros[i] = scanner.nextInt();
     }

    System.out.println("\nNúmeros na ordem inversa: ");
    for (int i = numeros.length - 1; i>=0; i--){
        System.out.println("Posição " + i + ": " + numeros[1]);
    }
    
 }
 }

