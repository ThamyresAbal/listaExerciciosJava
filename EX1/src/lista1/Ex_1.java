
package lista1;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int tp = 0;
        
        
        System.out.print("Digite um número: ");
        n1 = ler.nextInt();
        System.out.print("Digite outro número: ");
        n2 = ler.nextInt();
        tp = n1;
        n1 = n2;
        n2 = tp;
        System.out.println("O primeiro valor digitado foi " + n1 + " e o segundo foi " + n2 + "!");
        
        
    }
    
}
