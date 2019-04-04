public class SchoolTester {
	public static void main(String[] args) {
		Person bob = new Person("Coach Bob", 48, "M");
		System.out.println(bob);
		
		Student lynne = new Student("Lynne Brooke", 16, "F", 3.89, "WWP45");
		System.out.println(lynne);
		
		Teacher william = new Teacher("William Scarpitta", 100, "M", "APCSA", 95000); 
		System.out.println(william);

	}
}
