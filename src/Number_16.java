/* Exercitiu 16. Citit de la consola un numar n afisati suma cifrelor numarului n */

import java.util.Scanner;

public class Number_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercitiu 16. Citit de la consola un numar n afisati suma cifrelor numarului n.");
        System.out.println("-------------");
        System.out.println("Introdu un numar: ");
        String numbers = input.nextLine();
        int sum = 0;
        for (char c : numbers.toCharArray()) {
            sum += c - '0';
        }
        System.out.println("Suma cifrelor numarului este = " + sum);
    }
}

