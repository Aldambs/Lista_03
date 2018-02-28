package Lista_03;

import java.util.Scanner;

public class Quest_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int regular = 0, bom = 0, otimo = 0;
        double soma = 0, med, por;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Informe a idade dos espectadores:");
            int id = ler.nextInt();
            System.out.println("Informe a opinião do espctador: 1. Regular 2. Bom e 3. Ótimo ");
            int op = ler.nextInt();
            
            if(op == 1){
                regular = regular + 1;
            }
            if(op == 2){
               bom = bom + 1; 
               bom++;
            }
            if(op == 3){
                soma = soma + id;
                otimo = otimo + 1;
            }
        }
        med = soma / otimo;
        por = (bom / 10) * 100;
        System.out.println("A média das idades das pessoas que responderam ótimo: " +med);
        System.out.println("A quantidade de pessoas que responderam regular é: " +regular);
        System.out.println("A percentagem de pessaos que responderam bom entre a todos é: " +por);
    }   
}
