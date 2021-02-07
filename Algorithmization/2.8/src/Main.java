import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int buf;
            buf = arr[i][a - 1];
            arr[i][a - 1] = arr[i][b - 1];
            arr[i][b - 1] = buf;
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
