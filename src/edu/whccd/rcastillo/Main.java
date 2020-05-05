package edu.whccd.rcastillo;

import java.util.Scanner;

/* This assignment is used to apply methods and data validation
    Author: Richard Castillo
 */

public class Main {

    public static void displayString(String input) {
        System.out.println(input);
    }

    static boolean isValid (int input, int lowerBound, int upperBound) {
        System.out.print("This Method validates if integer input is within range. ");
        boolean output = false;
        if (input >= lowerBound && input <= upperBound) {
            output = true;
            displayString( input + " " + " Within range");
        } else {
            displayString( input + " " + " Not within Range");
        }
        return output;
    }

    static boolean isValid(double input, double lowerBound, double upperBound) {
        System.out.print("This Method validates if double input is within range. ");
        boolean output = false;
        if (input >= lowerBound && input <= upperBound) {
            output = true;
            displayString(input + " " + "Within range");
        } else {
            displayString(input + " " + "Not within Range");
        }
        return output;
    }

    public static void main(String[] args) {
        int lowerBound = 100;
        int upperBound = 1000;
        boolean isValidInteger = false;
        boolean isValidDoubleInput = false;
        Scanner sc = new Scanner(System.in);


        do {
            displayString("Enter Integer (100-1000): ");
            int userInput;
            userInput = sc.nextInt();
            isValidInteger = isValid(userInput, lowerBound, upperBound); }
        while (!isValidInteger);

        do {
            displayString("Enter a double (100-1000): ");
            double userInput;
            userInput = sc.nextDouble();
            isValidDoubleInput = isValid(userInput, lowerBound, upperBound); }
        while (!isValidDoubleInput);
    }

}
