import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int e;
        double s = 0;
        int n = 1;
        double a, b;

        a = 1 / 2;
        b = 1 / 3;


        e = scanner.nextInt();

        while (a + b > e) {
            s = s + a + b;
            a /= 2;
            b /= 3;
        }

        System.out.println(s);

    }
}
