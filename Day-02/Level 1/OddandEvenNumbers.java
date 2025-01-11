//Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;

//Create a class name OddandEvenNumbers
class OddandEvenNumbers{
 
    public static void main(String[] args) {
	
	    //Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		//Create an int variable number that take input from user
        int number = input.nextInt();
		
		//check for natural number
		if(number>0){
		
		    //using for loop to iterate from 1 to number
		    for(int i=1; i<=number; i++){
			
			    // condition for even number
			    if(i % 2 ==0){
				    System.out.println(i +" is even number");
                }
				
				//condition for odd number
                else{
                    System.out.println(i +" is odd number");   				
                }
			}
		}
	    input.close();
    }
}