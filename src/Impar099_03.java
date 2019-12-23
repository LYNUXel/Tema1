// Exercitiul 03. Afisati pe o singura linie numerele impare de la 0 la 99

public class Impar099_03 {
    public static void main(String[] args) {
        System.out.println("\nExercitiul 03. Afisati pe o singura linie numerele impare de la 0 la 99");
        System.out.println("-------------");
        int a = 100;
        for (int b = 1; b < a; b = b + 2) {
            System.out.print(b + ", ");
        }
    }
}