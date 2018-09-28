package student;

/**
 * The student.Student class represents a student in a student administration system.
 */
public class Student {
    private String name; // the student&#39;s name. First and Last separated by a space
    private String id; // the student ID
    private int credits; // the amount of credits for study taken so far

    //* 1. Create a new student default values.
    public Student() {
    	name = "";
    	id = "";
    	credits = 0;
    }

    //* 2. Create a new student with a given name and ID number.
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public Student(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    //*3. Return the name of this student.
    public String getName() {
        return name;
    }

    //* 4. Set a new name for this student.
    public void setName(String name) {
        this.name = name;
    }

    //* 5. Return the student ID of this student.
    public String getId() {
        return id;
    }

    //*6. Add some credit points to the student&#39;s accumulated credits.
    public void addCredits(int credits) {
        this.credits += credits;
    }

    //*7. Return the number of credit points this student has accumulated.
    public int getCredits() {
        return credits;
    }

    //*8. Write the toString method
    @Override
    public String toString() {
        return getName() + " has " + getCredits() + " credits. " + getName() + "'s student ID is: " + getId();
    }

}
