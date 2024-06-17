abstract class Vehicle {
    private String model;
    private int year;
    private double price;

    public Vehicle(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public abstract void start();

    public abstract void stop();

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

class Car extends Vehicle {
    public Car(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car engine.");
    }

    public void drive() {
        System.out.println("Driving the car.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle engine.");
    }

    public void ride() {
        System.out.println("Riding the motorcycle.");
    }
}

public class VehicleAbstract {
    public static void main(String[] args) {
        Car car = new Car("Verna", 1999, 85000.0);
        Motorcycle motorcycle = new Motorcycle("R15", 2000, 120000.0);

        System.out.println("Car Details:");
        car.displayInfo();
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.ride();
        motorcycle.stop();
    }
}
