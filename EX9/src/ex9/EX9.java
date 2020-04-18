package ex9;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double raio = 0;
        double area = 0;
        
        System.out.println("::::..Calculando a area de uma esfera..::::");
        System.out.print("Informe o raio:");
        raio = ler.nextDouble();
        area = 4* Math.PI* Math.pow(raio,2);
        System.out.println("Area e de: " + area);
    }
    
}
