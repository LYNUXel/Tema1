/* Exercitiu 13. Afisati la consola urmatoarea secventa de caractere folosind loop-uri for sau while
*####
#*###
##*##
###*#
####*     */

public class Number_13 {

    public static void main(String[] args)
    {
        System.out.println("\nExercitiul 13:  Afisati la consola secventa de caractere folosind loop-uri for sau while.");
        System.out.println("-------------");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==j) {
                    System.out.print("*");
                }
                else{ System.out.print("#");}
            }
            System.out.println(" ");
        }
    }
}
