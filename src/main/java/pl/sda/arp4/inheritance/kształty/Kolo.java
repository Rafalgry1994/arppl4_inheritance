package pl.sda.arp4.inheritance.kształty;

public class Kolo extends Kształt{
    private final double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }


    public double obliczPole() {
        double promien = 0;
        return  Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
