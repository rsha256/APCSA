public class LoopingFunIntro {
	public static void main(String[] args) {
		LoopingFunIntro one = new LoopingFunIntro();
		one.asterisks(5, 20);
		System.out.println("It takes " + one.dieToHundred() + " rolls.");
		one.printFactors(20);
		System.out.println(lcm(24, 16));
	}

	public static int lcm(int x, int y) {
		for (int i = 0; i <= y; i++) {
			if ((x * i) % y == 0)
				return x * i;
		}
		return x * y;
	}

	public void printFactors(int i) {
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				System.out.println(j + " and " + i / j + " are factors of " + i);
			}
		}
	}

	// rolls to 100
	public int dieToHundred() {
		int count = 0;
		int total = 0;
		while (total < 100) {
			total += (int) (6 * Math.random() + 1);
			count++;
		}
		return count;
	}

	public void asterisks(int row, int col) {
		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
