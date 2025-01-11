//Write a program to check if a number is divisible by 5

import java.util.Scanner;

//Create a class name NumberDivisibility
public class NumberDivisibility{
   public static void main(String[] args){
	   
	// Creating Scanner object to take input from user
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	
	// Take input for a number
    int number = input.nextInt();
	
	//Display the result
	System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
	
	
	input.close();
   }
}

	 
