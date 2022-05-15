package pl.sda.arp4.inheritance.interfejsyDrzwi;

public class Okna implements Izamykalnyotwieralny, Iuchylalny{

    public void otworz() {
        System.out.println("Otwórz okno");
    }
    public void zamknij() {
        System.out.println("Zamknij okno");
    }
    public void uchyl() {
        System.out.println("Uchyl okno");
    }
}