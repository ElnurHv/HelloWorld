package Lesson_11;

import java.util.Scanner;

public class CircleRadius {

    double radius;

    public static void main(String[] args) {
        CircleRadius circle = new CircleRadius();
        System.out.println("Circe Area " + circle.calculateArea());
    }

    public double calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Circle Radius");
        double radius = sc.nextDouble();
        return Math.PI * Math.pow(radius, 2);
    }
}



