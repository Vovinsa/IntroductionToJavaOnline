import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. */

        Scanner scanner = new Scanner(System.in);

        Car car = Car.get(scanner);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выход\n" +
                            "1. ехать\n" +
                            "2. заправляться\n" +
                            "3. менять колесо\n" +
                            "4. вывести информацию об авто (марку тоже)\n" +
                            ": "
            );

            int choice = scanner.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1 -> car.move();
                case 2 -> car.add_fuel(scanner.nextDouble());
                case 3 -> car.change_wheels(scanner);
                case 4 -> System.out.println(car.toString());
            }
        }

    }
}
