package Lesson_14.ShapeCalc;

import java.util.Scanner;

public class ShapeClaculator {

    int circlePoint = 5;
    int rectPoint = 10;
    int trinaglePoint = 15;

    int score = 0;


    double area(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }


    int area(int length, int width) {
        return length * width;
    }

    double area(int sideLength) {
        return Math.pow(sideLength, 2) * Math.sqrt(3) / 4;

    }

    public void shapeGame() {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter (c)ircle, (r)ectangle , (t)riangle ,or (q)uit exit ");
            String shape = scan.next();


            if (shape.toLowerCase().equalsIgnoreCase("q")) {
                break;
            }

            int point = 0;
            double area = 0;

            switch (shape) {
                case "c":
                    System.out.println("Enter the radius ");
                    double radius = scan.nextDouble();
                    area = area(radius);
                    point = circlePoint;
                    break;

                case "r":
                    System.out.println("Enter the length ");
                    int length = scan.nextInt();
                    System.out.println("enter the width ");
                    int width = scan.nextInt();
                    area = area(length, width);
                    point = rectPoint;
                    break;

                case "t":
                    System.out.println("Enter the side height ");
                    int sideLength = scan.nextInt();
                    area = area(sideLength);
                    point = trinaglePoint;
                    break;
                default:
                    System.out.println("Try again ");
                    continue;
            }
            System.out.println("Area: " + area);
            System.out.println("Point:" + point);
            score += point;


        }
        System.out.println("Final  score " + score);

    }
}