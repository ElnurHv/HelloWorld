package Lesson_12;

import java.util.Scanner;

public class QuizGame {
    private String questions;
    private String answer;
    private char validAnswer;
    private int score = 0;

    public QuizGame(String questions, String answer, char validAnswer) {
        this.questions = questions;
        this.answer = answer;
        this.validAnswer = validAnswer;

    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public char getValidAnswer() {
        return validAnswer;
    }

    public void setValidAnswer(char validAnswer) {
        this.validAnswer = validAnswer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void quizMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println(questions);
        System.out.println(answer);
        char userAnswer = scan.next().toUpperCase().charAt(0);

        if (userAnswer == validAnswer) {
            System.out.println(" Correct ");
            this.score++;
        } else {
            System.out.println(" Incorrect\nCorrect Answer  " + validAnswer);
        }

    }


}

