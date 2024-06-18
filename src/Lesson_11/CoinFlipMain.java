package Lesson_11;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("              Hi Welcome Coin Flip Game\nEnter User Sign                                                           ");
        CoinFlip coin = new CoinFlip(sc.nextLine(), sc.nextLine());
        coin.CoinFlip();


    }
}

