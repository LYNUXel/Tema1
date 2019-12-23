// Exercitiul 08: Daca avem 2 variabile n si m
// afisati toate numerele de la 1 la n ce se impart la m

public class Number_08 {
    public static void main(String[] args) {
        System.out.println("Exercitiu 8: Daca avem 2 variabile n si m afisati toate numerele de la 1 la n ce se impart la m");
        int n = 55;
        int m = 5;

        for (int i = 1; i < n; i++) {
            if (i % m == 0) {
                System.out.println( i + " ");
            }
            System.out.print("");
        }
    }
}
