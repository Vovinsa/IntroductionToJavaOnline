import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[][] arr = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (float) Math.sin((i - j) / (float) n);
            }
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
