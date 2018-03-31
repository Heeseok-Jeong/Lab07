package edu.handong.csee.java.lab07;
import java.util.Scanner; // call a package to use scanner

/**
 * This program converts year to century and print it.
 * @author JHS
 */
public class YearToCentury { //the class name is 'YearToCentury'
	int year; //declare instance variable
	
	/**
	 * main method does a practical running.
	 */
	public static void main(String[] args) { //make a main method
		int yr = 0; //initialize local variable
		Scanner keyboard = new Scanner(System.in); //instantiate keyboard
		
		System.out.println("Input year : "); //print some message
		yr = keyboard.nextInt(); //yr's value gets from user
		YearToCentury yearToCen = new YearToCentury(yr); //instantiate yearToCen with parameter
		
		System.out.println(yr + " is " + yearToCen.calc_century() + "th century."); //print the result of converting year to century 
	}
	
	/**
	 * this constructor sets instance variable's value by parameter's value
	 */
	public YearToCentury(int year) { //constructor setting
		this.year = year; //instance variable's value is parameter's value
	}
	
	/**
	 * this method calculates century
	 */
	public int calc_century() { //the method name is 'calc_century'
		if(year % 100 == 0) //if year is 'xx00'
			year /= 100; //year value is 'xx'
		else { //or not
			year = (year / 100) + 1; //year value is 'xx' + 1
		}
		return year; //return the modified year value
	}
}
