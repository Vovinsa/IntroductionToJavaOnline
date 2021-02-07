import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r;
        double x;

        r = scanner.nextDouble();

        x = (r * 1000) % 1000 + (int)r / 1000.0;

        System.out.println(x);

    }
}
