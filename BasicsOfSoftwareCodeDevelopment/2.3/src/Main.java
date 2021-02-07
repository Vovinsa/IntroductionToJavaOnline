import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1, x2, x3;
        int y1, y2, y3;

        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y1 = scanner.nextInt();
        y2 = scanner.nextInt();
        y3 = scanner.nextInt();

        if((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Лежат на одной прямой");
        }

    }
}
