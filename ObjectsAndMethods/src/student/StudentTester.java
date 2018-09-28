package student;

public class StudentTester {
    public static void main(String[] args) {
		Student one = new Student();
		Student two = new Student("Henri", "A01204");

		one.setName("Taylor");
		one.addCredits(5);
		System.out.println(one);
		System.out.println(two);
		System.out.println(one.getName());
		System.out.println(one.getId());
		System.out.println(one.getCredits());
    }
}
