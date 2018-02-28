package Lista_03;

import java.util.Scanner;

public class Quest_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char opcao, saque = 0, deposito = 0; 
        int saldo = 0;
        
        do{
            System.out.println("DIGITE A OPÇÃO DESEJADA:\n"
                    + "a. Consultar Saldo\n"
                    + "b. Saque\n"
                    + "c. Depósito\n"
                    + "d. Sair");
            opcao = ler.next().charAt(0);
            
            switch(opcao){
                case 'a':
                    saldo = saque + deposito;
                    System.out.println("O saldo é: " +saldo);
                    break;
                case 'b':
                    System.out.println("Digite o valor a ser depósitado:");
                    deposito = ler.next().charAt(0);
                    saldo = deposito + saldo;
                    System.out.println("O seu saldo é: " +saldo);
                    break;
                case 'c':
                    System.out.println("Digite o valor do saque:");
                    saque = ler.next().charAt(0);
                    if(saque > saldo){
                        System.out.println("O valor solicitado é menor que o solicitado!");
                        saldo = 0;
                        System.out.println("Saldo = " +saldo);
                    }else{
                        if(saque <= saldo){
                            saldo = deposito - saque;
                            System.out.println("Seu saldo é: " +saldo);
                        }
                    }
                    break;
                case 'd':
                    System.out.println("Operação finalizada!");
                    break;
            }
            
        }while(opcao == 'd');
    }
    
}
