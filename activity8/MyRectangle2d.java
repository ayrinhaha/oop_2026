package activity8;

public class MyRectangle2d {
    double x;
    double y;
    int width;
    int height;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public MyRectangle2d() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;

    }

    public MyRectangle2d(double x, double y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getArea(int area){
        area = height * width /*height */;
        return area;
    }

    public int getPerimeter(int perimeter){
        perimeter = 2 * (width + height); 
        return perimeter;
    } 

    public boolean contains(double x, double y){
        
        return true;
    }

    public boolean contains(MyRectangle2d r){
        return true;
    }

    public boolean overlaps (MyRectangle2d r){
        return true;
    }
    


}
