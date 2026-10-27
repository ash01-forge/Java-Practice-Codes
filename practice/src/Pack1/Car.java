package Pack1;

class Vehicle {
    protected String brand;
    protected int serial;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(int serial) {
        this.serial = serial;
    }

    public Vehicle(String brand, int serial) {
        this(brand);
        this.serial = serial;
    }

    public boolean honk() {
        System.out.println("Tuut, tuut!");
        return true;
    }
}

public class Car extends Vehicle {
    private String modelName;

    // ✅ Constructor of Car class invoking parent constructor
    public Car(String brand, int serial, String modelName) {
        super(brand, serial);      // invoke parent constructor
        this.modelName = modelName;
    }

    // ✅ Override honk() method
    @Override
    public boolean honk() {
        System.out.println("A vehicle horn is a sound-making device.");
        // Call parent class honk()
        super.honk();
        return true;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 20245, "Integra");
        car1.honk();
        System.out.println(car1.brand + " " + car1.modelName);
    }
}

