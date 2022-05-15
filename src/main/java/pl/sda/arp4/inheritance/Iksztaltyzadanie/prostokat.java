package pl.sda.arp4.inheritance.Iksztaltyzadanie;

public class prostokat implements Ishape{

    private double bokA;
    private double bokB;

    public prostokat(double edgeA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double calculateArea() {
        return bokA * bokB;
    }

    public double calculateCircumference() {
        return 2 * bokA + 2 * bokB;
    }
}
