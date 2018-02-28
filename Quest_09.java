package Lista_03;

import java.util.Scanner;

public class Quest_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Digite o valor de x:");
        x = ler.nextInt();
        
        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
            }else{
                x = 3 * x + 1;
            }
            System.out.println(x);
        }
    }   
}
