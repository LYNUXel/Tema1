/** Exercitiul 04. Cititi doua numere de la consola.
 * Afisati un numar de simboluri egal cu diferenta absoluta dintre ele.
 */

import java.util.Scanner;

public class Read2nrdif2_04 {
    public static void main(String[] args) {
        System.out.println("\nExercitiul 04. Cititi doua numere de la consola.\n" +
                "si afisati un numar de simboluri egal cu diferenta absoluta dintre ele");
        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int diff;
        if (a > b) {
            diff = a - b;
        } else {
            diff = b - a;
        }
          for (int i = 0; i < diff; i++) {

         System.out.print("* ");
        }
        System.out.println();
        System.out.println("Diferenta dintre numere = " + diff);

        int diff2 = a - b;
        if (diff2 < 0) {
            diff2 = diff2 * -1;
        }
        System.out.println("-------------");
    }
}