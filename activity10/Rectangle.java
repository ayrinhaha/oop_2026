package activity10;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // constructors
    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // getters & setters
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // abstract methods
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // override object methods
    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height +
               ", color: " + getColor() + ", filled: " + isFilled();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle other = (Rectangle) obj;
        return Double.compare(width, other.width) == 0 &&
               Double.compare(height, other.height) == 0;
    }
}
