//Create a program to find maximum number of handshakes
import java.util.Scanner;

//Create a class with name MaximumHandshake

    class MaximumHandshake{
	    public static void main(String[]args){
		    
			
			//Create an instance of Scanner class to user input
			Scanner input = new Scanner(System.in);

			
			
			//Create an integer variable name numberOfstudents to take user input
			System.out.println("Enter number of students:");
			int numberOfstudents = input.nextInt();
			
			
			
			//Create an integer variable name maximum_handshakes to find maximum number of possible handshakes 
			int maximumhandshakes = (numberOfstudents*(numberOfstudents-1))/2;
			
			
			//Display the result
			System.out.println("Possible number of handshakes is:" + maximumhandshakes);
			
		}
	}