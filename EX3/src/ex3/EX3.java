package ex3;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double nota1 = 0;
        double nota2 = 0;
        double calculo = 0;
        
        System.out.println("::::.. Calculando a media com peso..::::");
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        calculo = (nota1 + nota2 * 2) /3;
        System.out.println("Usando a expressao: (nota1 + nota2 * 2) / 3. Sua media e: " + calculo);
    }
    
}
