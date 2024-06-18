package Part1;

import java.util.Scanner;

public class Dersnumber5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");//bir integer daxil edirik
        int number = scanner.nextInt();

        //Bu integer 10 dan boyuk olmamalidir.
        boolean isGreater = number > 10;
        boolean isless = number < 10;
        boolean isEqual = number <= 10;


        System.out.println(number + " is Greather " + isGreater);//Girdiyimiz reqemin 10 boyuk olub olmadigini yoxlayiriq
        System.out.println(number + " is less " + isless);
        System.out.println(" is eqqual " + isEqual);

        if (number > 10) {
            System.out.println(" is Negative " + (-number));//Girdiyimiz reqem 10 dan boyukdurse bu reqem menfi olacaq
        } else {
            System.out.println(" Selected number " + number);// neg deyilse secdiyimiz reqemi goruruk

        }
        if (number % 2 == 0) { //secdiyimz reqem cutdurse yazdirirq deyilse de yazdirirq
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd ");


        }
        System.out.println("Enter a double number");//kesirli sayinin alib onu tam sayi ile toplayiriq
        double number2 = scanner.nextDouble();
        System.out.println("  sum of " + number + " and " + number2 + " is " + (number + number2));

        int randomNumber3 = (int) (Math.random() * 10) + 1; //tesadufi 1 den 10 na qeder sayi aliriq
        int result = number + randomNumber3;
        System.out.println(" Sum of " + number + " and " + randomNumber3 + " is " + (number + randomNumber3));
////ve tesadufi aldigmiz reqemi int ile toplayiriq

        if (result > 20) { ///topladigmiz reqem 20 den boyuk ve ya kicik olmasini yaziriq
            System.out.println(" result " + (result) + " Is larger 20 ");
        } else {
            System.out.println(" result " + (result) + " is not larger 20 ");
        }


    }
}
