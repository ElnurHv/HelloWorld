package Lesson_15.CardGame;

import java.util.Random;
import java.util.Scanner;

public class Card implements PlayGame {
    Scanner scan = new Scanner(System.in);
    int card1, card2, dealercard1, dealercard2;
    int total = 0;
    int dtotal = 0;

boolean again=true;


    @Override
    public void playgame() {

        Random random = new Random();
        String playAgain = scan.next();
        while (playAgain.equalsIgnoreCase("y")) {

            dealercard1 = random.nextInt(10) + 1;

            dealercard2 = random.nextInt(10) + 1;
            dtotal = dealercard1 + dealercard2;


            card1 = random.nextInt(10) + 1;
            card2 = random.nextInt(10) + 1;
            total = card1 + card2;
            System.out.println("First cards " + card1 + " /" + card2);
            System.out.println("Total " + total);
            System.out.println("Another card (y)or(n)");
            String anotherCard = scan.next();

            if (anotherCard.equalsIgnoreCase("y")) {
                int nextCard = random.nextInt(10) + 1;
                total += nextCard;
                System.out.println("Card " + nextCard);
                System.out.println("Total " + total);
                if (total > 21) {
                    System.out.println("You busted dealer win");
                    System.out.println("Play again? y/n");
                    playAgain = scan.next();
                }
                if (total < 21) {
                    System.out.println("another card y/n ");
                    anotherCard = scan.next();

                    if (anotherCard.equalsIgnoreCase("n")) {
                        System.out.println("Dealer had" + dtotal);
                        System.out.println("You had " + total);


                    }
                }
            }
                if (anotherCard.equalsIgnoreCase("n")) {
                    if (total < 21 && total > dtotal) {
                        System.out.println("You Win! " + dtotal);
                        System.out.println("play again y/n ?");
                        playAgain = scan.next();
                    } else {
                        System.out.println("You lose " + dtotal);
                        System.out.println("Play again y/n ?");
                        playAgain = scan.next();
                    }

                }

            }




        }
    }
