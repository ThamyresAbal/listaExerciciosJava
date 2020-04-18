package ex5;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double salario = 0;
        double reajuste = 0;
        double salarioTotal = 0;
                
        System.out.println("::::.. Calculando o valor do reajuste salarial..::::");
        System.out.print("Digite o valor do salario: R$");
        salario = ler.nextDouble();
        System.out.print("Digite o valor de reajuste: ");
        reajuste = ler.nextDouble();
        reajuste = reajuste / 100;
        salarioTotal = salario * reajuste + salario;
        System.out.println("Salario com reajuste: R$" + salarioTotal);
    }
    
}
