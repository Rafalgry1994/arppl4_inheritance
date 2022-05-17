package pl.sda.arp4.inheritance.Zadaniedomowetest;

import java.util.Arrays;
import java.util.Scanner;

public class MainCywilzadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Czy jesteś żołnierzem? (tak/nie)");
        String czyZolnierz = scanner.next();

        if (czyZolnierz.equalsIgnoreCase("tak")) {
            Ranga podanaRanga = null;
            do {
                System.out.println("Jaka jest Twoja ranga (" + (Arrays.toString(Ranga.values())) + "):");
                String rangaString = scanner.next();

                try{
                    podanaRanga = Ranga.valueOf(rangaString.toUpperCase());
                }catch (IllegalArgumentException iae){
                    System.out.println("Podana ranga nie istnieje...");
                }
            } while (podanaRanga == null);

            System.out.println("Podaj swoje imie:");
            String imie = scanner.next();
            System.out.println("Podaj swoje nazwisko:");
            String nazwisko = scanner.next();

            Osoba osoba = new Zolnierz(imie, nazwisko, podanaRanga);
            osoba.przedstawSie();
        } else if (czyZolnierz.equalsIgnoreCase("nie")) {
            System.out.println("Podaj swoje imie:");
            String imie = scanner.next();
            System.out.println("Podaj swoje nazwisko:");
            String nazwisko = scanner.next();

            Osoba osoba = new Cywil(imie, nazwisko);
            osoba.przedstawSie();
        }else{
            System.out.println("Czyli jesteś osiołkiem :)");
        }
    }
}

