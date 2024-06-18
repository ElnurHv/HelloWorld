package Part1;

import java.util.Scanner;

public class ders3 {

    public static void main(String[] args) {

        Scanner scannner = new Scanner(System.in);
         double number1,number2,choose;
        System.out.println("number1");
        number1 = scannner.nextDouble();
        System.out.println("number2");
         number2 = scannner.nextDouble();
        System.out.println("choose action");
        System.out.println("1-add\n2-subract\n3-multiply\n4-divide");
        System.out.println("your choose");
        choose = scannner.nextDouble();

        if (choose ==1) {
        System.out.println("add"+(number1+number2));
        } else if (choose==2) {
        System.out.println("subtract"+(number1-number2));
        } else if (choose ==3) {
            System.out.println("multiply" + (number1 * number2));
        } else if (choose ==4) {
        if (number2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
        }else{
        System.out.println("divide" + (number1 / number2));
    }}else  {
            System.out.println("Invalid operator.");
        }




        System.out.println("choose: " + choose);







    }
}
