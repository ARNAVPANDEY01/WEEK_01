//Write a program to calculate sum of numbers until user enters 0
//Create a class name SumUntilZero

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
	    
		
		// Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
	
	
        // Initialize the total variable
        double total = 0.0;


        // Variable to store the user input
        double userInput;



        // Loop until the user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            userInput = input.nextDouble();

            // Exit the loop if the user enters 0
            if (userInput == 0) {
                break;
            }

            // Add the user input to the total
            total += userInput;
        }

        // Display the result
        System.out.println("The total sum is: " + total);

        // Close the scanner
        input.close();
    }
}
