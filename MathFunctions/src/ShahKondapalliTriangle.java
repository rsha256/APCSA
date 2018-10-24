import java.awt.geom.Point2D;

public class ShahKondapalliTriangle {

	private Point2D.Double A, B, C;

	public ShahKondapalliTriangle(Point2D.Double A, Point2D.Double B, Point2D.Double C) {

		this.A = A;
		this.B = B;
		this.C = C;

	}
	
	public String getVertices() {
		
		return "\tPoint A: ("  + A.getX() + ", " + A.getY() + ")"  + 
				"\n\tPoint B: ("  + B.getX() + ", " + B.getY() + ")"  + 
				"\n\tPoint C: ("  + C.getX() + ", " + C.getY() + ")"  ;
		
	}

	public String getSideLength() {

		return "\tThe length of side AB is\t" + (getDist(A, B)) + " units\n\tThe length of side BC is\t"
				+ (getDist(C, B)) + " units\n\tThe length of side AC is\t" + (getDist(A, C));

	}

	public double getDist(Point2D.Double A, Point2D.Double B) {

		return Point2D.Double.distance(A.getX(), B.getX(), A.getY(), B.getY());

	}

	public String getAngleMeasures() {

		return "\tThe measure of angle A is\t"
				+ Math.acos((Math.pow(getDist(A, C), 2) + Math.pow(getDist(A, B), 2) - Math.pow(getDist(C, B), 2))
						/ (2 * getDist(A, C) * getDist(A, B)))
				+ " units\n\tThe measure of angle B is\t"
				+ Math.acos((-Math.pow(getDist(A, C), 2) + Math.pow(getDist(A, B), 2) + Math.pow(getDist(C, B), 2))
						/ (2 * getDist(A, C) * getDist(A, B)))
				+ " units\n\tThe measure of angle C is\t"
				+ Math.acos((Math.pow(getDist(A, C), 2) - Math.pow(getDist(A, B), 2) + Math.pow(getDist(C, B), 2))
						/ (2 * getDist(A, C) * getDist(A, B)));

	}

	public String getPerimeter() {

		return "\twith a perimeter of\t" + (getDist(C, B) + getDist(A, C) + getDist(A, B));

	}

	public String getArea() {

		double s = (getDist(C, B) + getDist(A, C) + getDist(A, B)) / 2;
		return "\tand an area of\t" + Math.sqrt(s * (s - getDist(C, B)) * (s - getDist(A, C)) * (s - getDist(A, B)));

	}

	public Point2D.Double getMidPoint(Point2D.Double one, Point2D.Double two) {

		return new Point2D.Double((one.getX() + two.getX()) / 2, (one.getY() + two.getY()) / 2);

	}

	public double getSlope(Point2D.Double one, Point2D.Double two) {

		return (one.getY() - two.getY()) / (one.getX() - two.getX());

	}

	public LinearEQ getEQ(Point2D.Double one, Point2D.Double two) {

		return new LinearEQ(-1 * getSlope(one, two), 1, -1 * getSlope(one, two) + one.getY());

	}

	public LinearEQ getEQSlope(Point2D.Double one, double slope) {
		return new LinearEQ(-slope, 1, -slope * one.getX() + one.getY());
	}

	public String getCircumcenter() {

		Point2D.Double mBC = getMidPoint(B, C);
		Point2D.Double mAC = getMidPoint(A, C);

		LinearEQ lineA = getEQSlope(mBC, -(1 / getSlope(B, C)));
		LinearEQ lineB = getEQSlope(mAC, -(1 / getSlope(A, C)));
		
		Point2D.Double circumcenter = new Point2D.Double(lineA.XCramers(lineB), lineA.YCramers(lineB));


		return "\tThe circumcenter lies at\t(" + circumcenter.getX() + ", " + circumcenter.getY() + ")";

	}

	public String getCentroid() {
		
		Point2D.Double centroid = new Point2D.Double((A.getX() + B.getX() + C.getX()) / 3, (A.getY() + B.getY() + C.getY()) / 3);

		return "\tThe centroid lies at\t(" + centroid.getX() + ", " + centroid.getY() + ")";


	}

	public String getOrthocenter() {

		double slopeAC = getSlope(A, C);
		double slopeBC = getSlope(B, C);

		LinearEQ altitudeA = getEQSlope(A, -1 / slopeBC);
		LinearEQ altitudeB = getEQSlope(B, -1 / slopeAC);
		
		Point2D.Double orthocenter = new Point2D.Double(altitudeA.XCramers(altitudeB), altitudeA.YCramers(altitudeB));

		return "\tThe orthocenter lies at\t(" + orthocenter.getX() + ", " + orthocenter.getY() + ")";

	}

	public String getProperties() {

		boolean isosceles = false, equilateral = false, scalene = false, right = false, acute = false, obtuse = false;

		
		
		double a = Math.acos((Math.pow(getDist(A, C), 2) + Math.pow(getDist(A, B), 2) - Math.pow(getDist(C, B), 2))
				/ (2 * getDist(A, C) * getDist(A, B)));
		
		double b = Math.acos((-Math.pow(getDist(A, C), 2) + Math.pow(getDist(A, B), 2) + Math.pow(getDist(C, B), 2))
				/ (2 * getDist(A, C) * getDist(A, B)));
		double c = Math.acos((Math.pow(getDist(A, C), 2) - Math.pow(getDist(A, B), 2) + Math.pow(getDist(C, B), 2))
				/ (2 * getDist(A, C) * getDist(A, B)));
		
		
		if (a == b || b == c || c == a) {

			isosceles = true;

		}

		if (a == b && b == c) {

			equilateral = true;

		}
		if(isosceles == false && equilateral == false) {
			
			scalene = true;
			
		}
		
		if(a == 90 || b == 90 || c == 90) {
			
			right = true;
			
		}
		
		if(a < 90 && b < 90 && c < 90) {
			
			acute = true;
			
		}
		if(a > 90 || b > 90 || c > 90) {
			
			obtuse = true;
			
		}
		
		
		return "\tTriangle is isosceles: " + isosceles + 
				"\n\tTriangle is equilateral: " + equilateral + 
				"\n\tTriangle is scalene: " + scalene + 
				"\n\tTriangle is right: " + right + 
				"\n\tTriangle is acute: " + acute + 
				"\n\tTriangle is obtuse: " + obtuse;

	}
	
	public String toString() {
		
		return "The triangle with vertices: " + "\n" + getVertices() + 
				"\nhas the following properties: \n\n" + getSideLength() + "\n\n"
				+ getAngleMeasures() + "\n\n" + getPerimeter() + "\n" + getArea() + "\n\n" +
				getCircumcenter() + "\n" +  getCentroid() + "\n" + getOrthocenter() + "\n\n\n" + 
				getProperties();
		
	}
	
	public static void main(String[] args) {
		
		Point2D.Double A = new Point2D.Double(3, 9), B = new Point2D.Double(8, 0),
						C = new Point2D.Double(5, 10);
		
		ShahKondapalliTriangle tri = new ShahKondapalliTriangle(A, B, C);
		
		System.out.println(tri);
		
	}
	
	

}
