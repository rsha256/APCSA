
public class MyPoint {

	private double xCoord, yCoord;
	public MyPoint(double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	
	public static void main(String[] args) {
		MyPoint one = new MyPoint(2, 3);
		System.out.println(one);
		MyPoint two = new MyPoint(7, 8);
		System.out.println(two);
	}

	@Override
	public String toString() {
		return "(" + xCoord + 
			   ", " + yCoord + ")";
	}
	
	public static MyPoint midpoint(MyPoint other, MyPoint other2) {
		double x = (other.getxCoord() + other2.getxCoord())/2;
		double y = (other.getyCoord() + other2.getyCoord())/2;
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
