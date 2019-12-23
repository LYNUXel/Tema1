/* 18. Aplicati tehnicile de separare a codului in metode ce le-am facut in clasa PrimeNumbers2 la curs pentru algoritmul de numere palindrome.
Practic, scrieti o clasa in care sa aveti o metoda ce determina daca un numar este palindrom sau nu si apoi:
- afisati numerele palindrome pana la un numar n ( n > 100 preferabil )
- afisati primele n numere palindrome mai mari decat 100
Mentionez ca ar fi ideal daca ati reusi sa extrageti si cele 2 cerinte in cate o metoda, astfel incat sa aveti 3 metode in total in clasa.
-------------------------------------------------*/

public class MetodesPalidomeNo_18_2 {

    public static boolean isPalindrome(int n) {
        // we need it becouse we are going to alter n => make n 0
        int m = n;
        // we need it to buid the revers number
        int nr = 0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            nr = nr * 10 + r;
        }
//       if (nr == m){//           return true; }
//        else{
//            return false;
//       }
         return nr == m;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome(65465));
//        System.out.println(isPalindrome(4354));
//        System.out.println(isPalindrome(655));
        int n = 43244;
        for (int i = 100; i < n; i++) {
            if (isPalindrome(i) == true) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
