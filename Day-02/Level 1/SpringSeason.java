//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 

import java.util.Scanner;
 
//create a class with name SpringSeason
class SpringSeason{
    public static void main(String[] args) {
	
	    // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month (1-12): ");
		//Create an int variable month from 1-12 that stores the input from the user
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
		//Create an int variable day that stores the input from the user
        int day = input.nextInt();
		
		
		//Create a boolean variable isSpring that checks if it's spring season
		boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20-31
                           (month == 4 && day >= 1 && day <= 30) ||  // April
                           (month == 5 && day >= 1 && day <= 31) ||  // May
                           (month == 6 && day >= 1 && day <= 20);    // June 1-20


        //condition for spring season
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } 
		
		
		//condition if it's not spring season
		else {
            System.out.println("Not a Spring Season");
        }
		
		
		input.close();
		
	}
}


