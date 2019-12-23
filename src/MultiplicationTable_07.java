/* Exercitiul 07. Tabla inmultirii cu for in while  */

public class MultiplicationTable_07 {
    public static void main(String[] args) {
        System.out.println("\nExercitiul 07. Tabla inmultirii cu for in while.");
        int i = 1;
        while(i < 10){
            System.out.println("-------------------");
            for (int j = 0; j < 1; j++){
            while(j < 10) {
                int k = i * j;
                System.out.println(" " + i + " * " + j + " = " + k + " ");
                j++;
            }
            i++;
            System.out.println();
        }

    }}
}

