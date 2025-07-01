/*1. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos.*/

import java.util.Scanner;

public class Vetor1 {

public static void main(String[] args){
String[] numeros = new String [6];

Scanner scanner = new Scanner(System.in);

for(int i=0; i<6; i++){

System.out.println("Digite o numero "+(i+1)+": ");
numeros[i] = scanner.nextLine();

System.out.println("|----------------|");

}

}

}
