import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        
        k = scanner.nextInt();

        for (int num: arr) {
            if (num % k == 0) {
                s += num;
            }
        }

        System.out.println(s);

    }
}
