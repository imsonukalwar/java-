
    // Engine class (cannot exist without Car)
class Engine {
    void start() {
        System.out.println("Engine starts...");
    }

    void stop() {
        System.out.println("Engine stops...");
    }
}

// Car HAS-A Engine → Composition
class Car {
    private Engine engine;  // Composition relationship

    Car() {
        // Engine is created inside Car (strong ownership)
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving...");
    }

    void stopCar() {
        engine.stop();
        System.out.println("Car has stopped.");
    }
}

public class composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.stopCar();

        // Engine cannot be used independently outside Car
        // Engine e = new Engine();   // (not meaningful in Composition)
    }
}