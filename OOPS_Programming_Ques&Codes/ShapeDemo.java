abstract class Shape {
    abstract void draw();
    abstract void erase();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        circle.draw();
        circle.erase();
        triangle.draw();
        triangle.erase();
        square.draw();
        square.erase();
    }
}
