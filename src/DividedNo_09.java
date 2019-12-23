/* Exercitiul 09. Afisati numerele mai mici decat n ce se divid cu 3, in ordine descrescatoare */

import java.util.Scanner;

public class DividedNo_09 {

    public static void main(String[] args) {

        System.out.println("\nExercitiul 09: Afisati numerele mai mici decat n ce se divid cu 3, in ordine descrescatoare ");
        System.out.println("-------------");
        System.out.print("\nNumber Divided by 3: ");

        for (int i=100; i>0; i--) {
            if (i%3==0)
                System.out.print(i +" ");
        }

        /*         Scanner scanner = new Scanner(System.in);

        System.out.println("\nExercitiul 09: Afisati numerele mai mici decat n ce se divid cu 3, in ordine descrescatoare ");
        System.out.println("-------------");
        System.out.println("\nNumber Divided by 3: ");

        int i = scanner.nextInt();
               if (i < 0){
                   i = i/3;
               } else {
                   i = i%3;
               }
                System.out.print(i +" ");
       */

//        System.out.println("\n\nDivided by 5: ");
//        for (int i=100; i>0; i--) {
//            if (i%5==0) System.out.print(i +" ");
//        }
//
//        System.out.println("\n\nDivided by 3 & 5: ");
//        for (int i=100; i>0; i--) {
//            if (i%3==0 && i%5==0) System.out.print(i +" ");
//        }
//        System.out.println("\n");
    }
}
