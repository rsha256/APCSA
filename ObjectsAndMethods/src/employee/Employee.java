package employee;

public class Employee {
	private String name;
	private double salary;

	public Employee() {
		name = "";
	}

	public Employee(String myName, double mySal) {
		name = myName;
		salary = mySal;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + 
			   "\nSalary: " + salary + "\n";
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
	public void changeSalary(double newSal) {
		this.salary = newSal;
	}
	public void calcRaise(int byPercent) {
		double increase = salary * (byPercent/100.0);
		salary += increase;
	}
	
}
