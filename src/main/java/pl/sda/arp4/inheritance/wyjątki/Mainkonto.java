package pl.sda.arp4.inheritance.wyjątki;

public class Mainkonto {
    public static void main(String[] args) {
        Konto k = new Konto();

        double ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);

        k.przelewPrzychodzacy(1050);

        try {
            k.wykonajPrzelew(1000);
            System.out.println("Sukces przelewu");
        }catch (Exception re) {
            System.out.println("Błąd: " +re.getMessage());
        }
        ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);
    }
}
