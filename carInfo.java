class Vehicle {
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void displayInfo() {
        System.out.println("This is a car. Cars are comfortable and fast.");
    }
}

public class carInfo {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle();
        genericVehicle.displayInfo();

        Car car = new Car();
        car.displayInfo();
    }
}
