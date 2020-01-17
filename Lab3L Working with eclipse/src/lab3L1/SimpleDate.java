/*  * David Alger
 * COSC 1337 ???
 * ?/?/????
 * Purpose: This class encapsulates a date. DO NOT MODIFY THIS CLASS (Lab3L1)
 */
package lab3L1; //makes sure the package is okay.

public class SimpleDate {
	//fields
	private int month;
	private int day;
	private int year;
	
	//constructors
	public SimpleDate() { //no return type
		this(1,1,2000);	 //call the other constructor.
	}
	public SimpleDate(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	//accessors and mutators
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//toString
	@Override
	public String toString() {
		return getMonth()+"/"+getDay()+"/"+getYear();
	}
}
