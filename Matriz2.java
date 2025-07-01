/*2. Crie em Java uma matriz 3x5 de inteiros, preencha a matriz e depois: 
a) Informe se a matriz possui elementos repetidos; 
b) A quantidade de números pares; 
c) A quantidade de números ímpares*/

public class Matriz2 {
 
    public static void main (String[] args){
 
        int[][] matriz = new int[3][5];
 
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }
         // Matriz
         for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
 
        boolean existeRepetido = false;
        // 1 Matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                // 2 Matriz
                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 5; y++){
 
                        if (i == x && j == y)
                        continue;
 
                        if(matriz[i][j] == matriz [x][y]){
                            existeRepetido = true;
                        }
                    }
                }
            }
           
        }
        if (existeRepetido)
        System.out.println("Tem Repetido");
        else
        System.out.println("Não Tem Repetido");
    }
}