package Lista_03;

import java.util.Scanner;

public class Quest_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota, maior = 0;
        String nome = " ", nomevc = " ";

        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Digite o nome do candidato:");
            nome = ler.next();
            System.out.println("Digite a nota da vencendora:");
            nota = ler.nextDouble();
            if(nota >= 0 && nota <= 10){
                if(nota > maior){
                    nomevc = nome;
                    maior = nota;
                }
            }else{
                System.out.println("Nota inválida!");
            }
        }
        System.out.println("O nome da vencedorá é: " + nomevc);
        System.out.println("A nota da vencedorá é: " + maior);
    }
}
