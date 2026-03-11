package practice.week9;

public abstract class GeometricObject {
    
        
   
    private String color = "blue";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;

    }
}

