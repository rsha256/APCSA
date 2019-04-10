package PolygonProject;

import java.util.ArrayList;
import java.util.List;

public class ShapeTester {
	private List<Polygon> Shapes;

	public ShapeTester() {
		Shapes = new ArrayList<Polygon>();
	}

	public void add(Polygon poly) {
		Shapes.add(poly);
	}

	public void printOut() {

		double tot = 0; // accumulates total area of polygons
		for (Polygon x : Shapes) // prints out all polygons
		{
			 System.out.println("TYPE: " + x.getType() + "\t AREA: " +
			 x.getArea() + "\t PERIMETER: " + x.getPerimeter());
//			System.out.println(x);
			tot += x.getArea();
		}
		System.out.println("\nTotal Area: " + tot);
	}

	public static void main(String[] args) {

		ShapeTester one = new ShapeTester();
		Polygon a = new Rectangle(2, 10);
		one.add(a);
		Polygon b = new Square(5);
		one.add(b);
		Polygon c = new RightTriangle(3, 4);
		one.add(c);
		Polygon d = new RegularNgon(5, 8);
		one.add(d);
		one.printOut();

	}

}
