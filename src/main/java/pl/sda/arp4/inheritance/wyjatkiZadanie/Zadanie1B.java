package pl.sda.arp4.inheritance.wyjatkiZadanie;

//1. Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b, i wyświetla wynik dzielenia a/b.
//Jeżeli b jest zerowe program powinien wyświetlić odpowiedni komunikat.

//Wariant 2: Zastosuj instrukcję try-catch

import java.util.Scanner;

public class Zadanie1B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b");
        int b = scanner.nextInt();

        try {
            double wynikDzielenia = a / b;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        } catch (ArithmeticException ae) {
            System.out.println("Pamietaj cholero nie dziel przez 0");
        }
    }
}
