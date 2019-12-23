/**
 * 04. Cititi doua numere de la consola.
 * Afisati un numar de simboluri egal cu diferenta absoluta dintre ele.
 */

import java.util.Scanner;

public class Read2nrdif2_04_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert 2 numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();

        int diff;
        if (a > b) {
            diff = a - b;
        } else {
            diff = b - a;
        }
        for (int i = 0; i < diff; i++) {
            System.out.print("*");
        }
        System.out.println();
        int diff2 = a - b;
        if (diff2 < 0) {
            diff2 = diff2 * -1;
        }
        for (int i = 0; i < diff2; i++) {
            System.out.print("*");
        }
    }
}