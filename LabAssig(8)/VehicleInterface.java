interface Vehicle {
    void start();

    void stop();

    void displayInfo();
}

class Car implements Vehicle {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car engine.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car price: " + price);
    }
}

class Motorcycle implements Vehicle {
    private String model;
    private int year;
    private double price;

    public Motorcycle(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle engine.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Model: " + model);
        System.out.println("Motorcycle Year: " + year);
        System.out.println("Bike price: " + price);
    }
}

public class VehicleInterface {
    public static void main(String[] args) {
        Car car = new Car("Verna", 1999, 85000.0);
        Motorcycle motorcycle = new Motorcycle("R15", 2000, 120000.0);

        System.out.println("Car Information:");
        car.displayInfo();
        car.start();
        car.stop();

        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();
    }
}
