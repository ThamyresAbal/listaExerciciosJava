package ex7;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double altura = 0;
        double base = 0;
        double area = 0;
        
        System.out.println("::::..Calculando a area de um retangulo..::::");
        System.out.print("Informe o valor da altura: ");
        altura = ler.nextDouble();
        System.out.print("Informe o valor da base:");
        base = ler.nextDouble();
        area = base * altura;
        System.out.println("A area e de: " + area + " metros quadrados.");
    }
    
}
