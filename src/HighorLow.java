import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
        public static void main(String[] args)
        {
            Random generator = new Random();
            Scanner in = new Scanner(System.in);
            int randomNumber = generator.nextInt(10) + 1;  // Generates 1-10
            int guess = 0;
            boolean done = false;
            String trash;

            do {
                System.out.print("Guess a number between 1 and 10: ");
                if (in.hasNextInt()) {
                    guess = in.nextInt();
                    in.nextLine(); // consume newline

                    if (guess >= 1 && guess <= 10) {
                        done = true;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 10.");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            } while (!done);

            System.out.println("The random number was: " + randomNumber);

            if (guess == randomNumber) {
                System.out.println("You guessed it!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            in.close();
        }
}
