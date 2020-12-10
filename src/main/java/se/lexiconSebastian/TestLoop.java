package se.lexiconSebastian;

import java.util.Scanner;

public class TestLoop {
    public static void main(String[] args) {
        boolean isActive = true;

        while(isActive){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please choose operation type");
            String operationType= scanner.next();
            if(operationType.equalsIgnoreCase("exit")) {
                isActive=false;

            }
        }



    }
}
