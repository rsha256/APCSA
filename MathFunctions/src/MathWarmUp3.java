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

	private static int returnRandBinary() {

		int num = 0;

		for (int c = 0; c < 8; c++) {

			num += (int) (Math.random() * 2) * Math.pow(10, c);

		}
		return num;
	}

	public static int noFiveOrSix() {

		int num = (int) (Math.random() * 101) + 100;

		return num;

	}

	public static int $200to800() {
		return (int) (Math.random() * 601) + 200;
	}

	public static void main(String[] args) {
		System.out.println(roundToPrecision(64583.524, .10));

		while (true) {
			System.out.println($200to800());
			// System.out.println(randomScore());
			System.out.println(returnRandBinary());

		}

	}

}
