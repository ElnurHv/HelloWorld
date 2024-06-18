package Part2;

import java.util.Scanner;

public class Rockptask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            int playerScore = 0;
            int compScore = 0;

            System.out.print(" Enter 1-Rock-2-Paper-3-Scissors :");
            int player = scanner.nextInt();
            int comp = (int) (Math.random() * 3) + 1;
            System.out.println(" Computer Chosse :" + comp);


            String item;
            String item2;

            if (player == 1) {
                item = "Rock";
            } else if (player == 2) {
                item = "Paper";
            } else if (player == 3) {
                item = "Scissors";
            } else {
                item = "Wrong item";
            }

            System.out.println("Your choose: " + item);

            if (comp == 1) {
                item2 = "Rock";
            } else if (comp == 2) {
                item2 = "Paper";
            } else if (comp == 3) {
                item2 = "Scissors";
            } else {
                item2 = "Wrong item";
            }
            System.out.println(" Computer choose " + item2);


            if (player == comp) {
                System.out.println("Draw");
            } else if (comp == 1 && player == 3) {
                System.out.println(" Rock beats Scissors ");
                compScore++;

            } else if (comp == 2 && player == 1) {
                System.out.println(" Paper beats Rock ");
                compScore++;
            } else if (comp == 3 && player == 2) {
                System.out.println("Scissors beats Paper ");
                compScore++;
            } else {
                System.out.println(" Player win");
                playerScore++;

                System.out.println(" Score" + " Comp " + compScore + " player " + playerScore);
            }


            System.out.println("Yes || NO");
            String cont = scanner.next();
            if (cont.equals("NO")){
                break;
            }

        }

    }


}








