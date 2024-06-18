package Lesson_6;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Grocery list ");
        int  item = scanner.nextInt();
        String[] list = new String[item];

        for (int i = 0; i < item; i++) {
            System.out.println("Enter item:" + i);
            list[i] = scanner.next();
        }
        System.out.println("\n Your List ");
        for (String ad : list) {
            System.out.println(ad);
        }


    }
}
