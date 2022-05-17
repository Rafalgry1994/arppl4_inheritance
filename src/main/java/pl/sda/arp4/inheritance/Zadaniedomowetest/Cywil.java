package pl.sda.arp4.inheritance.Zadaniedomowetest;

public class Cywil extends Osoba{

    public Cywil(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Nazywam się" + imie + " " + nazwisko + " , jestem obywatelem Polskim");
    }
}
