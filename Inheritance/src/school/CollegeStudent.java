package school;

public class CollegeStudent extends Student {

	private String major;
	private int year;

	public CollegeStudent() {}
	
	public CollegeStudent(String name, int age, String gender, double gpa, String IDNum, String major, int year) {
		super(name, age, gender, gpa, IDNum); // use superclass constructor

		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tMajor: " + getMajor() + ", year: " + getYear();
	}

	public String distinction() {
		String diploma = "";
		if (getGpa() >= 3.5 && getGpa() <= 3.8)
			diploma += "cum laude";
		if (getGpa() > 3.8) 
			diploma += "magna cum laude";
		return diploma;	
	}

}
