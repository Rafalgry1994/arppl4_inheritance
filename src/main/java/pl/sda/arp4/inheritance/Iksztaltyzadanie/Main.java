package pl.sda.arp4.inheritance.Iksztaltyzadanie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select shape: (square, circle, rectangle)");
        String shapeName = scanner.next();

        Ishape ishape = null;
        if (shapeName.equalsIgnoreCase("circle")) {
            System.out.println("Please provide radius:");
            double inputRadius = scanner.nextDouble();

            ishape = new kolo(inputRadius);
        } else if (shapeName.equalsIgnoreCase("square")) {
            System.out.println("Please provide length of the edge:");
            double inputEdge = scanner.nextDouble();

            ishape = new kwadrat(inputEdge);
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            System.out.println("Please provide length of the edge A:");
            double inputEdgeA = scanner.nextDouble();
            System.out.println("Please provide length of the edge B:");
            double inputEdgeB = scanner.nextDouble();

            ishape = new prostokat(inputEdgeA, inputEdgeB);
        } else {
            System.err.println("Provided shape can't be calculated.");
        }
        if (ishape !=null)
        System.out.println("Area          is : " + ishape.calculateArea());
        System.out.println("Circumference is : " + ishape.calculateCircumference());
    }
}
