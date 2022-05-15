package pl.sda.arp4.inheritance.Iksztaltyzadanie;

public class kwadrat implements Ishape{

    private double bokA;

    public kwadrat(double edgeA) {
        this.bokA = bokA;
    }

    @Override
    public double calculateArea() {
        return bokA * bokA;
    }

    @Override
    public double calculateCircumference() {
        return bokA * 4;
    }
}