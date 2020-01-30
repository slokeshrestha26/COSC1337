/*Sloke Shrestha
 * COSC 1337 002
 * 1/29/20
 * Purpose: Check if the given credit card number is correct and generate 
 * 			a pin for the credit card (Program 2: Credit Card Validation)
 * INSIGHT: 
 * */
package creditCard;

import java.util.Scanner;

public class Program2CCValidation {

	public static void main(String[] args) {
		//get credit card number (ccn) from user
		String creditCardN = getCcn();
		
		//get credit card validity using Luhn Algorithm
		boolean ccnValid = getCcnValid(creditCardN); 
		//generate a pin
		if(ccnValid)
			int pin = get_pin();
	}
	
	public static String getCcn() {
		/*Returns the credit card number by prompting the user*/
		
		Scanner scanner = new Scanner(System.in); //scanner object
		
		//prompt
		System.out.print("Please enter your credit card number");
		String ccn = scanner.nextLine();
		
		scanner.close();
		
		return ccn; //parses input into integer		
	}
	
	public static boolean getCcnValid(String creditCardN){
		/*Returns if credit card number (creditCardN) is valid using Luhn Algorithm*/
		
		char lastDigit = creditCardN.charAt(creditCardN.length() - 1); //get last digit
		creditCardN = creditCardN.substring(0, creditCardN.length() -1); //drop last digit
		
		String reversCCN = "";
		
		//reverse the numbers.
		for(int i = creditCardN.length() -1; i >= 0; i-- )
			reversCCN = reversCCN + creditCardN.charAt(i);		
		
	}

}
