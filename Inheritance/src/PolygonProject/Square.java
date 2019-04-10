package PolygonProject;

public class Square extends Rectangle {
	
	private int s = 0;
	
	public Square() {}
	
	public Square(int s) {
		super(s, s);
		this.s = s;
	}
	
	@Override
	public String toString() {
		return "A square with side length " + getS();
	}
	
	public int getS() {
		return s;
	}

	@Override
	public double getArea() {
		return s*s;
	}

	@Override
	public double getPerimeter() {
		return 4*s;
	}
	
	@Override
	public String getType() {
		return "S";
	}
	
	public static void main(String[] args) {
		Square one = new Square(2);
		System.out.println("Squares have 4 sides");
		System.out.println(one);
	}
	
}
