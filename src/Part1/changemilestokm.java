package Part1;

import java.util.Scanner;

public class changemilestokm {
    public static void main(String[] args) {

        System.out.println("Mesafeni girin");

       Scanner scanner = new Scanner (System.in);
        double  miles=scanner.nextDouble();

        double km = miles * 1.6;

        System.out.println(miles + " miles kilometr " + km );
        scanner.close();
    }
}

