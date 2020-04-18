package listajava2;

import java.util.Scanner;

public class Ex3MaiorNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;

        System.out.print("Digite um numero: ");
        n1 = ler.nextDouble();
        System.out.print("Digite outro numero: ");
        n2 = ler.nextDouble();
        if (n1 > n2) {
            System.out.println("O maior numero e: " + n1);
        } else if (n1 == n2) {
            System.out.println("Numeros iguais!");
        } else {
            System.out.println("O maior numero e: " + n2);
        }
    }
}
