/*6. Faça um programa que receba do usuário dois vetores, A e B, com 10 números 
inteiros cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na 
tela os dados do vetor C.*/


import java.util.Scanner;

public class Vetor6{

    public static void main(String[] args){
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];

        for(int i=0; i < 10; i++){
            vetorA[i] = (int)(Math.random() * 101);
            vetorB[i] = (int)(Math.random() * 101);

            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("A\t|\tB|\tC");
        for(int i=0; i < 10; i++){
            System.out.println(vetorA[i] +"\t|\t"+vetorB[i]+"\t|\t"+vetorC[i]);
        }

   }
}