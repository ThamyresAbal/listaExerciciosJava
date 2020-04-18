
package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
    // declarando os valores das matrizes como constante
        final int LINHAS = 5, COLUNAS = 4; 
        int [][] matriz = new int [LINHAS] [COLUNAS];// matrizes são como o excel, se declara a quantidade de linhas e colunas 
    //lendo a matriz
        Scanner entrada  = new Scanner(System.in);
    // variáveis
        int elemento;

    // matriz pode ser um pilha de vetores ... leitor de vetores
    // é assim para 2D no caso de 3D entraria mais um for 
        for(int linha = 0; linha < matriz.length; linha++){// for percorrendo a matriz... matriz .length =4
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){ //percorrendo a segunda dimensão
                System.out.print("Entre com um número: ");
                elemento = entrada.nextInt();
                matriz[linha][coluna]= elemento;//jogando o número do elemento dentro de cada um l C, LC
            }
        }
    // MOSTRANDO A MATRIZ
        for (int linha = 0; linha < matriz.length; linha++){// for percorrendo a matriz... 
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){ //percorrendo a segunda dimensão
                System.out.print(matriz [ linha] [coluna] + " ");
            }
            System.out.println("");
        }
    }
}
/*   int [] vet = {1 ,2, 3, 4, 5};// inicializnado o vetor sem declarar o seu tamanho ainda 
        // contrutor implicito ... o java á entende como um objeto mesmo sem o NEW
        //MATRIZ
        for (int i = 0 ; i < vet.length; i++){
            System.out.println(vet[1] + " ");
        }*/