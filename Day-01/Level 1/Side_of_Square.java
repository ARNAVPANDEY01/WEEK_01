//Create a program to calculate perimeter of square
import java.util.Scanner;

//Create a class with name SideofSquare
    class SideofSquare{
	    public static void main(String[]args){
		    
			//Create an instance of Scanner class to user input
			Scanner input = new Scanner(System.in);
			
			

			//Creat a double variable name side to take user input
			System.out.println("Enter side of square:");
			double side = input.nextInt();
			
			
			//Creat a double variable name perimeter to find its value
			double perimeter = 4 * side;
			
			
			//Creat a double variable name area to find its value
			double area = Math.pow(side,2);
			
			
			//Display the value
			System.out.println("The length of side is:" + side + "whose perimeter is:" + perimeter);
		}
	}