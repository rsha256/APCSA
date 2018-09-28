package employee;

public class EmployeeTester {
	public static void main(String[] args) {	
		Employee a = new Employee(); // calls Default Constructor
		a.changeName("Scarpitta"); // changes Employee Name
		a.changeSalary(45000); // changes Employee Salary
		a.calcRaise(3); // increases employee salary by an int percentage, in this case 3%
		System.out.println(a); // prints object data via toString() method.
		Employee b = new Employee("Miller", 55000); // calls overloaded constructor
		b.changeSalary(58000);
		System.out.println(b);
	}
}