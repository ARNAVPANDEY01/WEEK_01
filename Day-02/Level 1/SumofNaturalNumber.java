//Write a program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;

//Create a class name SumofNaturalNumber
class SumofNaturalNumber {
    public static void main(String[] args) {
		
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		// create an int variable number that store input number from user
        int number = input.nextInt();
		
		// condition for natural number
		if(number>0){
			
		  //create an int variable sum and compute the sum 
		  int sum= number* (number+1)/2;
		  System.out.println("The sum of " +number + " natural numbers is " + sum);
		}
		
		// condition for non-natural number
		else{
		  System.out.println("The number "+ number + "is not a natural number" );
		}
		
		input.close();

	}
}
		



