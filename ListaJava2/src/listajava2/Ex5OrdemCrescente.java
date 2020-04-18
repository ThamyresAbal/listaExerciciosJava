package listajava2;

import java.util.Scanner;

public class Ex5OrdemCrescente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int maiorNumero = 0;

        System.out.print("Digite um numero: ");
        n1 = ler.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = ler.nextInt();
        System.out.print("Digite outro numero: ");
        n3 = ler.nextInt();
        // se n1 e maior que n2
        if (n1 > n2) { // se for ele ira substituir
            maiorNumero = n1;
            n1 = n2;
            n2 = maiorNumero;
        }//senao entra no outro if. n2 maior que n3( pergunta)
        if (n3 < n2) {
            maiorNumero = n2;
            n2 = n3;
            n3 = maiorNumero;
            if (n2 < n1) {
                maiorNumero = n1;
                n1 = n2;
                n2 = n1;
            }
        }
        System.out.println("A ordem crescente dos numeros informados: " + n1 + "," + n2 + "," + n3 + "!");
    } 
}
