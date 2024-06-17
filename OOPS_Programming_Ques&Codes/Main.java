class Parent {
    public void print(Object obj) {
        System.out.println(obj);
    }
}

class Child extends Parent {
    @Override
    public void println(String str) {
        System.out.println(str);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        // This will automatically convert the String "Hello, world!" to an Object.
        child.print("Hello, world!");
    }
}