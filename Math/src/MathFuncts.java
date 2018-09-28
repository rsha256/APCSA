public class MathFuncts {

	/*
	 * static 
	 */
	public static double average(int i, int j, int k) {
		return (double) (i + j + k) / 3;
	}

	public static int makeChange(double cents) {
		return (int)(cents / .25);
	}
	
	public static double roundToHths(double d) {
		double t100 = d * 100.0;
		int t1 = (int)(t100 + 0.5);
		return (t1/100.0);
	}
	
	public static int roundToHds(double d) {
		double t100 = d / 100.0;
		int t1 = (int)(t100 + .5);
		return (int)(t1 * 100.0);
	}
	
	public static void main(String[] args) {
		System.out.println("The average of 3, 4, and 12 is: " 
				+ average(3, 4, 12));
		System.out.println("10 cel is: " 
				+ convertTemp(10));
		System.out.println("Return: " + makeChange(.78) + " quarters");
		System.out.println(roundToHths(9.236));
		System.out.println(roundToHds(1297));
	}

	// this method converts an inputted Celsius temperature into F
	public static double convertTemp(int cel) {
		return (9.0 / 5.0) * (double) cel + 32.0;
	}

}
