import java.util.Scanner;

public class GradeScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your exam score (0-100): ");
        int Score = scanner.nextInt();
        String Grade = (Score >= 0 && Score <= 100) ? (Score >= 91) ? "A" :
                (Score >= 81) ? "B" :
                        (Score >= 71) ? "C" :
                                (Score >= 61) ? "D" :
                                        "F" :
                "Error: Invalid score.";
        System.out.println("Letter Grade: " + Grade);
    }
}
