package pack.learner.basic.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("""
        ------------------------------
        -----Factorial Calculator-----
        ------------------------------
        """);

        while(true){
            try{

                System.out.print("Enter positive integer ('exit' to quit): ");
                String user_input = input.next();

                if (user_input.equalsIgnoreCase("exit")){
                    System.out.println("Exiting program. Bye!");
                    break;
                }

                int number = Integer.parseInt(user_input);

                if(number < 0){
                    System.out.println("Factorial is not defined for Negative Integers.");
                }else{
                    int result = calculateFactorial(number);
                    String path = pathOfFactorial(number);

                    System.out.println("Answer: " + path + " = " + result);
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Enter only Integers");
            }

        }

    }

    public static int calculateFactorial(int number){
        if (number == 0 || number == 1){
            return 1;
        }else{
            return number * calculateFactorial(number - 1);
        }
    }

    public static String pathOfFactorial(int number){
        if (number == 0 || number == 1){
            return "1";
        }else{
            return number + " x " + pathOfFactorial(number - 1);
        }
    }
}
