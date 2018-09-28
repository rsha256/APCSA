package problem_set4;

import java.util.Scanner;

public class PetRunner {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please enter a name: ");
    	String name = input.nextLine();
    	System.out.println("Please enter the type of pet you have: ");
    	String type = input.nextLine();
    	System.out.println("Please enter an age: ");
    	int age = input.nextInt();
    	
    	Pet myPet = new Pet(name, type, age);
    	
    	System.out.println(myPet);
    	
    }
}
