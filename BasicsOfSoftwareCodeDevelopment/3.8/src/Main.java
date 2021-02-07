import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        num(a);
        System.out.println("---------");
        num(b);

    }

    public static void num(int a) {

        while (a > 0) {
            System.out.println(a % 10);
            a /= 10;
        }

    }
}
