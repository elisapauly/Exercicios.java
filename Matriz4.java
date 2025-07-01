/*4. Crie programas em Java que crie e exiba as seguintes figuras abaixo utilizando 
matrizes:*/

public class Matriz4{

public static void main(String[] args){

    char[][] matriz = new char [4][4];

    //preencher a matriz
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            matriz [i][j] = '*';
        }
    }

    //matriz
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            System.out.print("\t"+matriz[i][j]);
        }
        System.out.println("" );
    }
    System.out.println("" );
    //somente as bordas
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            if (i==0 || i ==3 || j==0 || j==3)
            System.out.print("\t"+matriz[i][j]);
            else
            System.out.println("\t ");
        }
        System.out.println("");
    }
    System.out.println( "" );
    //triangulo inferior
    for(int i=0; i<4;i++){
        for(int j=0; j<=i; j++){
            System.out.print("\t" +matriz [i][j]);
        }
        System.out.println("");
    }
}
}