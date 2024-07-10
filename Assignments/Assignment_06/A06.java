import java.util.Random;
import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Get a random number between 0 and 99
        int randomNumber = rand.nextInt(100);
        // Connect a scanner to the keyboard
        Scanner sc = new Scanner(System.in);
       
        int userGuess = -1;  

        System.out.println("Guess the correct number between 0 and 99. To quit, enter -1: ");   

        /* This loops until the number is guessed correctly */

        while (true) {
          System.out.print("Enter your guess: ");
          userGuess = sc.nextInt(); 
          
        /* This statement if for if the user decides to quit */

          if (userGuess == -1) {
             System.out.println("You have terminated the execution. The random number was: " +randomNumber);
             break;
          }

          /* This statement if the user guesses the random number correctly */
          
          if (userGuess == randomNumber) {
               System.out.println("Congrats! You guessed the correct number: " +randomNumber);
               break;
         } else if (userGuess < randomNumber) {
               System.out.println("Your guess is too low.");
         } else {
               System.out.println("Your guess is too high.");
        }
        }
        // Close the scanner
        sc.close(); 
    } // method main
}
