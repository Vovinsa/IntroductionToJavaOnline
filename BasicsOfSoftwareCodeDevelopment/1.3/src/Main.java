import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double z;

        x = scanner.nextDouble();
        y = scanner.nextDouble();

       z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.println(z);

    }
}

