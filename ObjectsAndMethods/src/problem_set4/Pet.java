package problem_set4;

public class Pet {

    private String name, type;
    private int age;

    Pet(String name, String type, int age) {
    	this.age = age;
    	this.name = name;
    	this.type = type;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
    	return "name: " + name + 
    			"\nage: " + age + 
    			"\ntype of pet: " + type;
    }
}
