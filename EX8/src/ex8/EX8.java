package ex8;

import java.util.Scanner;


public class EX8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double raio = 0;
        double area = 0;
        
        System.out.println("::::..Calculando a area do circulo..::::");
        System.out.print("Informe o comprimento do raio: ");
        raio = ler.nextDouble();
        area = raio * Math.PI;
        System.out.println("Area do circulo: " + area);

    }
    
}
