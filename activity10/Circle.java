package activity10;

public class Circle extends GeometricObject {
    private double radius;

    // constructors
    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // getters & setters
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    //  abstract methods
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

   // override object methods
    @Override
    public String toString() {
        return "Circle with radius " + radius + ", color: " + getColor() + 
               ", filled: " + isFilled();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle other = (Circle) obj;
        return Double.compare(radius, other.radius) == 0;
    }
}