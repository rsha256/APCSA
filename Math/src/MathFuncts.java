import java.awt.Color;
import java.text.DecimalFormat;

public class MathFuncts {

	/*
	 * static
	 */
	public static double average(int i, int j, int k) {
		return (double) (i + j + k) / 3;
	}

	public static int makeChange(double cents) {
		return (int) (cents / .25);
	}

	public static double roundToHths(double d) {
		return ((int) (d * 100.0 + 0.5) / 100.0);
	}

	public static int roundToHds(double d) {
		return (int) ((int) (d / 100.0 + .5) * 100.0);
	}

	// Returns a random color
	// Math.random returns a number between 0 and 1 (only 0 is inclusive)
	public static Color randColor() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r, g, b);
	}

	// This method will return the total value of a coin back - to 2 decimal places
	public static double total(int pennies, int nickels, int dimes, int quarters) {
		/*
		 * return Double.valueOf(new DecimalFormat("##.##") .format((quarters * 0.25) +
		 * (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01)));
		 */
		double tot = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
		return (int) (tot * 100) / 100.0;
	}

	// This method returns endpoints
	public static String midpoint(int x1, int x2, int y1, int y2) {
		return ("(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
	}
	
	public static void main(String[] args) {
		System.out.println("The average of 3, 4, and 12 is: " + average(3, 4, 12));
		System.out.println("10 cel is: " + convertTemp(10));
		System.out.println("Return: " + makeChange(.78) + " quarters");
		System.out.println(roundToHths(9.236));
		System.out.println(roundToHds(1297));
		System.out.println("Random color is: " + randColor());
		System.out.println("$" + total(4, 7, 5, 2));
		System.out.println(midpoint(2, 5, 7, 8));
		
		MyPoint one = new MyPoint(2, 3);
		System.out.println(one);
		MyPoint two = new MyPoint(7, 8);
		System.out.println(two);
		
		MyPoint three = MyPoint.midpoint(one, two);
		System.out.println(three);
		
		System.out.println(MyPoint.midpoint(one, three));
	}

	// this method converts an inputted Celsius temperature into F
	public static double convertTemp(int cel) {
		return (9.0 / 5.0) * (double) cel + 32.0;
	}

}
