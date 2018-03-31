package edu.handong.csee.java.lab07;
import java.util.Random; //call a package to use random

/**
 * This program checks four students's absence which is randomly settled
 * and shows whether fail or not for a class.
 * @author JHS
 */
public class Attendance { //the class name is Attendance
	private String name;
	private int grade;
	private int studentId;
	private int absence;
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		
		Random randomGen = new Random(); //instantiate randomGen
	}
	
	/**
	 * constructor
	 */
	public Attendance(String name, int grade, int studentId, int absence) {
		this.name = name;
		this.grade = grade;
		this.studentId = studentId;
		this.absence = absence;
	}
	
	//setters
	/**
	 * this method sets instance variable name's value by parameter's value
	 */
	public void setName(String name) { //method name is setName
		this.name = name; //instance variable name's value is parameter name's value
	}
	
	/**
	 * this method sets instance variable grade's value by parameter's value
	 */
	public void setGrade(int grade) { //method name is setGrade
		this.grade = grade; //instance variable grade's value is parameter grade's value
	}
	
	/**
	 * this method sets instance variable studentId's value by parameter's value
	 */
	public void setStudentId(int studentId) { //method name is setStudentId
		this.studentId = studentId; //instance variable studentId's value is parameter studentId's value
	}
	
	/**
	 * this method sets instance variable absence's value by parameter's value
	 */
	public void setAbsence(int absence) { //method name is setAbsence
		this.absence = absence; //instance variable absence's value is parameter absence's value
	}
}
