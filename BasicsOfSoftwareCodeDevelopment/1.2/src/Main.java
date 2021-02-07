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

            z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

            System.out.println(z);

        }
    }
