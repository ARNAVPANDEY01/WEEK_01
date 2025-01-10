//Create a program to find distance in yards
//Create a class with name DistanceinYards
import java.util.Scanner;

    class DistanceinYards{
	    public static void main(String[]args){
		    
			
			//Create an instance of Scanner class to user input
			Scanner input = new Scanner(System.in);

			
			//Create an integer variable distanceInFeet to take user input
			System.out.println("Enter distance in feet:"); 
			int distanceInFeet = input.nextInt();
			
			
			//Create an integer variable yard to find its value 
			int distanceinyard = distanceInFeet / 3;
			
			
			//Create an integer variable mile to find its value 
			int mile = distanceinyard/1760;
			
			
			//Create a double variable centimeter to find its value 
			double centimeter = distanceInFeet * 30.48;
			
			
			//Create a double variable modulo to find its value 
			double modulo = ((centimeter/30.48)/100)%100;
			
			
			//Create a double variable inches to find its value 
			double distanceininches = 12 * modulo;
			
			
			//Display the result
			System.out.println("Your height in cm is:" + centimeter + "while in feet is:" + distanceInFeet + "inches is:" + distanceininches);
		}
	}
		