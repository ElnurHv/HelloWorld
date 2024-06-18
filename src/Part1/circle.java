package Part1;

import java.awt.geom.Arc2D;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Circle Radius");
        double radius =scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(" Circle perimetr "+perimeter);
        System.out.println(" Circle area "+area);

    }
}
