package Lesson_11;

import java.util.Scanner;

public class StringClass {
    String name;
    String surname;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name\nSurname");
        StringClass str = new StringClass();
        str.name = scanner.next();
        str.surname = scanner.next();

        String fullname = str.name.concat(" ").concat(str.surname);
        System.out.println(fullname);


    }
}

