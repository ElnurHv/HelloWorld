package Lesson_14.MathOperations;

public class Main {
    public static void main(String[] args) {
        MathOperations math=new MathOperations();

        System.out.println("5 + 5="+math.add(5,5));
        System.out.println("5.5 + 5.5 = " + math.add(5.5, 5.5));
        System.out.println("5 + 5 + 5 = " + math.add(2, 5, 5));


        System.out.println("5 - 5 = " + math.subtract(5, 5));
        System.out.println("5.5 - 5.5 = " + math.subtract(5.5, 5.5));


        System.out.println("5 * 5 = " + math.multiply(5, 5));
        System.out.println("5.5 * 5.5 = " + math.multiply(5.5, 5.5));


        System.out.println("10 / 2 = " + math.divide(10, 2));
        System.out.println("10.5 / 2.5 = " + math.divide(10.5, 2.5));



    }
}
