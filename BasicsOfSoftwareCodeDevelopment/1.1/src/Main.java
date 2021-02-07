import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double z;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        z = ((a - 3) * b / 2) - c;

        System.out.println(z);

    }
}
