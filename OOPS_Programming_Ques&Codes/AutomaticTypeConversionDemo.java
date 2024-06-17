class Parent {
    void displayInfo(Number num) {
        System.out.println("Parent: " + num);
    }
}

class Child extends Parent {
    // Correct overriding: The parameter type remains as Number.
    @Override
    void displayInfo(Number num) {
        System.out.println("Child: " + num);
    }
}

public class AutomaticTypeConversionDemo {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.displayInfo(42.0); // This will call the Child class's method.

        Child child = new Child();
        child.displayInfo(42); // This will also call the Child class's method.

        Parent anotherParent = new Parent();
        anotherParent.displayInfo(42.0); // This will call the Parent class's method.
    }
}
