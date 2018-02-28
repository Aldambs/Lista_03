package Lista_03;

import java.util.Scanner;

public class Quest_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor para x:");
        int x = ler.nextInt();
        System.out.println("Informe o valor para y:");
        int y = ler.nextInt();
        int i = 1;
        while(i <= y){
            for(int j = 0; j < x; j++){
                if(i > y){
                    break;
                }
                if(j == 0){
                    System.out.println(i++ + " ");
                }else{
                    System.out.println(i++ + " ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
