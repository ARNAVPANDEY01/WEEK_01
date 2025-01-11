//Write a program to check if the first, second, or third number is the largest of the three.



import java.util.Scanner;

//Create a class name LargestNumber
public class LargestNumber{
   public static void main(String[] args){
	  
	// Creating Scanner object to take input from user
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number1 :");
	// Take input for a number 1
    int number1 = input.nextInt();
	
	System.out.println("Enter the number2: ");
	// Take input for a number 2
	int number2 = input.nextInt();
	
	System.out.println("Enter the number3 :");
	// Take input for a number 3
	int number3 = input.nextInt();
	
	//Display the result
	System.out.println("Is the first number the largest?" +(number1 > number2 && number1 > number3));
	System.out.println("Is the second number the largest?" +(number1 < number2 && number2 > number3));
	System.out.println("Is the first number the largest?" +(number1 < number3 && number2 < number3));
	
	input.close();

   }
}

	 