/*Sloke Shrestha
 * COSC 1337 002
 * 1-16-2020
 * Purpose: Implement the standard String and Random class from Java (Program 1: Initials)
 * INSIGHT: random.nextInt(currentName.length() - RAND_CAHR_NUM + 1); was used. 
 * 			In particular, in nextInt(num), num = currentName.length() - RAND_CHAR_NUM + 1 was selected 
 * 			because the maximum random number we wanted was currentName.length() - RAND_CHAR_NUM. The bound num is 
 * 			exclusive. 
 */
package initials;

import java.util.Random;

public class Program1Initials {
	private final static int RAND_CHAR_NUM = 5; 	//number of letters to get randomly.
	private final static int NUM_OF_NAME_PARTS = 3;	//number of parts of name is 3 (First, Middle, Last)
	
	public static void main(String[] args) {	
		Random random = new Random(); 				//initailizing a random object
		
		String[] strings = {"David Lee Alger", "Kate Garry Hudson", 
							"Tina Stamatina Fey", "Hugh Mungo Grant",
							"Uma Karuna Thurman"};					//input list of names		
		
		for (String currentName: strings) {		
			String name[] = new String[NUM_OF_NAME_PARTS];			//String array of different part of the name.

			int startIndx = 0; 										//start index to get the substring from.

			for (int x = 0; x < NUM_OF_NAME_PARTS; x++ ){
				int whiteSpaceIndx = currentName.indexOf(' ', startIndx);	//find the whitespace index of first space from startIndx.
				
				if (whiteSpaceIndx == -1) 
					whiteSpaceIndx = currentName.length(); //if there is no more whitespace, get the length of the string.
				
				name[x] = currentName.substring(startIndx, whiteSpaceIndx); //gets different parts of name. WhiteSpaceIndx is exclusive.

				startIndx = whiteSpaceIndx + 1;								//start from the last whitespaceIndx +1 in the next iteration.

			}

			System.out.println("Your first name is " + name[0] + " with a length of " + name[0].length());
			System.out.println("Your middle name is " + name[1] + " with a length of " + name[1].length());
			System.out.println("Your last name is " + name[2] + " with a length of " + name[2].length());
			
			System.out.println("Your initials are " + name[0].charAt(0)+ 
													name[1].charAt(0)+ 
													name[2].charAt(0)+
							 ". The length of your entire name is " + currentName.length());
			
			int randStrtIndx = random.nextInt(currentName.length() - RAND_CHAR_NUM + 1);	//in nextInt(num), num = currentName.length() - RAND_CHAR_NUM + 1 was selected because the maximum random number we wanted was currentName.length() - RAND_CHAR_NUM
 			System.out.print("A random sequence of 5 letters in your name is " + "\"" + currentName.substring(randStrtIndx, randStrtIndx + RAND_CHAR_NUM) + "\"");

			System.out.println(); //adding extra line
			System.out.println(); //adding extra line
			
		}	
	}
}