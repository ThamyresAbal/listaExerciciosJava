package listajava2;

import java.util.Scanner;

public class Ex2ParOuImpar {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 0;

        System.out.println("Digite um numero: ");
        n = ler.nextInt();
        if (n % 2 == 0) {
            System.out.println("Numero Par!");
        } else {
            System.out.println("Numero Impar!");
        }
    }    
}
