/*Sloke Shrestha
 * COSC 1337 -002
 * 1/21/2020
 * Purpose: To explore String and Random classes (Lab3L2)
 * Insight: The parentheses have the highest order of precedence. So, when we 
 * 			type  (random1 + random2), the two numbers are added together and then printed. 
 * 			however, when we type random1 + random2, the two numbers are just appeded as strings.
 * */
package stringsAndStuffs;

import java.util.Random;

public class Lab3L2 {
	public static void main(String[] args) {
		//create some strings
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String everyEvenLetter = "BDFHJLNPRTVXZ";
		String politeGreeting  = new String("Hello, World! How are you?");
		String sentenceWithEveryLetter = new String("The quick brown fox jumps over the lazy dog.");
		
		//using length()
		System.out.println("Alphabet: " + alphabet + " " + "Length of Alphabet: " + alphabet.length());
		
		//changing cases
		System.out.println("Changing cases: ");
		System.out.println(everyEvenLetter.toUpperCase());
		System.out.println(politeGreeting.toLowerCase());
		System.out.println(politeGreeting);
		
		//charAt and indexOf
		System.out.println("Index of J: " + alphabet.indexOf('J'));
		System.out.println("Index of \"brown\" : " + sentenceWithEveryLetter.indexOf("brown"));
		System.out.println("Index of \"JR\": " + alphabet.indexOf("JR"));
		System.out.println("Character at position 2: " + alphabet.charAt(2));
		
		//substrings
		int startIndex = 4, endIndex = startIndex + 5;
		System.out.println("senteceWithEveryLetter starting at index 31: " +
							sentenceWithEveryLetter.substring(31));
		System.out.println("senteceWithEveryLetter with indices 8 to 12: " + 
							sentenceWithEveryLetter.substring(8, 13));
		
		String substring = sentenceWithEveryLetter.substring(startIndex, endIndex);
		System.out.println(substring);
		
		//random entities
		Random random = new Random();
		System.out.println("Random Boolean: " + random.nextBoolean());
		System.out.println("Random Double: " + random.nextDouble() + 1);
		System.out.println("Generating a random int between 7 and 14 :" + 
							(random.nextInt(8) + 7));
		
		int random1 = random.nextInt(10);
		int random2 = random.nextInt(10);
		
		System.out.println("Random Digits are:" + random1 + random2);
		System.out.println("Random Digits added are:" + (random1 + random2));
		
	}
}
