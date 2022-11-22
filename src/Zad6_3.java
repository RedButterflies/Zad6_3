//Napisz metodę pobierającą o użytkownika liczbę całkowitą z zakresu <99,999>.
//Zwróć sumę kwadratów jej cyfr. Załóż, że użytkownik może wprowadzić dowolny znak.
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Zad6_3 {
    static void PobieranieLiczbyCalkowitej() {
        try {
            System.out.println("Wprowadz liczbe calkowita z zakresu <99,999>: ");
            Scanner liczba = new Scanner(System.in);
            int liczbaWpr = liczba.nextInt();
            if (liczbaWpr < 99 || liczbaWpr > 999) {
                System.out.println("Wprowadzono liczbe spoza zakresu, sprobuj ponownie");
            } else {
                int sumaKwadratow = 0;
                while (liczbaWpr > 0) {
                    sumaKwadratow += (pow(liczbaWpr % 10, 2));
                    liczbaWpr = liczbaWpr / 10;
                }
                System.out.println("Suma kwadratow cyfr liczby:  " + sumaKwadratow);
            }
        }catch(InputMismatchException e){
            System.err.println("Wprowadzony znak nie jest liczba, sprobuj ponownie");
        }
    }
}
