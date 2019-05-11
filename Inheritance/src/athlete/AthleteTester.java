package athlete;

public class AthleteTester {
	public static void main(String[] args) {
		System.out.println("Name \t\t" + "Sport \t\t" + "Training Hours");
		Athlete one = new Athlete("Bob", "Janek", "Running");
		one.train(10);
		System.out.println(one);
		System.out.println("Name \t\t" + "Sport \t\t" + "Training Hours");
		Athlete two = new Runner("Ted", "Collins", "Running");
		((Runner)two).train(5);
		((Runner)two).race(12);
		((Runner)two).race(5);
		System.out.println(two);
		System.out.println("Name \t\t" + "Sport \t\t" + "Training Hours");
		Runner three = new Marathoner("Edith", "Quinby", "Running");
		three.train(15);
		three.race(26);
		three.race(20);
		three.race(2);
		three.race(8);
		System.out.println(three);
	}
}