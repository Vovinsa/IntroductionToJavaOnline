import java.util.Scanner;

public class Engine {

    private int number;
    private int power;

    public Engine(int number, int power) {
        this.number = number;
        this.power = power;
    }

    public String toString() {
        return "Engine{" +
                "number=" + number +
                ", power=" + power +
                '}';
    }

    public static Engine get(Scanner scanner) {
        Engine engine = new Engine(0, 0);

        System.out.print("Введи номер двигателя ");
        engine.number = scanner.nextInt();

        System.out.print("Введи мощность ");
        engine.power = scanner.nextInt();

        return engine;
    }

}
