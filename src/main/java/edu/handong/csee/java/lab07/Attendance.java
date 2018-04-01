package edu.handong.csee.java.lab07;
import java.util.Random; //call a package to use random

/**
 * This program checks four students's absence which is randomly settled
 * and shows whether fail or not for a class.
 * @author JHS
 */
public class Attendance { //the class name is Attendance
	private String name; //declare string type instance variable using a private keyword
	private int grade; //declare int type instance variable using a private keyword
	private String studentId; //declare int type instance variable using a private keyword
	private int absence; //declare int type instance variable using a private keyword
	
	/**
	 * set and get four students informations and absence. 
	 * And then print their result of absence which is randomly settled
	 */
	public static void main(String[] args) { //make a main method
		Attendance student1 = new Attendance("Methew", 2, "21700481", 0); //instantiate student1 and set by parameters
		Attendance student2 = new Attendance("Luke", 1, "21800914", 0); //instantiate student2 and set by parameters
		Attendance student3 = new Attendance("Mark", 2, "21500171", 0); //instantiate student3 and set by parameters
		Attendance student4 = new Attendance("John", 2, "21600078", 0); //instantiate student4 and set by parameters
		
		student1.setName("Matthew"); //change student1's name value
		student3.setGrade(4); //change student3's grade value
		student4.setGrade(3); //change student4's grade value
		
		Random randomGen = new Random(); //instantiate randomGen
		
		student1.setAbsence(randomGen.nextInt(10)); //set student1's absence value randomly
		student2.setAbsence(randomGen.nextInt(10)); //set student2's absence value randomly
		student3.setAbsence(randomGen.nextInt(10)); //set student3's absence value randomly
		student4.setAbsence(randomGen.nextInt(10)); //set student4's absence value randomly
		
		if(student1.getAbsence() > 6) { //if student1's absence are over than 6
			System.out.println("I'm sorry, " + student1.getName() + ". You failed this course."); //print fail notice message 
			System.out.println("Total Absence : " + student1.getAbsence()); //print how many time absences		
		}
		else { //or not
			System.out.println("Your name " + student1.getName() + ", grade " + student1.getGrade() + ", StudentId " + student1.getStudentId()); //print about, name, grade and student id
			System.out.println("You're still not fail, Total Absence : " + student1.getAbsence()); //print about not fail and absence
		}
		System.out.println(""); //add line
		
		if(student2.getAbsence() > 6) { //if student2's absence are over than 6
			System.out.println("I'm sorry, " + student2.getName() + ". You failed this course."); //print fail notice message 
			System.out.println("Total Absence : " + student2.getAbsence()); //print how many time absences		
		}
		else { //or not
			System.out.println("Your name " + student2.getName() + ", grade " + student2.getGrade() + ", StudentId " + student2.getStudentId()); //print about, name, grade and student id
			System.out.println("You're still not fail, Total Absence : " + student2.getAbsence()); //print about not fail and absence
		}
		System.out.println(""); //add line
		
		if(student3.getAbsence() > 6) { //if student1's absence are over than 6
			System.out.println("I'm sorry, " + student3.getName() + ". You failed this course."); //print fail notice message 
			System.out.println("Total Absence : " + student3.getAbsence()); //print how many time absences		
		}
		else { //or not
			System.out.println("Your name " + student3.getName() + ", grade " + student3.getGrade() + ", StudentId " + student3.getStudentId()); //print about, name, grade and student id
			System.out.println("You're still not fail, Total Absence : " + student3.getAbsence()); //print about not fail and absence
		}
		System.out.println(""); //add line
		
		if(student4.getAbsence() > 6) { //if student1's absence are over than 6
			System.out.println("I'm sorry, " + student4.getName() + ". You failed this course."); //print fail notice message 
			System.out.println("Total Absence : " + student4.getAbsence()); //print how many time absences		
		}
		else { //or not
			System.out.println("Your name " + student4.getName() + ", grade " + student4.getGrade() + ", StudentId " + student4.getStudentId()); //print about, name, grade and student id
			System.out.println("You're still not fail, Total Absence : " + student4.getAbsence()); //print about not fail and absence
		}
		System.out.println(""); //add line
	}
	
	/**
	 * this constructor sets instance variable's value by parameter's value
	 */
	public Attendance(String name, int grade, String studentId, int absence) {
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
	public void setStudentId(String studentId) { //method name is setStudentId
		this.studentId = studentId; //instance variable studentId's value is parameter studentId's value
	}
	
	/**
	 * this method sets instance variable absence's value by parameter's value
	 */
	public void setAbsence(int absence) { //method name is setAbsence
		this.absence = absence; //instance variable absence's value is parameter absence's value
	}
	
	//getters
	/**
	 * this method returns instance variable name's value
	 */
	public String getName() { //the class name is getName
		return this.name; //return instance variable name's value
	}
	
	/**
	 * this method returns instance variable grade's value
	 */
	public int getGrade() { //the class name is getGrade
		return this.grade; //return instance variable grade's value
	}
	
	/**
	 * this method returns instance variable studentId's value
	 */
	public String getStudentId() { //the class name is getStudentId
		return this.studentId; //return instance variable studentId's value
	}
	
	/**
	 * this method returns instance variable name's value
	 */
	public int getAbsence() { //the class name is getAbsence
		return this.absence; //return instance variable absence's value
	}
}
