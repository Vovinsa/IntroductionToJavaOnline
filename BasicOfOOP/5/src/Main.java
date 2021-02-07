import sweets.Cake;
import sweets.Chocolate;
import sweets.Cookie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Box box;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter box size:\n1 - Big\n2 - Medium\n 3 - Small");

        while (true) {
            if (scanner.nextInt() == 1) {
                box = new Box(Box.BoxType.BIG);
                break;
            } else if (scanner.nextInt() == 2) {
                box = new Box(Box.BoxType.MEDIUM);
                break;
            } else if (scanner.nextInt() == 3) {
                box = new Box(Box.BoxType.SMALL);
                break;
            } else {
                System.out.println("Enter another choice");
            }
        }

        do {
            System.out.println("The Box size is " + box.getBoxSize() +
                    "\n1 - add Chocolate\n2 - add Cookie\n3 - add Cake");
            int choose = scanner.nextInt();

            if (choose == 1) {
                System.out.println("Enter count: ");
                box.addSweet(new Chocolate(scanner.nextInt()));
            } else if (choose == 2) {
                System.out.println("Enter count: ");
                box.addSweet(new Cookie(scanner.nextInt()));
            } else if (choose == 3) {
                System.out.println("Enter count: ");
                box.addSweet(new Cake(scanner.nextInt()));
            } else {
                System.out.println("There is no such answer, enter another number...");
            }
        } while (box.check());

    }
}
