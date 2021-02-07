import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int a = 0;

        x = scanner.nextInt();

        for(int i = 1; i <= x; i++) {
            a += i;
        }

        System.out.println(a);

    }
}
