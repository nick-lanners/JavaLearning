package src;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        String correctAnswer = choiceTwo;

        Scanner input = new Scanner(System.in);

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        System.out.println("Answer: ");
        String userInput = input.next();

        while (!userInput.toLowerCase().equals(correctAnswer.toLowerCase())) {
            System.out.println("Incorrect. Please try again.");
            System.out.println("Answer: ");
            userInput = input.next();
        }

        System.out.println("Correct! Good job!");
        input.close();
    }
}
