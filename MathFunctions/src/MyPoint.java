public class MyPoint {

	private double xCoord, yCoord;

	public MyPoint(double x, double y) {
		xCoord = x;
		yCoord = y;
	}

	public double getSlope(MyPoint one) {
		double top = this.getyCoord() - one.getyCoord();
		double bottom = this.getxCoord() - one.getxCoord();
		return top / bottom;
	}

	public LinearEQ getEQ(MyPoint two) {

		return new LinearEQ(-1 * getSlope(two), 1, -1 * getSlope(two) * getxCoord() + getyCoord());

	}

	public static void main(String[] args) {
		MyPoint one = new MyPoint(-1, 3);
		System.out.println(one);
		MyPoint two = new MyPoint(7, 10);
		System.out.println(two);
		System.out.println(one.getEQ(two));
	}

	@Override
	public String toString() {
		return "(" + xCoord + ", " + yCoord + ")";
	}

	public static MyPoint midpoint(MyPoint other, MyPoint other2) {
		double x = (other.getxCoord() + other2.getxCoord()) / 2;
		double y = (other.getyCoord() + other2.getyCoord()) / 2;
		MyPoint aMyPoint = new MyPoint(x, y);
		return aMyPoint;
	}

	public MyPoint midpointns(MyPoint other, MyPoint other2) {
		double x = (other.getxCoord() + other2.getxCoord()) / 2;
		double y = (other.getyCoord() + other2.getyCoord()) / 2;
		MyPoint aMyPoint = new MyPoint(x, y);
		return aMyPoint;
	}
	
	public double getxCoord() {
		return xCoord;
	}

	public void setxCoord(double xCoord) {
		this.xCoord = xCoord;
	}

	public double getyCoord() {
		return yCoord;
	}

	public void setyCoord(double yCoord) {
		this.yCoord = yCoord;
	}

}
