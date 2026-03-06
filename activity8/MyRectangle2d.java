package activity8;

public class MyRectangle2D {
    
    // data fields 
    private double x;
    private double y;
    private double width;
    private double height;

    // getter & setter for x
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    // getter & setter for y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // getter & setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // getter & setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // no arg constructor
    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    // constructor
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return (x >= this.x - width / 2 && x <= this.x + width / 2 &&
                y >= this.y - height / 2 && y <= this.y + height / 2);
    }

    public boolean contains(MyRectangle2D r) {
        return contains(r.x - r.width / 2, r.y - r.height / 2) &&
                contains(r.x + r.width / 2, r.y - r.height / 2) &&
                contains(r.x - r.width / 2, r.y + r.height / 2) &&
                contains(r.x + r.width / 2, r.y + r.height / 2);
    }

    public boolean overlaps(MyRectangle2D r) {

        // edges of the first rectangle
        double left1 = this.x - this.width / 2;
        double right1 = this.x + this.width / 2;
        double top1 = this.y + this.height / 2;
        double bottom1 = this.y - this.height / 2;

        // edges of the second rectangle
        double left2 = r.x - r.width / 2;
        double right2 = r.x + r.width / 2;
        double top2 = r.y + r.height / 2;
        double bottom2 = r.y - r.height / 2;

        // they don't overlap
        if (right1 < left2 || right2 < left1 || top1 < bottom2 || top2 < bottom1) {
            return false;
        }

        // overlap
        return true;
    }
}