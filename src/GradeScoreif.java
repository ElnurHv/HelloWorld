import java.util.Scanner;

public class GradeScoreif {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your exam score (0-100): ");
        int score = scanner.nextInt();

        // Using if-else statements
        if (score >= 0 && score <= 100) {
            if (score >= 91) {
                System.out.println("Letter Grade: A");
            } else if (score >= 81) {
                System.out.println("Letter Grade: B");
            } else if (score >= 71) {
                System.out.println("Letter Grade: C");
            } else if (score >= 61) {
                System.out.println("Letter Grade: D");
            } else {
                System.out.println("Letter Grade: F");
            }
        } else {
            System.out.println("Error: Invalid score. Please enter a score between 0 and 100.");
        }

    }
}
