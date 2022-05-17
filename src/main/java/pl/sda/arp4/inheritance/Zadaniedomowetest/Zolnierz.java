package pl.sda.arp4.inheritance.Zadaniedomowetest;

public class Zolnierz extends Osoba{
    private Ranga ranga;


    public Zolnierz(String imie, String nazwisko, Ranga ranga) {
        super(imie, nazwisko);
        this.ranga = ranga;
    }

    @Override
    public void przedstawSie() {
        System.out.println( "Tu " + imie + " " + nazwisko + " " + ranga + " Polskich sił zbrojnych");
    }

}
