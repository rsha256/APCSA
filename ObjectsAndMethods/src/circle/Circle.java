package circle;

public class Circle {

    private double radius;

    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    public void changeRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public String toString() {
        return "Circle\n  radius: " + radius +
                " units\n  area: " + getArea() +
                " square units\n  diameter: " + getDiameter()+
                " units\n  circumference: " + getCircumference() +
                " units";
    }
}
