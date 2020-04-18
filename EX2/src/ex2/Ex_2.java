package ex2;

import java.util.Scanner;

public class Ex_2 {
     public static void main (String[]args){
         Scanner ler = new Scanner (System.in);
         
         float nota1 = 0;
         float nota2 = 0;
         float calculo = 0;
         
         System.out.println("::::.. Calculando a media..::::");
         System.out.print("Digite a primeira nota: ");
         nota1 = ler.nextFloat();
         System.out.print("Digite a segunda nota: ");
         nota2 = ler.nextFloat();
         calculo = (nota1 + nota2) /2 ;
         System.out.println("Tendo por base a seguinte expressao: (Nota1 + Nota2) / 2.");
         System.out.println("Sua media e: " + calculo);
     }
     
             
}
