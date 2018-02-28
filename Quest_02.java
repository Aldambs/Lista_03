package Lista_03;

import java.util.Scanner;

public class Quest_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char cod;
        double valor, valorTV = 0, valorTP = 0;
        
        for(int i = 1; i <= 15; i++){
            System.out.println("INFORME O CÓDIGO E VALOR DA TRANSAÇÃO:");
            cod = ler.next().charAt(0);
            valor = ler.nextDouble();
            
            if(cod == 'V'){
                valorTV = valorTV + valor;
            }else if(cod == 'P'){
                 valorTP = valorTP + valor;
            }else{
                System.out.println("CÓDIGO INVÁLIDO!");
            }
        }
        System.out.println("DIGITE A QUANTIDADE DE FUNCIONÁRIO DA EMPRESA:");
        int qtd = ler.nextInt();
        double soma = 0, media = 0;
        for(int j = 1; j <= qtd; j++){
            System.out.println("DIGITE O SALÁRIO DE CADA FUNCIONÁRIO:");
            double sal = ler.nextDouble();
            soma = soma + sal;
            media = soma / qtd;
        }
        System.out.println("Valor total a vista é: " +valorTV);
        System.out.println("Valor total a prazo é: " +valorTP);
        System.out.println("A média dos salário é: " +media);
    }
    
}
