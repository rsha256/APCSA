package inheritance;

public class Undergrad extends Student {
	
	// default constructor
	public Undergrad() { super(); }
	
	// parameterized constructor
	public Undergrad(String name, int[] tests, String  grade) {
		super(name, tests, grade); 
	}
	
	@Override
	public void computeGrade() {
		if (getTestAverage() >= 70)
			setGrade("Pass");
		else
			setGrade("Fail");
	}
	
}
