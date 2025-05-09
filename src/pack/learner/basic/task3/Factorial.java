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
//        program runs until user input exit.
        while(true){
            try{
//                get the input from user.
                System.out.print("Enter positive integer ('exit' to quit): ");
                String user_input = input.next();

//                check whether user input as exit, then quit the program.
                if (user_input.equalsIgnoreCase("exit")){
                    System.out.println("Exiting program. Bye!");
                    break;
                }

//                Make string to the integer using parseInt method in Integer class.
                int number = Integer.parseInt(user_input);

//                validate the input and call the output.
                if(number < 0){
                    System.out.println("Factorial is not defined for Negative Integers.");
                }else{
                    int result = calculateFactorial(number);
                    String path = pathOfFactorial(number);

                    System.out.println("Answer: " + path + " = " + result);
                }
            }catch (InputMismatchException e){
//                handling input errors.
                System.out.println("Error: Enter only Integers");
            }

        }

    }

//    Recursive Method to calculate the Factorial.
    public static int calculateFactorial(int number){
        if (number == 0 || number == 1){
            return 1;
        }else{
            return number * calculateFactorial(number - 1);
        }
    }

//    Recursive Method to print the path.
    public static String pathOfFactorial(int number){
        if (number == 0 || number == 1){
            return "1";
        }else{
            return number + " x " + pathOfFactorial(number - 1);
        }
    }
}
