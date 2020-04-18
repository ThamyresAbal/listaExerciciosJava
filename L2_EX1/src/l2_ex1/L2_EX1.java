package l2_ex1;

import java.util.Scanner;

public class L2_EX1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n = 0;
        
        System.out.println(" ::::..Positivo ou negativo..::::");
        System.out.print("Digite um numero: ");
        n = ler.nextInt();
        if (n > 0){
            System.out.println("Numero Positivo!");
        }
        else if (n  < 0) {
            System.out.println("Numero Negativo!");
        }
        else{
            System.out.println("Zero!");
        }
    }
    
}
