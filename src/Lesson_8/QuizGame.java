package Lesson_8;

import java.util.Scanner;

public class QuizGame {
    String questionText;
    char validAnswer;
    String answers;
    int score=0;

    QuizGame(String questionText,char validAnswer,String answers){
        this.questionText=questionText;
        this.validAnswer=validAnswer;
        this.answers=answers;
        this.score=score;
    }
    void checkAnswer(){
        Scanner sc=new Scanner(System.in);
        System.out.println(questionText);
        System.out.println(answers);
        char userAnswer = sc.next().charAt(0);
        if (userAnswer==validAnswer){
            System.out.println(" Correct ");
              this.score++;
        }else {
            System.out.println( " Incorrect ");
        }
    }
}
