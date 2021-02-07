import java.util.Arrays;
import java.util.Scanner;

public class Car {

    private final Wheel[] wheels;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuel_level;

    public Car(Wheel[] wheels, Engine engine, String brand, double consumption, double fuel_level) {
        this.wheels = wheels;
        this.engine = engine;
        this.brand = brand;
        this.consumption = consumption;
        this.fuel_level = fuel_level;
    }

    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                ", consumption=" + consumption +
                ", fuel_level=" + fuel_level +
                '}';
    }

    public static Car get(Scanner scanner) {
        Car car = new Car(new Wheel[4], new Engine(0, 0), null, 0, 0);

        System.out.print("Brand ");
        car.brand = scanner.nextLine();

        System.out.print("Consumption ");
        car.consumption = scanner.nextDouble();

        System.out.print("Fuel level ");
        car.fuel_level = scanner.nextDouble();

        System.out.print("Wheels");
        for (int i = 0; i < 4; i++) {
            System.out.print("Wheel" + (i + 1));
            car.wheels[i] = Wheel.get(scanner);
        }

        System.out.print("Engine ");
        car.engine = Engine.get(scanner);

        return car;
    }

    public void move() {
        if (fuel_level <= 0) {
            System.out.println("Can't move because of fuel level");
        }

        for (int i = 1; i < 4; i++) {
            if (wheels[i].getDiameter() != wheels[i - 1].getDiameter()) {
                System.out.println("Different diameters");
            }
        }

        double distance = fuel_level / consumption;
        System.out.println("Distance " + distance);

        fuel_level = 0;
    }

    public void add_fuel(double value) {
        fuel_level += value;
    }

    public void change_wheels(Scanner scanner) {
        System.out.print("Number of a wheel 1-4");
        wheels[scanner.nextInt()] = Wheel.get(scanner);
    }

}
