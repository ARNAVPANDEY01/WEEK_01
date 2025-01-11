//Create a program to find the multiplication table of a number entered by the user from 6 to 9.

import java.util.Scanner;
 
//Create a class name MutiplicationTable
class MutiplicationTable{
 
    public static void main(String[] args) {
	    //Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		// create int variable number that take input from the user
        int number = input.nextInt();
		
		//loop for computing the multiplication table from 6 to 9
		for(int i=6; i<=9; i++){
		    System.out.println(number + " * " + i + " = " + (number*i));
		}
		
		
		input.close();
    }
}

