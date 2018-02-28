package Lista_03;

import java.util.Scanner;

public class Quest_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod;
        int candA = 0, candB = 0,candC = 0, candD = 0;
        int votoN = 0, votoB = 0;
        double soma, percN, percB;
        
        do{
            System.out.println("Escolha o código do candidato:\n"
                    + "0. Sair \n"
                    + "1. Candidato A \n"
                    + "2. Candidato B \n"
                    + "3. Candidato C \n"
                    + "4. Candidato D \n"
                    + "5. NULO \n"
                    + "6. BRANCO");
             cod = ler.nextInt();
             
             switch(cod){
                 case 1:
                     candA++;
                     break;
                 case 2:
                    candB++;
                    break;
                 case 3:
                     candC++;
                     break;
                 case 4:
                    candD++;
                    break;
                 case 5:
                     votoN++;
                     break;
                 case 6:
                    votoB++;
                    break;       
             }
            soma = candA + candB + candC + candD;
        }while(cod != 0);
        
        System.out.println("TOTAL DE VOTOS PARA CANDIDATO A: " +candA);
        System.out.println("TOTAL DE VOTOS PARA CANDIDATO B: " +candB);
        System.out.println("TOTAL DE VOTOS PARA CANDIDATO C: " +candC);
        System.out.println("TOTAL DE VOTOS PARA CANDIDATO D: " +candD);
        percN = votoN / soma; 
        System.out.println("TOTAL DE VOTOS NULOS: " +votoN+ " \nA porcentagem é: " +percN);
        percB = votoB / soma; 
        System.out.println("TOTAL DE VOTOS BRANCOS: " +votoB+ " \nA porcentagem é: " +percB);
    }   
}
