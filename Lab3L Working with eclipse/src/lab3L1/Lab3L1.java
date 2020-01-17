/*Sloke Shrestha
 * COSC 1337 002
 * 1/16/2020
 * Purpose: To test SimpleDate (Lab3L1)
 * */
package lab3L1;

public class Lab3L1 {

	public static void main(String[] args) {
		// Create Dates
		
		SimpleDate teddyBearDebut 			 = new SimpleDate(2, 42, 1903);
		SimpleDate pocahontasMarried 		 = new SimpleDate(12, 5, 1614);
		SimpleDate yosemiteNamedNationalPark = new SimpleDate(6,10,1452);
		SimpleDate warof1812starts 			 = new SimpleDate(12,12,1212);
		SimpleDate daveWinsAtTicTacToe 		 = new SimpleDate(1,15,2020);
		SimpleDate defaultDate 				 = new SimpleDate();
		
		//Modifying Dates		
		teddyBearDebut.setDay(15);
		pocahontasMarried.setMonth(5);;
		yosemiteNamedNationalPark.setYear(1752);
		
		

		//Using Constructors.
		warof1812starts = new SimpleDate(6,17,1812);
		SimpleDate theForgottenWarStarts = warof1812starts; //pointing to the same object
		warof1812starts.setDay(18);//theForgottenWarStarts changes too.
		
		//Using Accessors
		
		System.out.println(defaultDate.getMonth() + "/" + defaultDate.getDay() + " of the year " + 
						   defaultDate.getYear());
		
		
	}

}
