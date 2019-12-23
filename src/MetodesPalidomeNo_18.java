/* 18. Aplicati tehnicile de separare a codului in metode ce le-am facut in clasa PrimeNumbers2 la curs pentru algoritmul de numere palindrome.
Practic, scrieti o clasa in care sa aveti o metoda ce determina daca un numar este palindrom sau nu si apoi:
- afisati numerele palindrome pana la un numar n ( n > 100 preferabil )
- afisati primele n numere palindrome mai mari decat 100
Mentionez ca ar fi ideal daca ati reusi sa extrageti si cele 2 cerinte in cate o metoda, astfel incat sa aveti 3 metode in total in clasa.
-------------------------------------------------*/

import java.util.Scanner;

public class MetodesPalidomeNo_18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int i = s.nextInt();
        int j = i;
        int suma = 0;  // suma is where I build the reverse number

        while (i != 0) {
            int k = i % 10;
            i = i / 10;
            suma = suma * 10 + k;

        }
        if (suma == j) {
            System.out.print("Numarul " + suma + " este palindrom !");
        } else {
            System.out.print("Numarul " + suma + " NU este palindrom !");
        }

    }
}


