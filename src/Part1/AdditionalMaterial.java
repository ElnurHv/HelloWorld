package Part1;

import java.util.Scanner;

public class AdditionalMaterial {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number-1");
        a = scanner.nextInt();
        System.out.println("Enter number-2");
        b = scanner.nextInt();
        System.out.println("Enter number-3");
        c = scanner.nextInt();

        boolean IsGreather;

        if (a > b && a > c) {
            System.out.println("IsGreather" + a);
        } else if (b > a && b > c) {
            System.out.println("IsGreather" + b);
        } else {
            System.out.println("IsGreather" + c);
        }
        boolean isless;

        if (a < b && a < c) {
            System.out.println("Isless" + a);
        } else if (b < a && b < c) {
            System.out.println("Isless" + b);
        } else {
            System.out.println("Isless" + c);
        }


    }
}

