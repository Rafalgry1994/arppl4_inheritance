package pl.sda.arp4.inheritance.kształty;

public class Main {
    public static void main(String[] args) {
        Kwadrat k = new Kwadrat(5);

        System.out.println("Pole" + k.obliczPole());
        System.out.println("Obwod" + k.obliczObwod());
    }
}
