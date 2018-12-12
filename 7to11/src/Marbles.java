import java.util.Random;

public class Marbles {
	static double initialSize = 0;

	public static void main(String[] args) {
		initialSize = (int) (Math.random() * 91) + 10;
		Random xRandom = new Random();
		if (xRandom.nextInt(1) == 0)
			smartComputer();
		else
			stupidComputer();
	}

	static void smartComputer() {

	}

	static void stupidComputer() {
		double value = (int) (Math.random() * (initialSize / 2)) + 1;

	}

}
