package ex6;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double lado = 0;
        double totalLado = 0;
        
        System.out.println("::::.. Calculando a area de um quadrado..::::");
        System.out.print("Informe o valor do lado: ");
        lado = ler.nextDouble();
        totalLado = lado * lado;
        System.out.println("A area do quadrado e: " + totalLado);
    }
    
}
