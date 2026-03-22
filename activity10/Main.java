package activity10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> shapes = new ArrayList<>();

        // circles
        Circle c1 = new Circle(5.0, "red", true);
        Circle c2 = new Circle(3.5, "blue", false);

        // rectangles
        Rectangle r1 = new Rectangle(4.0, 6.0, "green", true);
        Rectangle r2 = new Rectangle(2.5, 2.5, "yellow", false);

        
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);

        
        for (GeometricObject shape : shapes) {
            System.out.println(shape.toString());
            System.out.printf("Area: %.2f, Perimeter: %.2f\n\n",
                              shape.getArea(), shape.getPerimeter());
        }

       
        Circle c3 = new Circle(5.0, "black", false);
        System.out.println("c1 equals c3? " + c1.equals(c3));

        Rectangle r3 = new Rectangle(4.0, 6.0, "purple", true);
        System.out.println("r1 equals r3? " + r1.equals(r3));
    }
}
