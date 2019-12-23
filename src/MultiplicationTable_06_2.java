/* Exercitiul 06. Tabla inmultirii cu for in for  */

public class MultiplicationTable_06_2 {
    public static void main(String[] args) {

        System.out.println("\nExercitiu 06 - Varianta 2: Tabla inmultirii cu for in for");
        System.out.println("-------------");

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}

