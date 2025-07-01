/*2. Crie um programa que leia um vetor de 10 posições. Contar e escrever quantos 
valores pares e quantos valores ímpares ele possui.*/

import java.util.Scanner;

public class Vetor2 {

public static void main(String[] args){
    int[] numeros = new int [10];
    int pares = 0;
    int impares = 0;

Scanner scanner = new Scanner(System.in);

    for(int i=0; i < 10; i++){
    System.out.println("Digite o numero "+(i+1)+": ");
    numeros[i] = scanner.nextInt();

System.out.println("|----------------|");

}

for (int i=0; i < numeros.length; i++){
    if (numeros[i] % 2 == 0){
        pares++;
    }else {
        impares++;
    }
}

System.out.println("\nQuantidade de números pares: " + pares);
System.out.println("Quantidade de números ímpares: " + impares);

}

}