/*Sloke Shrestha
 * COSC 1337 002
 * 1/28/2020 
 * Purpose: To Practice simple selection (Lab5L1)
 * INSIGHT: 1) It does not change anything at all because it was the last case in the switch block
 * 
 * 			2) It is good to include default case as the final case because unlike other cases, it
 * 			   deals with several different inputs instead of just 1. In other words, doing so 
 * 			   makes better readability.*/

package selection;

import java.util.Scanner;

public class Lab5L1 {

	public static void main(String[] args) {
		//establish some variables
		String userId = "CorrectID"; 
		String password = new String("CorrectPassword");

		//get input from the user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your user ID and password, separated by sapces: ");
		String userIDAttempt = scanner.next();
		String passwordAttempt = scanner.next(); //becareful with next()

		//throw away any additional white space
		scanner.nextLine();

		//get the result of the login 
		if (userIDAttempt.equals(userId)) {
			if(password.equals(passwordAttempt))
				System.out.println("Welcome!");			
			else
				System.out.println("Incorrect Password!");
		}
		else if(password.equals(passwordAttempt))
			System.out.println("Incorrect UserID");
		else
			System.out.println("Incorrect UserID and password");


		//use a switch
		System.out.print("Please enter 1, 6, or 7: ");

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("You entered one!");					
		case 7:
			System.out.println("You entered seven!");
			break;
		default://always put default in the last at work.
			System.out.println("You entered something other than 1,6, or 7");
			break;
		case 6:
			System.out.println("You entered six.");
			break;
		}

	}
}
