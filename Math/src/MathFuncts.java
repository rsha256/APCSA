public class MathFuncts {

	public static double average(int i, int j, int k) {
		return (double) (i + j + k) / 3;
	}

	public static void main(String[] args) {
		System.out.println("The average of 3, 4, and 12 is: " + average(3, 4, 12));
		System.out.println("10 cel is: " + convertTemp(10));

	}

	// this method converts an inputted Celsius temperature into F
	public static double convertTemp(int cel) {
		return (9.0 / 5.0) * (double) cel + 32.0;
	}

}
