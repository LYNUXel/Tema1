// Exercitiul 02. Afisati pe o singura linie numerele pare de la 0 la 99

public class Pareline099_02 {
    public static void main(String[] args) {
        System.out.println("\nExercitiul 02. Afisati pe o singura linie numerele pare de la 0 la 99");
        System.out.println("-------------");
        int a = 100;
        for (int b = 0; b < a; b = b + 2) {
            System.out.print(b + ", ");
        }
    }
}
