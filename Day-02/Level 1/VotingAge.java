//Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

import java.util.Scanner;

//Create a class name VotingAge
class VotingAge{
    public static void main(String[] args) {
	
	    // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Age: ");
		//Create an int variable age that stores the input age from the user
        int age = input.nextInt();
		
		// condition for person that can vote
		if(age>=18){
		   System.out.println("The person's age is" + age + " can vote.");
		}
		
		//condition for person that cannot vote
		else{
		   System.out.println("The person's age is" + age + " cannot vote.");
        }
		
		input.close();

    }
}

