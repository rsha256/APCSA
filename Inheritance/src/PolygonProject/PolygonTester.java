package PolygonProject;

public class PolygonTester {
	public static void main(String[] args) {
		// Polygon z = new Polygon(10, "Decagon");
		// Polygon zz;

		RightTriangle a = new RightTriangle(3, 4);
		System.out.println(a);

		// Polygon bubble = new Rectangle(2,2);
		// System.out.println(bubble.toString());
		// bubble.doubleWidth();

		Rectangle b = new Rectangle(1, 1);
		System.out.println(b.toString());
		b.doubleWidth();

		Square c = new Square(5);
		System.out.println(c);

		// 5 sided regular polygon
		RegularNgon d = new RegularNgon(5, 8);
		System.out.println(d);
		//
		Polygon[] shapes = new Polygon[4];
		shapes[0] = a;
		shapes[1] = b;
		shapes[2] = c;
		shapes[3] = d;
		//
		double tot = 0;
		//
		// System.out.println(b.getArea());
		for (Polygon x : shapes) {
			System.out.println("TYPE: " + x.getType() + " AREA: " + x.getArea());
			tot += x.getArea();
		}
		System.out.println("Total Area: " + tot);
	}
}
/*
 * OUTPUT POLYGON: Triangle SIDES: 3 PERIMETER: 12.0 AREA: 6.0 BASE: 3.0 HEIGHT:
 * 4.0
 * 
 * POLYGON: Rectangle SIDES: 4 PERIMETER: 4.0 AREA: 1.0 LENGTH: 1.0 WIDTH: 1.0
 * 
 * POLYGON: Square SIDES: 4 PERIMETER: 20.0 AREA: 25.0 LENGTH: 5.0 WIDTH: 5.0
 * 
 * POLYGON: Regular 5-Gon SIDES: 5 PERIMETER: 40.0 AREA: 110.11055363769388
 * LENGTH: 8.0 TYPE: Triangle AREA: 6.0 TYPE: Rectangle AREA: 1.0 TYPE: Square
 * AREA: 25.0 TYPE: Regular 5-Gon AREA: 110.11055363769388 Total Area:
 * 142.1105536376939
 */
