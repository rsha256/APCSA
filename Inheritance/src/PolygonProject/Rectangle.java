package PolygonProject;

public class Rectangle extends Polygon {
	
	private int s1 = 0, s2 = 0;
	
	public Rectangle() {}

	public Rectangle(int s1, int s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public void doubleWidth() {
		setS1(getS1()*2);
	}
	
	@Override
	public double getArea() {
		return s1*s2;
	}

	@Override
	public double getPerimeter() {
		return 2*(s1+s2);
	}
	
	@Override
	public String toString() {
		return "A rectangle with side lengths " + getS1() + " and " + getS2();
	}
	
	@Override
	public String getType() {
		return "Rectangle";
	}
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle(3, 4);
		System.out.println("Rectangles have 4 sides");
		System.out.println(one);
	}
	
}
