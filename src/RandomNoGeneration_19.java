/* 19. Incercati, intr-un program sa generati 3 numere aleatorii si sa le afisati.
       Descrieti, ce utilitate ar putea avea pentru voi generarea de numere aleatorii

       LOTO 6/49
 */

import java.util.Random;

public class RandomNoGeneration_19 {
    private static final Random generator = new Random();

    public static void main(String[] args) {

        System.out.println("The 3 Random numbers generated in range" + " (1 to 100) are:");

        for (int i = 0; i < 6; i++) {
            int random = getRandomInRange(1, 49);
            System.out.print(random + " ");  // Utilitatea acestor numere aleatorii ar fi necesare in,
        }                                    // crearea unor aplicatii sau joc cum ar fi 6/49, loto, ruleta... etc
        System.out.println();
    }
    private static int getRandomInRange(int start, int end) {
        return start + generator.nextInt(end - start + 1);
    }
}