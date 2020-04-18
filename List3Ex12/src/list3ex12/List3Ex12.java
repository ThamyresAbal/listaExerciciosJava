package list3ex12;

import java.util.Scanner;

public class List3Ex12 {
    public static void main(String[] args) {
// declarando o objeto entrada para ler o qu eo usuario digitar e incluir na classe scanner
        Scanner entrada = new Scanner(System.in);// Classe Scanner 

        int mes; // variável 
        do { // caso o usuário decida digitar 0 ou acima de 12 já que o ano só possui 12 meses           
            System.out.println("Entre com um mês: "); // solicitando informação do usuário
            mes = entrada.nextInt(); // lendo a informação dada
            if ((mes < 1) || (mes > 12)){ // --> || operador Lógico ou...se a primeira condição for verdadeira ele nem olha a segunda
                System.out.println("Erro! Mês inválido !!!");
            }
        } while ((mes < 1) || (mes > 12));
    }
}
