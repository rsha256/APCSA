import java.text.DecimalFormat;

public class LinearEQ {

	public double xcoeff, ycoeff, constant;

	// default constructor (write signature line and implement)

	// overloaded constructor takes an x-coordinate, y-coordinate, and constant
	// (write signature line and implement)

	// method to round numbers to two decimals
	// IGNORE THIS FOR NOW - I'LL SHOW YOU A NEAT WAY TO DO THIS LATER

	public LinearEQ(double a, double b, double c) {

		xcoeff = a;
		ycoeff = b;
		constant = c;

	}

	// returns the x-value of the intersection of two lines
	// using the determinants methods done in class
	public double XCramers(LinearEQ b) {

		return (constant * b.ycoeff - b.constant * ycoeff) / ((xcoeff * b.ycoeff - b.xcoeff * ycoeff));

	}

	// returns the y-value of the system's intersection
	// using the determinants methods done in class
	public double YCramers(LinearEQ b) {

		return (constant * b.xcoeff - b.constant * xcoeff) / ((ycoeff * b.xcoeff - b.ycoeff * xcoeff));

	}

	// Prints out a LinearEQ object
	@Override
	public String toString() {

		if (xcoeff == 0)
			return ycoeff + "y = " + constant;

		if (ycoeff > 0)
			return xcoeff + "x + " + ycoeff + "y = " + constant;

		if (ycoeff < 0)
			return xcoeff + "x - " + Math.abs(ycoeff) + "y = " + constant;

		return xcoeff + "x = " + constant;

	}

	public static void main(String[] args) {

		LinearEQ one = new LinearEQ(2, -3, -2);
		LinearEQ two = new LinearEQ(4, 1, 24);

		System.out.println(one);
		System.out.println(two);
		System.out.println("(" + one.XCramers(two) + ", " + one.YCramers(two) + ")");

		
	}

	// method to round numbers to two decimals
	public double roundToTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}

}