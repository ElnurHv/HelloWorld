package Part2;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your exam score");
        int GradeScore = scanner.nextInt();

        int q=GradeScore %10;
        if (GradeScore==0); {
        GradeScore--;
    }

        switch (GradeScore/10)  {
            case 10:

            case 9:
                System.out.println("Letter Score =A");
                break;
            case 8:
                System.out.println("Letter Score=B");
                break;
            case 7 :
                System.out.println("Letter Score=C");
                break;
            case 6:
                System.out.println("Letter Score=D");
                break;
            default:
                if (GradeScore >= 0 && GradeScore <= 100) {
                    System.out.println("Letter Grade: F");
                } else {
                    System.out.println("Error: Invalid score. Please enter a score between 0 and 100.");
                }




        }

    }

}
