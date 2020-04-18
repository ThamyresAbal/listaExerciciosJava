package lista3.ex13;

import java.util.Scanner;

public class Lista3Ex13 {
    public static void main(String[] args) {
        int dia, mes, ano;
        boolean dataValida;
        
        do{
            // simplificando a parte de baixo
            dia = leData ("Entre com o dia: ");// dia recebe as informações colocadas no método leData
            mes = leData ("Entre com o mês: "); //mes  recebe as informações colocadas no método leData
            ano = leData ("Entre com o ano: ");// ano   recebe as informações colocadas no método leData
            dataValida = validaData (dia, mes,ano); //chama validaData para fazer os testes de validação
            if (!dataValida ){ //parãmetro if = não dataValida (!)= não
                System.out.println("Erro!! Data inválida!!");
            }
        }while (dataValida == false);
    }
    private static boolean validaData (int dia, int mes, int ano){
        boolean dataOk = true;
        
        if (ano >= 1900) {
                switch (mes) {
                    case 4: case 6: case 9: case 11:
                        if ((dia < 1) || (dia > 30)) {
                            dataOk = false;
                        }
                        break;
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        if ((dia < 1) || (dia > 31)) {
                            dataOk = false;
                        }
                        break;
                    case 2:
                        if ((ano % 4) == 0) {
                            if ((dia < 1) || (dia > 29)) {
                                dataOk = false;
                            }
                        }
                        else {
                            if ((dia < 1) || (dia > 28)) {
                                dataOk = false;
                            }
                        }
                        break;
                    default: {
                        dataOk = false;
                    }    
                }
            }
            else {
                dataOk = false; 
            }
        return dataOk;
    }
        public static int leData(String msg){ // método que vai pegar a msg e colocar na variável dia, mes, ano 
        Scanner entrada =  new Scanner(System.in);
        int data;
        
        System.out.println(msg);// esse parâmetro msg vai para leData 
        data = entrada.nextInt();
        return data;
    }
}
