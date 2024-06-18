package Lesson_7;

import java.util.Scanner;

public class CarParking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[][] garage= new String[][]{
                {"Vaz","Kia","Ford","Empty"},
                {"Opel","Nissan","Subaru",},
                {"Toyota","Tesla","Empty"},
                {"Hyundai","Mercedes","Bmw",},


        };
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage[i].length; j++) {
                System.out.println(" Park Lot : " + i + " : " + j + " : Car Name:" + garage[i][j]);

            }


            }
        System.out.print("Car Entry:::");
        String car=scanner.next();

        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage[i].length; j++) {
if(garage[i][j].equals("Empty"))  {
    garage[i][j]=car;
    System.out.println(garage[i][j]+i+j);
}
            }


        }












    }
}
