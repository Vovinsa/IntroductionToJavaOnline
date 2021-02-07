import java.util.Scanner;

public class Wheel {

    private enum Type {Winter, Summer}

    private int diameter;
    private String brand;
    private Type type;

    public Wheel(int diameter, String brand, Type type) {
        this.diameter = diameter;
        this.brand = brand;
        this.type = type;
    }

    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                '}';
    }

    public static Wheel get(Scanner scanner) {
        Wheel wheel = new Wheel(0, null, null);

        System.out.print("Введи бренд ");
        wheel.brand = scanner.nextLine();

        System.out.print("Diameter ");
        wheel.diameter = scanner.nextInt();

        System.out.println("Type 1 - Winter, 2 - Summer");
        if (scanner.nextInt() == 1) {
            wheel.type = Type.Winter;
        } else if (scanner.nextInt() == 2) {
            wheel.type = Type.Summer;
        }

        return wheel;
    }

    public int getDiameter() {
        return diameter;
    }
}
