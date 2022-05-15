package pl.sda.arp4.inheritance.kształty;

public class Trapez extends Kształt {
    private double bokA, bokB, bokC, bokD;
    private double wysokosc;

    public Trapez(double bokA, double bokB, double bokC, double bokD, double wysokosc) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.bokD = bokD;
        this.wysokosc = wysokosc;
    }

    @Override
    public double obliczPole() {
        return ((bokA + bokB) * wysokosc) / 2.0;
    }

    @Override
    public double obliczObwod() {
        return (bokA + bokB + bokC + bokD);
    }
}
