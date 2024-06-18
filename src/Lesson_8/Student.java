package Lesson_8;

public class Student {
    String name;
    int grade;
    boolean isgraduating;

    public void GradeorPass(boolean isgraduating) {
        if (isgraduating) {
            System.out.println("Your Grade ");

        } else {
            System.out.println("Your Passing ");
        }

    }
}