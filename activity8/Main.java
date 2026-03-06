package activity8;

public class Main {
    public static void main(String[] args) {
        
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
        MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4);

        System.out.printf("Area of r1: %.2f\n", r1.getArea());
        System.out.printf("Perimeter of r1: %.2f\n", r1.getPerimeter());

        System.out.println("r1 contains (3,3): " + r1.contains(3, 3));
        System.out.println("r1 contains r2: " + r1.contains(r2));
        System.out.println("r1 overlaps r3: " + r1.overlaps(r3));
    }
}