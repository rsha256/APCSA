package inheritance;

public class Student {
	
	// data members
	public final static int NUM_TESTS = 3;
	private String name;
	private int[] tests;
	private String grade;
	
	// constructor 
	public Student() {
		name = "";
		tests = new int[NUM_TESTS];
		grade = "";
	}
	
	// constructor with parameters
	public Student(String name, int[] tests, String  grade) {
		this.name = name;
		this.tests = tests;
		this.grade = grade;
	}
	
	// accessors
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public double getTestAverage() {
		double sum = 0;
		for (int score : tests) 
			sum += score;
		return sum/NUM_TESTS;
	}
	
	public void computeGrade() {
		if (name.equals(""))
			grade = "No grade";
		else if (getTestAverage() >= 65) 
			grade = "Pass";
		else 
			grade = "Fail";
	}
	
	// mutators
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
