package Lista_03;

import java.util.Scanner;

public class Quest_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, op;
        double ad = 0, sub = 0, mult = 0, div = 0;
        
        do{
            System.out.println("ESCOLHA UMA DAS OPÇÕES:\n"
                    + "1. Adição\n"
                    + "2. Subtração\n"
                    + "3. Multiplicação\n"
                    + "4. Divisão\n"
                    + "5. Sair");
            op = ler.nextInt();
            switch (op){
                case 1:
                    System.out.println("DIGITE O PRIMEIRO NÚMERO:");
                    num1 = ler.nextInt();
                    System.out.println("DIGITE O SEGUNDO NÚMERO:");
                    num2 = ler.nextInt();
                    ad = num1 + num2;
                    break;
                case 2:
                    System.out.println("DIGITE O PRIMEIRO NÚMERO:");
                    num1 = ler.nextInt();
                    System.out.println("DIGITE O SEGUNDO NÚMERO:");
                    num2 = ler.nextInt();
                    sub = num1 - num2;
                    break;
                case 3:
                    System.out.println("DIGITE O PRIMEIRO NÚMERO:");
                    num1 = ler.nextInt();
                    System.out.println("DIGITE O SEGUNDO NÚMERO:");
                    num2 = ler.nextInt();
                    mult = num1 * num2;
                    break;
                case 4:
                    System.out.println("DIGITE O PRIMEIRO NÚMERO:");
                    num1 = ler.nextInt();
                    System.out.println("DIGITE O SEGUNDO NÚMERO:");
                    num2 = ler.nextInt();
                    if(num2 != 0){
                        div = num1 / num2;
                    }else{
                        System.out.println("DIGITE OUTRO NÚMERO!");
                    }                  
                    break;
                case 5:
                    System.out.println("OPERAÇÃO CONCLUIDA!");
            }
        }while(op != 5);
        
        System.out.println("A soma é igual a: " +ad);
        System.out.println("A subtração é igual a: " +sub);
        System.out.println("A multiplicação é igual a: " +mult);
        System.out.println("A divisão é igual a: " +div);
    }  
}
