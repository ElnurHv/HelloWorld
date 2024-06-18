package Lesson_11;

import java.util.Scanner;

public class CoinFlip {

    String username;
    String password;
    boolean islogin;


    public CoinFlip(String username, String password) {

        this.username = username;
        this.password = password;
        this.islogin = userInput();
    }

    public boolean userInput() {
        if (username.toLowerCase().equalsIgnoreCase("Fornuft") && password.equals("12345")) {
            System.out.println("Your logged");
            return true;

        } else {
            System.out.println("Your not logged");
            return false;
        }
    }


    public void CoinFlip() {

        if (!islogin) {
            return;
        }


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose Head (0) or Tail (1)");
            int userinput = scanner.nextInt();
            if (userinput == 0) {
                System.out.println("User choose Head ");
            } else if (userinput == 1) {
                System.out.println("User choose Tail ");
            }

            int coinFlip = (int) (Math.random() * 2);
            if (coinFlip == 0) {

                System.out.println("Head  ");
            } else if (coinFlip == 1) {
                System.out.println("Tail  ");
            }
            if (coinFlip == userinput) {
                System.out.println("You correct !");
            } else {
                System.out.println("Not correct ");
            }


            System.out.println(" Do you want to play again? (yes/no) ");
            String playAgain = scanner.next();
            if (!playAgain.equals("yes")) {
                break;

            }
        }
    }
}


