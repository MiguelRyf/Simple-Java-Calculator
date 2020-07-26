package miguel.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     *
     * Encapsulation V4 Multiple Calculator Operations
     * With User Driven Input
     *
     * */

    private static void printNewLine() {
        System.out.println("");
    }

    private static void printAppName() {
        System.out.println("Simple Calculator");
        System.out.println("------------------\n");
    }

    private static void addition() {
        // Create Object Instances
        Scanner myScanner = new Scanner(System.in);
        Calculator myCal = new Calculator();

        // Variables
        int userInput = 0;
        float num1;
        float num2;
        boolean num1Done = false;
        boolean num2Done = false;

        // Prompt
        do
        {
            try
            {
                printNewLine();
                System.out.print("Number 1: ");
                num1 = myScanner.nextInt();
                myCal.setNum1(num1);
                num1Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
                myScanner.next();
            }
        } while (!num1Done);


        do {
            try {
                System.out.print("Number 2: ");
                num2 = myScanner.nextInt();
                myCal.setNum2(num2);
                num2Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
            }
        } while(!num2Done);

        // Output
        printNewLine();
        System.out.println("Total = " + myCal.getNum1AddNum2());

    }

    private static void subtraction() {
        // Create Object Instances
        Scanner myScanner = new Scanner(System.in);
        Calculator myCal = new Calculator();

        // Variables
        int userInput = 0;
        float num1;
        float num2;
        boolean num1Done = false;
        boolean num2Done = false;

        // Prompt
        do
        {
            try
            {
                printNewLine();
                System.out.print("Number 1: ");
                num1 = myScanner.nextInt();
                myCal.setNum1(num1);
                num1Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
                myScanner.next();
            }
        } while (!num1Done);


        do {
            try {
                System.out.print("Number 2: ");
                num2 = myScanner.nextInt();
                myCal.setNum2(num2);
                num2Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
            }
        } while(!num2Done);

        // Output
        printNewLine();
        System.out.println("Total = " + myCal.getNum1SubNum2());

    }

    private static void multiplication() {
        // Create Object Instances
        Scanner myScanner = new Scanner(System.in);
        Calculator myCal = new Calculator();

        // Variables
        int userInput = 0;
        float num1;
        float num2;
        boolean num1Done = false;
        boolean num2Done = false;

        // Prompt
        do
        {
            try
            {
                printNewLine();
                System.out.print("Number 1: ");
                num1 = myScanner.nextInt();
                myCal.setNum1(num1);
                num1Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
                myScanner.next();
            }
        } while (!num1Done);


        do {
            try {
                System.out.print("Number 2: ");
                num2 = myScanner.nextInt();
                myCal.setNum2(num2);
                num2Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
            }
        } while(!num2Done);

        // Output
        printNewLine();
        System.out.println("Total = " + myCal.getNum1MulNum2());

    }

    private static void division() {
        // Create Object Instances
        Scanner myScanner = new Scanner(System.in);
        Calculator myCal = new Calculator();

        // Variables
        int userInput = 0;
        float num1;
        float num2;
        boolean num1Done = false;
        boolean num2Done = false;

        // Prompt
        do
        {
            try
            {
                printNewLine();
                System.out.print("Number 1: ");
                num1 = myScanner.nextInt();
                myCal.setNum1(num1);
                num1Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
                myScanner.next();
            }
        } while (!num1Done);


        do {
            try {
                System.out.print("Number 2: ");
                num2 = myScanner.nextInt();
                myCal.setNum2(num2);
                num2Done = true;
            }
            catch (InputMismatchException e) {
                printNewLine();
                System.out.println("Invalid number input");
            }
        } while(!num2Done);

        // Output
        printNewLine();
        System.out.println("Total = " + myCal.getNum1DivNum2());

    }

    private static void userPrompt() {
        // Create Object Instances
        Scanner myScanner = new Scanner(System.in);
        Calculator myCal = new Calculator();

        // Variables
        int userInput = 0;
        boolean userInputDone = false;

        // Prompt
        do
        {
            try
            {
                printNewLine();
                System.out.print("Number (eg 1): ");
                userInput = myScanner.nextInt();
                userInputDone = true;
            }
            catch (InputMismatchException e)
            {
                printNewLine();
                System.out.println("Invalid integer input");
                myScanner.next();
            }
        } while (!userInputDone);

        // Decision Operations
        switch (userInput)
        {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("No operation was chosen");
                System.exit(0);
        }

    }

    private static void myMethod() {
        // Create Object Instances
        Calculator myCal = new Calculator();

        printAppName();

        // Choices Operations
        System.out.println("Choose your operation\n");

        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (X)");
        System.out.println("4. Division (/)");

        userPrompt();

    }

    public static void main(String[] args) {
	myMethod();
    }
}
