/* Exercitiul 06. Tabla inmultirii cu for in for  */

public class MultiplicationTable_06 {
    public static void main(String[] args) {

        System.out.println("\nExercitiu 06 - Varianta 1: Tabla inmultirii cu for in for");
        System.out.println("-------------");

        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println(" ");
            for (int j = 1; j < n+1; j++) {
                int k = i * j;
                                System.out.println(" " + i + " * " + j + " = " + k + " ");
            }
        }
    }
}


