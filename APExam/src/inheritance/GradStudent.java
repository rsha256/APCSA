package inheritance;

public class GradStudent extends Student {

	private int gradID;
	
	public GradStudent() {
		super();
		gradID = 0;
	}
	
	// parameterized constructor
	public GradStudent(String name, int[] tests, String  grade, int gradID) {
		super(name, tests, grade); 
		this.gradID = gradID;
	}
	
	public int getID() {
		return gradID;
	}
	
	@Override
	public void computeGrade() {
		super.computeGrade();
		if (getTestAverage() >= 90) 
			setGrade("Pass with distinction");
	}
	
}
