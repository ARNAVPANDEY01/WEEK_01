//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

import java.util.Scanner;
 
//Create a class name LeapYear
class LeapYearCheck{
 
    public static void main(String[] args) {
	
	    //Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
 
        
        System.out.println("Enter Year");
        int year = input.nextInt();
		
		//Check if the year is in the Gregorian calendar
		if (year < 1582) {
		    System.out.println("The LeapYear program only works for year >= 1582");
		}
		else {
		
		    // Check if the year is divisible by 4
		    if (year % 4 == 0) {
			
			    //Check if the year is divisible by 100
			    if (year % 100 == 0) {
                    
					// Check if the year is divisible by 400
                    if (year % 400 == 0) {
					    System.out.println(year + " is a Leap Year.");
					}
					
					//If not divisible by 400, it is not a leap year
					else {
                        System.out.println(year + " is not a Leap Year.");
                    }
				}
				
				//If not divisible by 100, it is a leap year
				else{
				    System.out.println(year + " is a Leap Year.");
				}
			}
			
			//If not divisible by 4, it is not a leap year
			else{
			    System.out.println(year + " is not a Leap Year.");
			}
		}
		input.close();

	}
}

					
		    
		    
 
