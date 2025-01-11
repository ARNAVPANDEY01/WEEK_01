//Write a program to check if the first is the smallest of the 3 numbers.


import java.util.Scanner;

//Create a class name SmallestNumber
public class SmallestNumber{
   public static void main(String[] args){
	
	// Creating Scanner object to take input from user
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number1 :");
	// Take input for a number 1
    int number1 = input.nextInt();
	
	System.out.println("Enter the number2: ");
	// Take input for a number2
	int number2 = input.nextInt();
	
	System.out.println("Enter the number3 :");
	// Take input for a number 3
	int number3 = input.nextInt();
	
	//Display the Result
	System.out.println("Is the first number the smallest?" +(number1 < number2 && number1 < number3));
	
	
	input.close();
   }
}

	 
