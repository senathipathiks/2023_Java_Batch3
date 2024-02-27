package Day4.Tasks;
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class TwoWheeler extends Vehicle {
    void balance() {
        System.out.println("Balancing on two wheels...");
    }
}

class FourWheeler extends Vehicle {
    void drive() {
        System.out.println("Driving on four wheels...");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.start();
        bike.balance();
        bike.stop();

        System.out.println();

        FourWheeler car = new FourWheeler();
        car.start();
        car.drive();
        car.stop();
    }
}

