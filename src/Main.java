import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "What is my cat's name?";
        String choiceOne = "Oscar";
        String choiceTwo = "Boca";
        String choiceThree = "Doc McStuffins";
        String correctAnswer = choiceTwo;

        //Write a print statement asking the question
        //Write a print statement giving the answer choices

        System.out.println(question);
        System.out.println("The choices are: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree);

        //Have the user input an answer
        //Retrieve the user's input

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        //If the user's input matches the correctAnswer...
        //then the user is correct and we want to print out a congrats message to the user.

        if(userInput.equals(correctAnswer)) {
            System.out.println("You are correct!");
        }

        //If the user's input does not match the correctAnswer...
        //then the user is incorrect and we want to print out a message saying that the user is wrong

        else {
            System.out.println("Sorry, that is the wrong answer. His name is Boca");
        }
    }
}

