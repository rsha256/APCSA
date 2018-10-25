public class HeronsTriangle {

	private int a, b, c;

	public HeronsTriangle() {
		a = 3;
		b = 4;
		c = 5;
	}

	public static void main(String[] args) {
		HeronsTriangle one = new HeronsTriangle();
		System.out.println(one.returnMax());
		System.out.println(one.computeArea());
		System.out.println(one.altLargestSide());
	}

	public int returnMax() {
		return Math.max(Math.max(a, b), c);
	}

	public double computeArea() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double altLargestSide() {
		return 2 * computeArea() / returnMax();
	}

}
