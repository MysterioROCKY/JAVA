class Shape {
    public double getArea() {
        return 0.0; 
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width; 
    }
}

public class ShapeDemoR {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println("Area of a generic shape: " + genericShape.getArea()); 
        System.out.println("Area of a rectangle: " + rectangle.getArea()); 
    }
}
