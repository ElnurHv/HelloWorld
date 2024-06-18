package Lesson_8;

public class QuizGameMain {
    public static void main(String[] args) {
        QuizGame qz1=new QuizGame("One of these is not a programming language?",
                'a',
                "A)HTML \nB)Java\nC)C++");
        QuizGame qz2=new QuizGame("What is the parent class of all Java classes?",
                'b',"A)Class \nB)Object\nC) Main ");
        QuizGame qz3=new QuizGame("Which of the following is not a primitive data type in Java?",
                'c',"A)Int \nB) Char \nC) String ");


        qz1.checkAnswer();
        qz2.checkAnswer();
        qz3.checkAnswer();
        System.out.println("Your score"+(qz1.score + qz2.score + qz3.score)+"/3");

    }
}
