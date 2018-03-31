package edu.handong.csee.java.lab07;

/**
 * This program gets three chicken's menu names, prices and stars. Next prints all them. 
 * @author JHS
 */
public class Chicken { //the class name is 'Chicken'
	private String name; //declare string type instance variable using a private keyword
	private int price; //declare instance variable using a private keyword
	private int stars; //declare instance variable using a private keyword
	
	/**
	 * main method does a practical running.
	 */
	public static void main(String[] args) { //make a main method
		Chicken menu1 = new Chicken("Chili_Sauce", 18000, 4); //instantiate menu1 with parameter menu1's name, price, stars
		Chicken menu2 = new Chicken("Garlic_Sauce", 18500, 5); //instantiate menu2 with parameter menu2's name, price, stars
		Chicken menu3 = new Chicken("Hot_Fired", 17000, 4); //instantiate menu3 with parameter menu3's name, price, stars
		
		menu1.set_stars(3); //change menu1's stars value
		menu2.set_stars(4); //change menu2's stars value
		menu3.set_stars(5); //change menu3's stars value
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); //print menu1's name and stars
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars()); //print menu2's name and stars
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars()); //print menu3's name and stars


	}
	
	/**
	 * this constructor sets name, price, and stars value by parameters
	 */
	public Chicken(String name, int price, int stars) { //constructor setting
		this.name = name; //instance variable's value is parameter's value
		this.price = price; //instance variable's value is parameter's value
		this.stars = stars; //instance variable's value is parameter's value
	}
	
	/**
	 * this method returns a instance variable 'name'
	 */
	public String get_name() { //the method's name is 'get_name'
		return this.name; //returns a instance variable name's value
	}
	
	/**
	 * this method returns a instance variable 'price'
	 */
	public int get_price() { //the method's name is 'get_price'
		return this.price; //returns a instance variable price's value
	}
	
	/**
	 * this method returns a instance variable 'stars'
	 */
	public int get_stars() { //the method's name is 'get_stars'
		return this.stars; //returns a instance variable stars's value
	}
	
	/**
	 * this method sets instance variable name's value by parameter 
	 */
	public void set_name(String name) { //the method's name is 'set_name'
		this.name = name; //instance variable's value converts to parameter's value
	}
	
	/**
	 * this method sets instance variable price's value by parameter 
	 */
	public void set_price(int price) { //the method's name is 'set_price'
		this.price = price; //instance variable's value converts to parameter's value
	}
	
	/**
	 * this method sets instance variable stars's value by parameter 
	 */
	public void set_stars(int stars) { //the method's name is 'set_stars'
		this.stars = stars; //instance variable's value converts to parameter's value
	}
		
}
