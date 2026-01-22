package practice.week2;

public class Circle {
    double radius;
    static final double PI = 3.1416;

    //default constructor
    public Circle() {
        
    }

    //constructor that accepts property
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
        
    } 
}
