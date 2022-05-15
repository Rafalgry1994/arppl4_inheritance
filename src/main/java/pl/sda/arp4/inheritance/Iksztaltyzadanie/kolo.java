package pl.sda.arp4.inheritance.Iksztaltyzadanie;

import javax.crypto.Cipher;

public class kolo implements Ishape{

    private double promień;

    public kolo(double radius) {
        this.promień = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * promień;
    }

    @Override
    public double calculateCircumference() {
        return Math.PI * promień * promień;
    }
}
