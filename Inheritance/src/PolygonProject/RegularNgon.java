package PolygonProject;

public class RegularNgon extends Polygon {
	private int s=0, n=0;
	
	public RegularNgon(int s, int n) {
		this.s = s;
		this.n = n;
	}
	
	@Override
	public double getPerimeter() {
		return s*n;
	}
	
	@Override
	public double getArea() {
		return (s*s*n) / (4*Math.tan(Math.PI/n));
	}
	
	@Override
	public String toString() {
		return "A regular " + getN() + "-gon with side length " + getS();
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {

		RegularNgon one = new RegularNgon(3, 4);
		System.out.println("Rectangles have " + one.getN() + " sides");
		System.out.println(one);
	}
}
