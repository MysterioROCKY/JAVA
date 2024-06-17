class Box {
    private double length;
    private double breadth;
    private double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setDimensions(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double calculateArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double calculateVolume() {
        return length * breadth * height;
    }
}

class Box3D extends Box {
    public Box3D(double length, double breadth, double height) {
        super(length, breadth, height);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box3D box3D = new Box3D(3.0, 4.0, 5.0);

        System.out.println("Dimensions of Box 3D: " + box3D.calculateArea() + " (Area) and " + box3D.calculateVolume() + " (Volume)");

        box3D.setDimensions(4.0, 6.0, 7.0);
        System.out.println("New dimensions of Box 3D: " + box3D.calculateArea() + " (Area) and " + box3D.calculateVolume() + " (Volume)");
    }
}
