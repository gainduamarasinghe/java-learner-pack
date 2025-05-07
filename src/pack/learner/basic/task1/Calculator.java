package pack.learner.basic.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){

        Scanner user_input = new Scanner(System.in);

        System.out.print("""
                ----------Basic Calculator----------
                ------------------------------------
                """);
//      calculator will perform until user type exit in Operator
        while(true){
//            validate the input using try-catch block.
            try{
                System.out.print("Enter First Number : ");
                int number1 = user_input.nextInt();

                System.out.print("Enter the Operator (+,-,*,/ or 'exit') : ");
                String operator = user_input.next();

//                exiting from the calculator.
                if (operator.equals("exit")){
                    System.out.println("Exiting Calculator. Good bye!");
                    break;
                }

                System.out.print("Enter Second Number: ");
                int number2 = user_input.nextInt();
                System.out.println("------------------------------------");

//                check the operator and call the relevant method.
                switch (operator){
                    case "+":
                        addition(number1, number2);
                        break;
                    case "-":
                        subtraction(number1, number2);
                        break;
                    case "*":
                        multiplication(number1, number2);
                        break;
                    case "/":
                        division(number1, number2);
                        break;
                    default:
                        System.out.println("Error: Invalid Operator");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter Integers Only.");
            }


        }


    }
//    Method to calculate the addition.
    public static void addition(double num1, double num2){
        double result;
        result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println("------------------------------------");
    }

//    Method to calculate the subtraction
    public static void subtraction(int num1, int num2){
        double result;
        result = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + result);
        System.out.println("------------------------------------");
    }

//    Method to calculate the multiplication.
    public static void multiplication(int num1, int num2){
        double result;
        result = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + result);
        System.out.println("------------------------------------");
    }

//    Method to calculate the division.
    public static void division(int num1, int num2){
        int result;
//        Try catch block use to avoid the zero division error.
        try {
            result =  num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch (ArithmeticException e){
            System.out.println("Error: You can't divide by zero.");
            System.out.println("------------------------------------");
        }
    }
}
