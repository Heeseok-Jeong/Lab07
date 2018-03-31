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
		Chicken menu1 = new Chicken("Chili_Sauce", 18000, 4);
		Chicken menu2 = new Chicken("Garlic_Sauce", 18500, 5);
		Chicken menu3 = new Chicken("Hot_Fired", 17000, 4);
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());


	}
	
	/**
	 * 
	 */
	public Chicken(String name, int price, int stars) {
		this.name = name;
		this.price = price;
		this.stars = stars;
	}
	
	/**
	 * 
	 */
	public String get_name() {
		return this.name;
	}
	
	/**
	 *
	 */
	public int get_price() {
		return this.price;
	}
	
	/**
	 * 
	 */
	public int get_stars() {
		return this.stars;
	}
	
	/**
	 * 
	 */
	public void set_name(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 */
	public void set_price(int price) {
		this.price = price;
	}
	
	/**
	 * 
	 */
	public void set_stars(int stars) {
		this.stars = stars;
	}
		
}
