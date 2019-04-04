public class GradStudent extends CollegeStudent {

	public GradStudent(String name, int age, String gender, double gpa, String IDNum, String major, int year) {
		super(name, age, gender, gpa, IDNum, major, year);
	}
	
	@Override
	public String distinction() {
		String diploma = "";
		if (getGpa() >= 3.7 && getGpa() <= 3.9)
			diploma += "cum laude";
		if (getGpa() > 3.9) 
			diploma += "magna cum laude";
		return diploma;	
	}
	
}
