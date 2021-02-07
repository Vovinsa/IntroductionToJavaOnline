import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        boolean check;

        x = scanner.nextInt();
        y = scanner.nextInt();

        check = x >= -4 && x <= 4 && y <= 4 && y >= -3;

        System.out.println(check);

    }
}
