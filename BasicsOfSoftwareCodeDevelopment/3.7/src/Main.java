import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m;
        int n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println(i + ":");

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(j);
                }
            }

            System.out.println("----------");
        }

    }
}
