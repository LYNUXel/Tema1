/**
 * Exercitiul 11. Afisati la consola urmatoarea secventa de caractere folosind loop-uri for sau while "*"
 * <p>
 * *
 * **
 * ***
 * ****
 * *****
 * ******    VARIANTA 1
 */

public class Looping_11 {

    public static void loop(int n) {
        System.out.println("\nExercitiul 11. Afisati * la consola folosind loop-uri for sau while ");
        System.out.println("-------------");

        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        loop(n);
    }
}