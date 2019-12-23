import java.util.Scanner;

/* Exercitiul 05. Cititi doua numere de la consola (n si m):
1. daca n este mai mare decat m afisati numerele de la m la n crescator;
2. daca m este mai mare decat n afisati numerele de la m la n descrescator.
 */
public class Number_05 {
    public static void main(String[] args) {
        System.out.print("Exercitiu 5: Cititi 2 numere de la consola (n si m):" +
                "\n1. daca n > m => arata numerele de la m la n;" +
                "\n2. daca m > n => arata numerele de la n la m\n");
        System.out.println("-------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti 2 numere: \n");
        int n = s.nextInt();
        int m = s.nextInt();
        if (n > m) {
            for (int i = m; i < n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = m; i > n; i--) {
                System.out.println(i);
            }
        }
        System.out.println("-------------");
    }
}
