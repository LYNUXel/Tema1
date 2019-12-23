/**
 * Exercitiul 12. Afisati la consola urmatoarea secventa de caractere folosind loop-uri for sau while "*"
 * *******
 * *****
 * ****
 * ***
 * **
 * *
 */

public class Looping_12 {

    public static void main(String[] args) {

        System.out.println("\nExercitiul 12. Afisati * la consola folosind loop-uri for sau while ");
        System.out.println("-------------");

        int x = 6;
        for (int i = 0; i <= x + 1; i++) {
            for (int j = 0; j < x + 1; j++) {
                System.out.print("");
            }
            for (int k = i; k <= x - 1; k++) {
                System.out.print("*");
            }
        /*int rand = 4;
        for (int i = 0; i <= rand + 1; i++) {
            for (int j = 0; j < rand + 1; j++) {
                System.out.print("");
            }
            for (int k = i; k <= rand + 1; k++) {
                System.out.print("*");
            }*/
            System.out.println();
        }
    }
}