package Lesson_12;

public class QuizGameMain {
    public static void main(String[] args) {
        QuizGame game = new QuizGame("Which company developed the Java language? ", "A)Sun Microsystems \nB)Moon Microsystems\nC)Earth Micro Systems)", 'A');
        QuizGame game1 = new QuizGame("What`s your first name Java language? ", "A)Maple\nB)Apple\nC)Oak", 'C');
        QuizGame game2 = new QuizGame("Who was the Java language developed by? ", "A)Ryan Gosling\nB)Ben Affleck\nC)James Gosling", 'C');
        QuizGame game3 = new QuizGame("In which year was the Java language created?", "A)23.05.1996\nB)23.05.1995\nC)23.05.1999", 'B');


        game.quizMethod();
        game1.quizMethod();
        game2.quizMethod();
        game3.quizMethod();


        System.out.println("Your score" + (game.getScore() + game1.getScore() + game2.getScore() + game3.getScore()) + "/4");
    }
}
