import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        int nod = 0;
        int min;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        min = Math.min(Math.min(a, b), Math.min(c, d));

        for (int i = min; i >= 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                nod = i;
                break;
            }
        }

        System.out.println(nod);

    }
}
