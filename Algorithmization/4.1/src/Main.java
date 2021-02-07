import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        int min;
        int nod = 0;
        int nok;

        a = scanner.nextInt();
        b = scanner.nextInt();

        min = Math.min(a, b);

        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }

        nok = a * b / nod;

        System.out.println(nod);
        System.out.println(nok);

    }
}
