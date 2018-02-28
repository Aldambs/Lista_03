package Lista_03;

import java.util.Scanner;

public class Quest_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char tv = 1;
        int totalv, vt = 0, vb = 0, vr = 0;
        double pt, pb, pr;

        do {
            
            System.out.print("Escolha tipo de vinho:\n"
                    + "T. TINTO\n"
                    + "B. BRANCO\n"
                    + "R. ROSÊ\n");
            tv = ler.next().charAt(0);
            
            switch (tv) {
                case 'T':
                    vt = vt + 'T';
                case 'B':
                    vb = vb + 'B';
                case 'R':
                    vr = vr + 'R';
            }
            
        } while (tv != 'F');
        
        totalv = vt + vb + vr;
        System.out.println("Porcentagem de vinho tinto: " + (vt * 100) / totalv);
        System.out.println("Porcentagem de vinho branco: " + (vb * 100) / totalv);
        System.out.println("Porcentagem de vinho rosê: " + (vr * 100) / totalv);
        System.out.println(totalv);
    }
}
