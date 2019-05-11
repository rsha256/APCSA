package school;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		name = "";
		age = 0;
		gender = "";
	}
	
	public Person(String name, int age, String gender) {
		setName(name);
		setAge(age);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return getName() + " is a " + getGender() + " who is " + getAge() + " years old";
	}
	
}
