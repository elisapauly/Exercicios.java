/* 5. Crie em Java uma matriz 3x3 de inteiros, preencha a matriz e verifique se a matriz 
é um quadrado mágico. Diz-se que uma matriz é um quadrado mágico quando a 
soma de todas as suas linhas, todas as suas colunas, sua diagonal principal e sua 
diagonal secundária resultam no mesmo valor. Exemplo abaixo.*/

public class Matriz5 {

    public static void main(String[] args) {

        int [][] matriz = new int [3][3];

        //preencher a matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }

        int somaReferencia = matriz [0][0] + matriz[0][1] + matriz[0][2];
        boolean verifica = false;

        //For para verificar a soma das linhas

        //For para verificar a soma das colunas

        //Verifica a diagonal principal

        //Verifica a diagonal secundaria

        //Mostra mensagem se é ou não quadrado mágico
        if(verifica){
            System.out.println("É um quadrado mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }
    }
}