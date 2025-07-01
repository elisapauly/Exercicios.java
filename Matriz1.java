/*1. Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva: 
a) a soma dos números ímpares fornecidos; 
b) a soma de cada uma das 5 colunas; 
c) a soma de cada uma das 5 linhas.*/ 

public class Matriz1 {

    public static void main(String[] args){
        int [][] matriz = new int [5][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }
        //matriz
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("" );
        }

        //somar linha
        for(int i=0; i<5; i++){
            int somaLinha = 0;
            for(int j=0; j<5; j++){
                somaLinha += matriz[i][j];
        }
        System.out.printf("Linha %d: %d\n", i, somaLinha);
        }

         //somar colunas
        for(int j=0; j<5; j++){
            int somaColuna = 0;
            for(int i=0; i<5; i++){
                somaColuna += matriz[i][j];
        }
        System.out.printf("Coluna %d: %d\n", j, somaColuna);
        }

        //somar impar
        int somaImpar = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (matriz[i][j] % 2 !=0){
                somaImpar += matriz [i][j];
        }
        System.out.println("Soma dos Impares: "+somaImpar);
        }
    }
}
}

