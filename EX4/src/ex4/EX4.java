package ex4;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner conta = new Scanner (System.in);
        
        double valor = 0;
        double gorjeta= 0;
        double valorTotal= 0;
        
        System.out.print("Digite o valor da conta: ");
        valor = conta.nextDouble();
        gorjeta = valor * 0.10;
        valorTotal = valor + gorjeta; 
        System.out.println("Com base no valor fornecido...");
        System.out.println("10% do garcom: R$" + gorjeta);
        System.out.println("O valor total da conta: R$" + valorTotal);
        
    }
    
}
