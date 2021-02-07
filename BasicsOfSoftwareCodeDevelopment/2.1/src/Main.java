import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a + b < 180) {
            if (a + b == 90) {
                System.out.println("Прямоугольный");
            }
        } else {
            System.out.println("Не существует");
        }

    }
}
