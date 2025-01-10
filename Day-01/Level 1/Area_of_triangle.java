//Create a program to calculate area of triangle
import java.util.Scanner;

//Create a class with name AreaofTriangle

    class AreaofTriangle{
	    public static void main(String[]args){
		    
			
			//Create an instance of Scanner class to user input
			Scanner input = new Scanner(System.in);

			
			//Create an integer variable name base to take user input
			System.out.println("Enter base of triangle is:");
			int base = input.nextInt();

			
			
			//Create an integer variable name height to take user input
			System.out.println("Enter height of triangle is:");
			int height = input.nextInt();

			
			
			//Create an double variable name feet to calculate value
			double feet = (height/30.48);
			
			
			//Create an integer variable name area to calculate area of triangle
			int area = 1/2 * base * height;
			
			
			//Create an double variable sq_inches to calculate its value
			double sqinches = (area*0.155);
			
			
			//Display the result
			System.out.println("Your height in cm is:" + height + "while in feet is:" + feet + "inches is:" + sqinches);
			
			
			
		}
	}
			