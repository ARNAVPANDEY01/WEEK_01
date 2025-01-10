// Write a new program but take user input for Student Fee and University Discount

// including scanner package
//Create a class name Student_Fees
import java.util.Scanner;

public class Student_Fees{
      public static void main(String[] args){
            
            //Create an instance of Scanner class to user input
		Scanner input = new Scanner(System.in);
                     
		//Create an int variable fee to take input of college fee
            System.out.println("Enter fee of Student:");
            int fee = input.nextInt();
            
            
            //Create an int variable to take input of discount percent
            System.out.println("Enter discout provided by University:");
            int discountPercent = input.nextInt();

            // creating an int variable discountAmount to store the discounted amount
            int discountAmount = (fee * discountPercent)/100 ;

            // creating an int variable discountedPrice to store the fee of student after discount
            int discountedPrice = fee - discountAmount;


            //Display the result
            System.out.println("The discount amount is INR "+ discountAmount + " and final discounted fee is INR "+  discountedPrice);
      }
}