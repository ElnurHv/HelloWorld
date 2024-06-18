package Lesson_6;

import java.util.Random;

public class randomArray10 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }
        int largest = array[0];
        System.out.println("Random array"); 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            largest = Math.max(array[i], largest );
        }
        System.out.println("Largest number is::" + largest);

    }
}
