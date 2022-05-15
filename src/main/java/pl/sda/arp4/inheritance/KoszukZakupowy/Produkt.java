package pl.sda.arp4.inheritance.KoszukZakupowy;

public class Produkt {


    private String nazwa;
    private double cenaProduktu;
    private PodatekProduktu podatek;

    public Produkt(String nazwa, double cenaProduktu, PodatekProduktu podatek) {
        this.nazwa = nazwa;
        this.cenaProduktu = cenaProduktu;
        this.podatek = podatek;
    }

    public double cenaBrutto() {
        double cenaProduktuBrutto = cenaProduktu + (cenaProduktu * podatek.getWartoscPodatku());
        return cenaProduktuBrutto;
    }


    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaProduktu=" + cenaProduktu +
                ", podatek=" + podatek +
                '}';
    }
}
