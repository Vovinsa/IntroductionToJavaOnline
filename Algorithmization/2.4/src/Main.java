import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int k1 = 1;
        int[][] arr = new int[n][n];
        int k2 = n;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = k1;
                    k1++;
                }
                k1 = 1;
            } else {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = k2;
                    k2--;
                }
                k2 = n;
            }
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
