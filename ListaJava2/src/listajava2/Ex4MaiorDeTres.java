package listajava2;

import java.util.Scanner;

public class Ex4MaiorDeTres {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int maiorNumero = 0;
        
        System.out.print("Digite um numero: ");
        n1 = ler.nextInt();
        maiorNumero = n1; //n1 passaa ser o maior numero
        System.out.print("Digite outro numero: ");
        n2 = ler.nextInt();
        if (n2 > maiorNumero){ //se n2 nao for maior o valor continuara sendo de n1
            maiorNumero = n2; //maior numero recebe n2 ja que e menor que n2 entao, n2 passa a ser o maior
        }
        System.out.print("Digite outro numero: ");
        n3 = ler.nextInt();
        if (n3 > maiorNumero ){ // se n3 nao for maior que maiorNumero logo nao tera mudanca de valores 
            maiorNumero = n3; //se n3 for maior do que o numero armazenado em maiorNumero este passara a ser o valor digitado em n3
        }
        System.out.println("O maior numero e: " + maiorNumero );
    }
}
