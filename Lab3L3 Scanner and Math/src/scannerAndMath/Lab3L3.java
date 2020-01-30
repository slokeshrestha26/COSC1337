/*Sloke Shrestha
 * COSC 1337 002
 * 1/23/2020
 * Purpose: To experiment with Scanners and Math Class (Lab3L3)
 * INSIGHT: Return type should change to boolean and
 * 			it needs to call isDigit(someCharacter) instead of toLowerCharacter()
 * */
package scannerAndMath;

import java.text.NumberFormat;
import java.util.Scanner; //imports go after package line and before everything else

public class Lab3L3 {
	public static void main(String[] args) {
		//Create and use a scanner
		Scanner input = new Scanner(System.in);	//standard input (keyboard)
		System.out.print("Please enter an integer: ");		
		int myIntger = input.nextInt();
		
		System.out.print("Please enter a double: ");		
		double myDouble = input.nextDouble();
		
		System.out.print("Please enter a Boolean: ");		
		boolean myBoolean = input.nextBoolean();
		
		System.out.print("Please enter a character: ");		
		char myChar = input.next().charAt(0);
		
		System.out.print("Please enter a String with no spaces: ");		
		String myStringWithNoSpaces = input.next();
		input.nextLine();
		
		System.out.print("Please enter a String with spaces: ");		
		String myStringWithSpaces = input.nextLine();
		
		System.out.println();
				
		//use the math class
		System.out.println("The square root of your integer is: " + Math.sqrt(myIntger));
		System.out.println("The square root of your double is: " + Math.sqrt(myDouble));
		
		if(myBoolean)
			System.out.println("The absolute value of your integer is: " + Math.abs(myIntger));
		else
			System.out.println("The absolute value of your double is: " + Math.abs(myDouble));
		
		if(myBoolean)
			System.out.println("Your integer raised to the value of your double is: " 
								+ Math.pow(myIntger, myDouble));
		else
			System.out.println("Your double raised to the value of your integer is: " 
					+ Math.pow(myDouble, myIntger));
		
		System.out.println("The minimum of your integer and your double is: " + 
							Math.min(myIntger, myDouble));
		System.out.println();
		
		//echo the Strings
		System.out.println(myStringWithNoSpaces);
		System.out.println(myStringWithSpaces);
		System.out.println();	
		
		//ues NumberFormat
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(); //gets it from the operating system.
		System.out.println("Your double formatted as a percentage, is "+ 
							NumberFormat.getPercentInstance().format(myDouble));

		System.out.println("Your double formatted as a percentage, is "+
							currencyFormatter.format(myDouble));
		
		//call a static method
		System.out.println("Results of convert on your character: " + convert(myChar));
		
		input.close();
	}
	
	public static char convert(char someCharacter) {
		
		return Character.toLowerCase(someCharacter);
	}

}
