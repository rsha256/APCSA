package PolygonProject;

public class RightTriangle extends Polygon {
	
	private int s1 = 0, s2 = 0;
	
	public RightTriangle() {}
	
	public RightTriangle(int s1, int s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public String toString() {
		return "A right triangle with legs " + getS1() + ", " + getS2() + ", and hypotenuse " + Math.sqrt(s1*s1+s2*s2);
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

	@Override
	public double getArea() {
		return 0.5 * s1 * s2;
	}

	@Override
	public double getPerimeter() {
		return s1+s2+Math.sqrt(s1*s1+s2*s2);
	}
	
	@Override
	public String getType() {
		return "Right Triangle";
	}
	
	public static void main(String[] args) {
		RightTriangle one = new RightTriangle(3, 4);
		System.out.println("Right triangles have 3 sides");
		System.out.println(one);
	}
	
}
