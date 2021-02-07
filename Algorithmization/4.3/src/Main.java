import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);
        float s;

        a = scanner.nextInt();

        s = (float) (a * a * Math.sqrt(3) * 1.5);

        System.out.println(s);

    }
}
