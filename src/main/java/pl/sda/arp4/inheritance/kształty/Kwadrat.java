package pl.sda.arp4.inheritance.kształty;

public class Kwadrat  extends Kształt {
    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    private double dlugoscBoku;

    public double obliczPole() {
        return  dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return 4 * dlugoscBoku;
    }
}
