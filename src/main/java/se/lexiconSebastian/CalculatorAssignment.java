package se.lexiconSebastian;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {



        System.out.println("Welcome to my calculator");
        System.out.println("What mathematical problem do you want to solve today?");
        Scanner scanner=new Scanner(System.in);

        boolean isActive = true;
        while(isActive){

            System.out.println("Please enter number one");
            int number1 = scanner.nextInt();
            System.out.println("That´s a good number");
            System.out.println("Please enter number two");
            int number2 = scanner.nextInt();
            System.out.println("Excellent  choice");
            System.out.println("Please choose operation type: +, -, * or / ");
            String operationType= scanner.next();
            switch (operationType)
            {
                case "+":
                    int resultSum = addition(number1, number2);
                    System.out.println("The sum is " + resultSum);
                    break;
                case "-":
                    int resultSub = subtraction(number1, number2);
                    System.out.println(" The difference is " + resultSub);
                    break;
                case "*":
                    int resultMult = multiplication (number1, number2);
                    System.out.println("The product is " + resultMult);
                    break;
                case "/":
                    int resultDiv = division(number1,number2);
                    System.out.println("The quotient " + resultDiv);
                    break;
                default :
                    System.out.println("operation type is not valid");
            }
            System.out.println("do you want to continue?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")){
                isActive=false;

            }

        }




    }


    public static int addition(int number1,int number2){
        int result = number1 + number2;
        return result;
    }
    public static int subtraction(int number1, int number2){
        int result = number1-number2;
        return result;
    }
    private static int multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }
    private static int division(int number1, int number2){
    int result = number1 / number2;
    return result;
    }
}
