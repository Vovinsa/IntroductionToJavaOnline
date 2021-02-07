import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int z;

        x = scanner.nextInt();

        if(x <= 3) {
            z = x * x - 3 * x + 9;
        } else {
            z = 1 / (x * x * x + 6);
        }

        System.out.println(z);

    }
}
