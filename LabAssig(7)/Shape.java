public class Shape {
    public double calculateArea() {
        return 0;
    }
}

// Circle class that inherits from Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    // overrides the calculateArea()
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class that inherits from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // overrides the calculateArea()
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle class that inherits from Shape
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }
    
     // overrides the calculateArea()
    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
