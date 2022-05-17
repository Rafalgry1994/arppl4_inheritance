package pl.sda.arp4.inheritance.Zadaniedomowetest;

import java.util.Scanner;

public class zadanie2Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String calosWpisanegoTekstu = "";

        String tekst;
        do {
            System.out.println("Podaj tekst:");
            tekst = scanner.nextLine();

            // jeśli ktoś napisał 'quit' to nie dodawaj go to tekstu 'caloscWpisanegoTekstu'
            if (!tekst.equalsIgnoreCase("koniec")) {
                calosWpisanegoTekstu = calosWpisanegoTekstu + tekst;
            }
        } while (!tekst.equalsIgnoreCase("koniec"));

        System.out.println("Tekst wpisany wyżej: " + calosWpisanegoTekstu);

        // calosWpisanegoTekstu = "Ala ma kota. Kot nie lubi Ali. Wszyscy lubią koty. Nikt nie lubi Ali."
        // Ala ma kota. Kot nie lubi Ali.
        // Wszyscy lubią koty. Nikt nie lubi Ali.
        // quit
        //
        // Wpisano 10 zdań
        // 3 były złożone - 2 przecinki
        // 2 były proste - 0 przecinków
        // 5 było złożonych - 1 przecinek
        // 0 złożonych z więcej niż 2 przecinki
        int liczbaPrzecinkow = 0;
        int[] iloscZdanZPrzecinkami = new int[4];
        // tablica [ 0 ] == 0 przecinkow
        // tablica [ 1 ] == 1 przecinkow
        // tablica [ 2 ] == 2 przecinki
        // tablica [ 3 ] == >2 przecinki
        for (int i = 0; i < calosWpisanegoTekstu.length(); i++) {
            char znak = calosWpisanegoTekstu.charAt(i);
            if (znak == ',') {
                liczbaPrzecinkow++;
            }

            if (znak == '.') {
                if (liczbaPrzecinkow > 3) {
                    liczbaPrzecinkow = 3;
                }
                iloscZdanZPrzecinkami[liczbaPrzecinkow]++;
//                ^^^
////                         if (liczbaPrzecinkow == 0) {
////                               licznikiPrzecinkow[0]++;
////                          } else if (liczbaPrzecinkow == 1) {
////                              licznikiPrzecinkow[1]++;
////                          } else if (liczbaPrzecinkow == 2) {
////                              licznikiPrzecinkow[2]++;
////                          } else if (liczbaPrzecinkow > 2) {
////                              licznikiPrzecinkow[3]++;
                liczbaPrzecinkow = 0;
            }
        }
        // przecinkow = 0
        // Ala ma kota. Kot lubi Ale. Nikt inny nie lubi Ali, bo Ala, taka Ala, jest Ala. Czyli, Ala jest nielubiana.
        // STAN:
        // tablica [ 0 ] == 2
        // tablica [ 1 ] == 1
        // tablica [ 2 ] == 0
        // tablica [ 3 ] == 1
        //           ^ iloscPrzecinkow
        int sumaIloscWszystkichZdan = 0;
        for (int iloscPrzecinkow = 0; iloscPrzecinkow < iloscZdanZPrzecinkami.length; iloscPrzecinkow++) {
            int liczbaZdanZXPrzecinkami = iloscZdanZPrzecinkami[iloscPrzecinkow];

            sumaIloscWszystkichZdan += liczbaZdanZXPrzecinkami;
            System.out.println("W tekście wystąpiło: " + liczbaZdanZXPrzecinkami + " zdan z " + iloscPrzecinkow + " przecinkami.");
        }

        System.out.println("Wprowadzono " + sumaIloscWszystkichZdan + " zdań.");
    }
}

