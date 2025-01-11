//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights


// Import the scanner class 
import java.util.Scanner;

// Create class name YoungestAndTallest 
public class YoungestAndTallest {
        public static void main(String[] args) {
			
                // Create a Scanner object to take input from the user
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter Amar's age: ");
                //create integer variable amar and initialize value based on user input
                int amar = scanner.nextInt();
				
                System.out.print("Enter Akbar's age: ");
                //create integer variable akbar and initialize value based on user input
                int akbar = scanner.nextInt();
                
                System.out.print("Enter Anthony's age: ");
                //create integer variable anthon and initialize value based on user input
                int anthon = scanner.nextInt();
				
                System.out.print("Enter Amar's height (in cm): ");
                //create integer variable amarHeight and initialize value based on user input
                int amarHeight = scanner.nextInt();
				
                System.out.print("Enter Akbar's height (in cm): ");
                //create integer variable akbarHeight and initialize value based on user input
                int akbarHeight = scanner.nextInt();
                
                System.out.print("Enter Anthony's height (in cm): ");
                //create integer variable anthonHeight and initialize value based on user input
                int anthonyHeight = scanner.nextInt();
				
				
                if (anthon < amar && anthon < akbar) {
                        System.out.println("The youngest friend is Anthony with age " + anthon + " years.");
                }
				else if (amar < anthon && amar < akbar) {
                        System.out.println("The youngest friend is Amar with age " + amar + " years.");
                } 
				else {
                        System.out.println("The youngest friend is Amar with age " + akbar + " years.");
                }

                if (anthonyH > amarH && anthonyH > akbarH) {
                        System.out.println("The tallest friend is Anthony with height " + anthonyH + " in cm.");
                } 
				else if (amarH > anthonyH && amarH > akbarH) {
                        System.out.println("The tallest friend is Amar with height " + amarH + " in cm.");
                }
				else {
                       System.out.println("The tallest friend is Akbar with height " + akbarH + " in cm.");
                }
                scanner.close();

        }
}
