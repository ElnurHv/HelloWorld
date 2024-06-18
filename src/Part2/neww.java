package Part2;

import java.util.Scanner;

public class neww {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int playerScore = 0;
            int computerScore = 0;
            int rounds = 0;

            while (true) {
                System.out.println("Round " + (rounds + 1));
                System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
                String playerChoice = scanner.nextLine();

                // Generate computer's choice
                String computerChoice = generateComputerChoice();

                // Determine the winner
                String result = determineWinner(playerChoice, computerChoice);
                System.out.println("Computer chose: " + computerChoice);
                System.out.println(result);

                // Update scores
                if (result.equals("You win!")) {
                    playerScore++;
                } else if (result.equals("You lose!")) {
                    computerScore++;
                }

                // Ask to play another round
                System.out.print("Do you want to play another round? (yes/no): ");
                String playAgain = scanner.nextLine();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }

                rounds++;
            }

            // Display final scores
            System.out.println("Final Scores:");
            System.out.println("You: " + playerScore + " - Computer: " + computerScore);
            System.out.println("Thanks for playing!");
        }

        private static String generateComputerChoice() {
            // Generate a random number between 0 and 2
            int randomNumber = (int) (Math.random() * 3);
            switch (randomNumber) {
                case 0:
                    return "Rock";
                case 1:
                    return "Paper";
                case 2:
                    return "Scissors";
                default:
                    return "Error";
            }
        }

        private static String determineWinner(String playerChoice, String computerChoice) {
            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                return "It's a tie!";
            } else if (
                    (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                            (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")) ||
                            (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
            ) {
                return "You win!";
            } else {
                return "You lose!";
            }
        }
    }


