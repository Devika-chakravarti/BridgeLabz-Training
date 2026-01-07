package com.personalizedlearningplatform;

public class Quiz {

    private String[] questions;
    private final String[] answers;
    private int score;
    private String difficulty;

    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
    }

    public void evaluateQuiz(String[] userAnswers) {
        score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score += 10;
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / (answers.length * 10);
    }

    public void displayResult() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("QUIZ RESULT");
        System.out.println("----------------------------------------");
        System.out.println("Difficulty : " + difficulty);
        System.out.println("Score      : " + score);
        System.out.println("Percentage : " + calculatePercentage());
        System.out.println("----------------------------------------");
    }
}
