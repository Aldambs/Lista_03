package Lista_03;

import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double bonus = 0;
        
        for(int i = 1; i <= 15; i++){
            System.out.print("DIGITE O NOME DO CLIENTE:");
            String nome = ler.next();
            System.out.print("DIGITE O VALOR DA COMPRA REALIZADA:");
            double comp = ler.nextDouble();
            
            if(comp < 1000){
                bonus = comp + (comp * 0.10);
            }else{
                if(comp > 1000){
                    bonus = comp + (comp * 0.15);
                }               
            }
            System.out.print("O VALOR DO BÔNUS É: " +bonus+ "\n");
        }
    }
    
}
