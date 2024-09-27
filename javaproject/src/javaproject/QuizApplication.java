
package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApplication {
    private static ArrayList<Question> questions = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample questions
        questions.add(new Question("What is the capital of France?", "Paris"));
        questions.add(new Question("What is 2 + 2?", "4"));
        questions.add(new Question("What is the color of the sky?", "Blue"));

        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Online Quiz System");
            System.out.println("1. Take Quiz");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    takeQuiz();
                    break;
                case 2:
                    quit = true;
                    System.out.println("Exiting Online Quiz System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void takeQuiz() {
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is: " + question.getCorrectAnswer());
            }
        }
        
        System.out.println("Your total score: " + score + "/" + questions.size());
    }
}

// Helper class for question information
class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
