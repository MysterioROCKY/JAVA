public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(7.0); // Created object of circle class

        Rectangle rectangle = new Rectangle(5.0, 10.0);  // Created object of rectangle class

        Triangle triangle = new Triangle(3.0, 4.0, 5.0); // Created object of rectangle class

        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the Triangle: " + triangle.calculateArea());

    }
}
