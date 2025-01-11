//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

//create a class name NumberCheck
class NumberCheck{
    public static void main(String[] args) {
	
	    // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
    
	    System.out.println("Enter number: ");
		//Create an int variable number that stores the input from the user
        int number = input.nextInt();
		
		
		// condition for positive number
		if(number>0){
		    System.out.println("Positive");
		}
		
		// condition for negative number
		else if(number<0){
		    System.out.println("Negative");
		}
		
		// condition for zero
		else{
		    System.out.println("Zero");
		}
		
		input.close();
    }
}



		
