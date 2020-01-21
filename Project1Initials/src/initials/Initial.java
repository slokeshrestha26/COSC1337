/*Sloke Shrestha
 * COSC 1337 002
 * 1-16-2020
 * Purpose: Implement the standard String and Random class from Java (Program 1: Initials)
 * INSIGHT: random.ints(5,0,currentName.length()).toAray()) was used to get an array of random numbers
 * 			of length 5, from 0 inclusive, and currentName.length() exclusive*/

package initials;

import java.util.Random;

public class Initial {
	private final static int RAND_CAHR_NUM = 5; //number of letters to get randomly.
	
	public static void main(String[] args) {		
		
		String[] strings = {"David Lee Alger", "Kate Garry Hudson", 
							"Tina Stamatina Fey", "Hugh Mungo Grant",
							"Uma Karuna Thurman"};
		//list of names		
		
		for (String currentName: strings) {			
			
			String[] nameArr = currentName.split(" "); //array of first, last, and last name of currentName			
			String fname = nameArr[0]; //first name
			String mname = nameArr[1]; //middle name
			String lname = nameArr[2]; //last name
			
			String randString = get_randString(currentName); //string of random 5 letters in currentName
			
			System.out.println("Your first name is " + fname + " with a length of " + fname.length());
			System.out.println("Your middle name is " + mname + " with a length of " + mname.length());
			System.out.println("Your last name is " + lname + " with a length of " + lname.length());
			
			System.out.println("Your initials are " + fname.charAt(0)+ 
													mname.charAt(0)+ 
													lname.charAt(0)+
							 ". The length of your entire name is " + currentName.length());
			
			System.out.println("A random sequence of 5 letters in your name is " + "\""+ randString+ "\"");

			System.out.println(); //adding extra line
			System.out.println(); //adding extra line
			
		}	
	}
	
	public static String get_randString(String currentName) {
		/*Returns A random sequence of 5 letters in the String currentName*/
		
		Random random = new Random(); //initializing a new random object
		
		int[] randIndxs = random.ints(5,0,currentName.length()).toArray(); //array of 5 random index from 0(inclusive) to length of current name(exclusive)	
		char[] randChars = new char[RAND_CAHR_NUM]; 	//random char of length RAND_CAHR_NUM
		
		for(int i = 0; i < RAND_CAHR_NUM -1; i++)		
			randChars[i] = currentName.charAt(randIndxs[i]);	
		
		String randString = String.valueOf(randChars);
		
		return randString;
	}
}
