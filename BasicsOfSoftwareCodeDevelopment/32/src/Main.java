import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int h;
        int x;

        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        while (a <= b) {
            if (a <= 2) {
                System.out.println(-a);
            } else {
                System.out.println(a);
            }

            a += h;
        }

    }
}
