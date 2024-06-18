package Part1;

import java.util.Scanner;


public class Tesstoyun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guess the Number Game!\n" + "I'm thinking of a number between 1 and 10.");
        System.out.println("Enter your guess");
        int a = scanner.nextInt();

        if (a <= 10 && a >= 0) {
            int b;
            b = (int) (Math.random() * 10 + 1);

            if (a > b) {
                System.out.println(b + " too high ");
            }
            if (a < b) {

                System.out.println(b + " Too low ");
            }
            if (a == b) {
                System.out.println(b + " Congratulations! ");
            }


        } else {
            System.out.println("Max number is 10");
        }

    }
}