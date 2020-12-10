package se.lexiconSebastian;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {



        System.out.println("Hello Java!");
        Scanner scanner=new Scanner(System.in);

        boolean isActive = true;
        while(isActive){

            System.out.println("Please enter number one");
            int number1 = scanner.nextInt();
            System.out.println("Please enter number two");
            int number2 = scanner.nextInt();

            System.out.println("Please choose operation type");
            String operationType= scanner.next();
            switch (operationType)
            {
                case "+":
                    int resultSum = addition(number1, number2);
                    System.out.println(resultSum);
                    break;
                case "-":
                    int resultSub = subtraction(number1, number2);
                    System.out.println(resultSub);
                    break;
                case "*":
                    System.out.println("I want to invoke multiplication method");
                    break;
                case "/":
                    System.out.println("I want to invoke division method");
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
}
