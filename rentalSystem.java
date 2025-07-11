import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    int seatingCapacity;

    Car(String brand, int speed, int numberOfDoors, int seatingCapacity) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
        this.seatingCapacity = seatingCapacity;
    }

    void showCarDetails() {
        showDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Bike extends Vehicle {
    boolean hasGears;

    Bike(String brand, int speed, boolean hasGears) {
        super(brand, speed);
        this.hasGears = hasGears;
    }

    void showBikeDetails() {
        showDetails();
        System.out.println("Has Gears: " + (hasGears ? "Yes" : "No"));
    }
}

class Truck extends Vehicle {
    double capacity;

    Truck(String brand, int speed, double capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }

    void showTruckDetails() {
        showDetails();
        System.out.println("Capacity: " + capacity + " tons");
    }
}

public class rentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("Toyota", 180, 4, 5);
        Bike bike = new Bike("Yamaha", 120, true);
        Truck truck = new Truck("Volvo", 100, 15.5);

        car.start();
        car.showCarDetails();

        System.out.println();

        bike.start();
        bike.showBikeDetails();

        System.out.println();

        truck.start();
        truck.showTruckDetails();

        scanner.close();
    }
}
