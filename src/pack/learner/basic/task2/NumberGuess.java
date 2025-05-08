package pack.learner.basic.task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
//        Generating the random number between 1 and 20.
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

//        Initializing number of attempts and won
        int attempts = 1;
        boolean hasWon = false;

        Scanner input = new Scanner(System.in);

//        This
        while(attempts <= 5){
            try{

                System.out.print("""
                ----------Guessing Game----------
                ---------------------------------
                """);
                System.out.print("Guess the number: ");
                int guessed_num = input.nextInt();
                if (guessed_num < 0 || guessed_num > 20){
                    System.out.println("Error: 1 to 20 Integers only.");
                    continue;
                }

                hasWon = result(guessed_num, randomNumber);
                if(hasWon){
                    break;
                }
                attempts++;
            }catch (InputMismatchException e){
                System.out.println("Error: 1 to 20 Integers only.");
                input.nextLine();
            }
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
}
