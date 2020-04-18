
package ex10;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double raio = 0;
        double altura = 0;
        double area = 0;
        
        System.out.println(":::.. Volume da caixa de agua cilindrica..::::");
        System.out.print("Digite o valor do raio: ");
        raio = ler.nextDouble();
        System.out.print("Digite o valor da altura: ");
        altura = ler.nextDouble();
        area = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("A area e de : " + area);
    }
    
}
