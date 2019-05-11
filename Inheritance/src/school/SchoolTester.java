package school;

public class SchoolTester {
	public static void main(String[] args) {
		Person bob = new Person("Coach Bob", 48, "M");
		System.out.println(bob);
		
		Student lynne = new Student("Lynne Brooke", 16, "F", 3.89, "WWP45");
		System.out.println(lynne);
		
		Teacher william = new Teacher("William Scarpitta", 100, "M", "APCSA", 95000); 
		System.out.println(william);

		CollegeStudent rahul = new CollegeStudent("rahul", 17, "M", 5.0, "WWP308065", "CS", 2024);
		System.out.println(rahul.getName() + "'s distinction: " + rahul.distinction());
		
		GradStudent emily = new GradStudent("Emily", 24, "F", 3.9, "MIT3.15", "Bio", 5);
		System.out.println(emily.getName() + "'s distinction: " + emily.distinction());

		Student l = lynne;
		Student i = rahul;
		Student e = emily;
		
		// ref = new obj
		
		System.out.println(l);		
		
		System.out.println(l.getName() + "'s distinction: " + l.distinction());
		
		System.out.println(i);	
		System.out.println(i.getName() + "'s distinction: " + i.distinction());
		
		System.out.println(e);
		System.out.println(e.getName() + "'s distinction: " + e.distinction());
		
		
	}
}
