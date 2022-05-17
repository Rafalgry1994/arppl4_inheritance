package pl.sda.arp4.inheritance.Zadaniedomowetest;

import java.util.Scanner;

public class zadanie1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");

        String tekst = scanner.nextLine();

        int liczbaKropek = 0, liczbaPrzecinkow = 0;

        // dla każdego znaku z tablicy 'tablica'
//        char[] tablica = tekst.toCharArray();
//        for (char znak : tablica) {
//            if (znak == '.') {
//                liczbaKropek++;
//            } else if (znak == ',') {
//                liczbaPrzecinkow++;
//            }
//        }
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            if (znak == '.') {
                liczbaKropek++;
            } else if (znak == ',') {
                liczbaPrzecinkow++;
            }
        }
        System.out.println("W tekście wystąpiło: " + liczbaKropek + " kropek, " + liczbaPrzecinkow + " przecinków.");
    }
}