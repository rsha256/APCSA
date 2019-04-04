public class Student extends Person {

	private double gpa;
	private String IDNum;
	
	public Student() {}
	
	public Student(String name, int age, String gender, double gpa, String IDNum) {
		super(name, age, gender); // use superclass constructor

		setGpa(gpa);
		setIDNum(IDNum);
	
	}

	@Override
	public String toString() {
		return super.toString() + ". GPA: " + getGpa() + ", ID: " + getIDNum();
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getIDNum() {
		return IDNum;
	}

	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	
	public String distinction() {
		return "Rahu is da best";
	}
	
}
