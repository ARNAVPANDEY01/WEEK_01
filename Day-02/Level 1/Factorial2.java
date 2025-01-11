//Write a Program to find the factorial of an integer entered by the user using for loop

import java.util.Scanner;

//Create a class name Factorial2
public class Factorial2{
    public static void main(String[] args) {
		
		// Creating Scanner object to take input from user
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate its factorial: ");
		//Create an int variable number taking input from user
        int number= input.nextInt();
	
	    //Create an int variable factorial and assign value 1
	    int factorial=1;
		
		// Calculate factorial using for loop
	    for(int i=1; i<=number; i++){
	        factorial= factorial * i;
	    }
		
		// Display the result
		System.out.println("The factorial of " + number + " is: " + factorial);
		
		input.close();

	}
}

