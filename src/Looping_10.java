/** Exercitiul 10. Afisati la consola urmatoarea secventa de caractere folosind loop-uri for sau while
 # # # # # #
  # # # # # #
 # # # # # #
  # # # # # #
 # # # # # #
  # # # # # #  */

public class Looping_10 {

    public static void main (String[] args)
    {
        /*int m = 6;
        int n = 12;
        for(int rows = 0; rows < m; rows++)
        {
            for(int cols = 0; cols < n; cols++)
            {
                if((rows+cols)%2 == 0)

                System.out.print("# ");

                else System.out.print(" ");
            }
            System.out.println();
        }*/
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                }
                else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
}
