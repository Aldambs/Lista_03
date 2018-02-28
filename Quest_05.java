package Lista_03;

import java.util.Scanner;

public class Quest_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número:");
        int n = ler.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(+n+ " x " +i+ " = " +n*i);
        }
    }   
}
