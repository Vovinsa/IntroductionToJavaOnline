import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, x, y, z;

        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if(x <= a && y <= b || y <= a && x <= b || x <= a && z <= y || z <= a && x <= b || z <= a && y <= b || y <= a && z <= b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
