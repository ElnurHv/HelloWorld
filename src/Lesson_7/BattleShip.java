package Lesson_7;

import java.util.Scanner;

public class BattleShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true) {
           int count=0;
        System.out.print("Enter Row number");
        int row= scanner.nextInt();
        System.out.print("Enter col number");
        int col= scanner.nextInt();
        String[][] board = new String[][]{

                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "1", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "2", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "3", "*", "*", "*", "*", "10", "6"},
                {"13", "*", "*", "4", "*", "*", "*", "*", "11", "7"},
                {"14", "*", "*", "5", "*", "*", "*", "*", "12", "8"},
                {"15", "*", "*", "*", "*", "*", "*", "*", "*", "9"},
                {"*", "*", "16", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "17", "*", "*", "*", "*", "*", "*", "*"},
        };

           if (board[row][col].equals("*")) {
               System.out.println("You Miss");
           }else {
               System.out.println("hit");
           }

//           for(int i=0; i<board.length;i++) {
//                    for (int j = 0; j < board[i].length; j++) {
//                        count++;
//                    }
//
//                    for (int k = 0; k < board.length; k++) {
//                        for (int j = 0; j < board[k].length; j++) {
//                            System.out.print(board[i][k] + " ");
//
//                        }
//                        System.out.println();
//                    }
//                }
        }
    }
}