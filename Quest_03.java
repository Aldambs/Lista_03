package Lista_03;

import java.util.Scanner;

public class Quest_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de funcionário:");
        int fun = ler.nextInt();
     
        double med;
        double sal;
        double soma = 0;
        
        for(int i = 1; i <= fun; i++){
            System.out.println("Informe o salário de cada funcionário:");
            sal = ler.nextDouble();
            soma = soma + sal;
        }
        if(fun > 0){
            med = soma/fun;
            System.out.println("A soma salárial é: " +soma+ " \nMédia dos salários é: " +med);
        }else{
            System.out.println("Não existe funcionário na empresa!");
        }
    }   
}
