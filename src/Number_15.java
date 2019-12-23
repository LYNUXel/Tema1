/* Exercitiu 15. Cititi numere de la consola pana cand suma lor este >= 100 */

import java.util.Scanner;

public class Number_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercitiu 15. Cititi numere de la consola pana cand suma lor este >= 100" +
                "\nIntrodu numere ce totalizeaza peste 100!");
        int sum = 0;
        while (sum < 100) {
            int n = scanner.nextInt();
            sum = sum + n;
        }
        System.out.println("Suma cifrelor numarului este = " + sum);
    }
}
