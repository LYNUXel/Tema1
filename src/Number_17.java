/* Exercitiu 17. Cititi numere de la consola pana cand se introduce un numar par */

import java.util.Scanner;

public class Number_17 {
    public static int par(int a, int b) {
        return a%2;
    }

    public static void main(String[] args) {
        System.out.println("Exercitiu 17. Cititi numere de la consola pana cand se introduce un numar par");
        System.out.println("-------------");
        System.out.println("Introdu numere: ");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a % 2 == b) {
                System.out.println("" + a);
            } else {
                for (b = 0; b > a; i++) {
                    System.out.println(" " + b);
                }
//        return;
//            }
//            int result = par(a+b/2, b/2);
//        }
            }
        }
    }
}
