/**
 * Exercitiul 10. afisati la consola urmatoarea secventa de caractere folosind loop-uri for sau while
 * # # # # # #
 * # # # # # #
 * # # # # # #
 * # # # # # #
 * # # # # # #
 * # # # # # #
 */

public class Looping_10_2 {

    public static void main(String[] args) {
        System.out.println("\nExercitiu 10: ");
        System.out.println("------------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
}


