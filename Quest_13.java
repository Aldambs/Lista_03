package Lista_03;

import java.util.Scanner;

public class Quest_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, alt = 0, tent = 0;

        do {
            System.out.println("Tente adivinhar o número do sorteio:");
            num = ler.nextInt();

        } while ((num >= 1) && (num <= 100));
        
        if (alt < num) {
            System.out.println("O número gerado é maior!");
        } else {
            if(alt == num){
            System.out.println("Acertou!");
        }
        tent = tent + 1;
        }
        System.out.println(tent);
    }
}
