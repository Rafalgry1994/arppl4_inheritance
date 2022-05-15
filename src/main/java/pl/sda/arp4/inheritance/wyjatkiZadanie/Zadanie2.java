package pl.sda.arp4.inheritance.wyjatkiZadanie;

//2. Napisz program który pyta użytkownika o dwie liczby (wykorzystaj program 1)  a następnie sprawdza czy druga liczba nie jest ==0.
// Jeśli jest, to wyrzuca wyjątek ‘CholeroException’ z komunikatem “Pamiętaj cholero, by nie dzielić przez zero!”.

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b");
        int b = scanner.nextInt();

        if (b == 0) {
            throw new CholeroException();
        }else {
            double wynikDzielenia = a/b;
            System.out.println("Wynik dzielenia to:" + wynikDzielenia);
        }

    }
}
