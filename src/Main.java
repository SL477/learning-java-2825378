import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Where is the Death Star?";
        String choiceOne = "Corellia";
        String choiceTwo = "Endor";
        String choiceThree = "Naboo";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("1: " + choiceOne);
        System.out.println("2: " + choiceTwo);
        System.out.println("3: " + choiceThree);

        // Have the user input an answer
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an answer: ");
        // Retrieve the user's input
        String answer = sc.next();
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        Boolean isCorrect = answer.toLowerCase().equals(correctAnswer.toLowerCase()) || answer.equals("2");

        if (isCorrect) {
            System.out.println("Well done!");
        }
        else {
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Sorry the answer was " + correctAnswer);
        }
        sc.close();
    }

}
