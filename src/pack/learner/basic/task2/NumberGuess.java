package pack.learner.basic.task2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        System.out.println(randomNumber);

        int attempts = 1;
        boolean hasWon = false;

        while(attempts <= 5){
            Scanner input = new Scanner(System.in);

            System.out.print("""
                ----------Guessing Game----------
                ---------------------------------
                """);
            System.out.print("Guess the number: ");
            int guessed_num = input.nextInt();

            hasWon = result(guessed_num, randomNumber);
            if(hasWon){
                break;
            }
            attempts++;
        }
        if (!hasWon){
            System.out.println("---------------------------------");
            System.out.println("Your attempts over.");
            System.out.println("Correct Answer: " + randomNumber);
        }
    }

    public static boolean result(int guess, int rand){

        if(guess == rand){
            System.out.println("---------------------------------");
            System.out.println("You won");
            return true;
        }else if(guess < rand){
            System.out.println("Your guess is too low.");
        }else{
            System.out.println("Your guess is too high.");
        }

        return false;
    }

    public static void validateInput(int number){
        if (number < 0 || number > 20){
            System.out.println("Invalid Inp");
        }
    }
}
