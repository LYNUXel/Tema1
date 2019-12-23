/**
 * Exercitiul 11. Afisati la consola urmatoarea secventa de caractere folosind loop-uri for sau while "*"
 * <p>
 * *
 * **
 * ***
 * ****
 * *****
 * ******    VARIANTA 2
 */

public class Looping_11_2 {

    public static void main(String[] args) {

        System.out.println("\nExercitiul 11. Afisati * la consola folosind loop-uri for sau while ");
        System.out.println("-------------");

        int x = 6;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
