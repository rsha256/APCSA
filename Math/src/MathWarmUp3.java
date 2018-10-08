public class MathWarmUp3 {

	public static double roundToPrecision(double x, double p) {
		return (int) (x / p + 0.5) * p;
	}

	public static double roundToTenthPlace(double x) {
		return (int) (x * 10 + 0.5) / 10.0;
	}

	public static int randomScore() {
		return (int) (Math.random() * 100) + 1;
	}

	public static void main(String[] args) {
		System.out.println(roundToPrecision(64583.524, .10));
		/*
		 * while (true) { System.out.println(randomScore());
		 * 
		 * }
		 */
	}

}
