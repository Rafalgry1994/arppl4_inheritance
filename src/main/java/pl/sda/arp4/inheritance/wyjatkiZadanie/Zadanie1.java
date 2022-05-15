package pl.sda.arp4.inheritance.wyjatkiZadanie;

//1. Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b, i wyświetla wynik dzielenia a/b.
//Jeżeli b jest zerowe program powinien wyświetlić odpowiedni komunikat.
//Wariant 1: Zastosuj instrukcję if


import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe a");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe b");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Pamietaj cholero by nie dzielić przez zero");
        }else {
            double wynikDzielenia = a/b;
            System.out.println("Wynik dzielenia to:" + wynikDzielenia);
        }
    }
}
