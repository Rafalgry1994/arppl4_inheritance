package pl.sda.arp4.inheritance.interfejsyDrzwi;

public class Drzwi implements Izamykalnyotwieralny,Izakluczalnyodkluczalny{

    public void otworz(){
        System.out.println("Otwórz drzwi");
    }
    public void zamknij() {
        System.out.println("Zamknij drzwi");
    }
    public void zaklucz(){
        System.out.println("Zaklucz drzwi");
    }
    public void odklucz(){
        System.out.println("Odklucz drzwi");
    }
}
