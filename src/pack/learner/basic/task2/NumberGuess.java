package pack.learner.basic.task2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        System.out.println(randomNumber);

        while(true){
            Scanner input = new Scanner(System.in);

            System.out.print("""
                ----------Guessing Game----------
                ---------------------------------
                """);
            System.out.print("Guess the number: ");
            int guessed_num = input.nextInt();

            if(result(guessed_num, randomNumber)){
                break;
            }
        }

    }

    public static boolean result(int guess, int rand){
        boolean finished = false;
        if(guess == rand){
            System.out.println("You won");
            finished = true;
        }else if(guess < rand){
            System.out.println("Your guess is too low.");
        }else{
            System.out.println("Your guess is too high.");
        }
        
        return finished;
    }
}
