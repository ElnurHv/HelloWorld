package Lesson_7;

import java.util.Random;

public class asd {






        private static final String[] SYMBOLS = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};

        public void pullLever() {
            Random random = new Random();
            String[] result = new String[3];
            for (int i = 0; i < 3; i++) {
                int index = random.nextInt(SYMBOLS.length);
                result[i] = SYMBOLS[index];
            }
            printOutcome(result);
        }

        private void printOutcome(String[] result) {
            System.out.println("Outcome of the lever pull:");
            for (String symbol : result) {
                System.out.print(symbol + "  ");
            }
            System.out.println();

            if (result[0].equals(result[1]) && result[1].equals(result[2])) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry, you lose. Better luck next time!");
            }
        }

        public static void main(String[] args) {
            asd slotMachine = new asd();
            slotMachine.pullLever();
        }
    }




