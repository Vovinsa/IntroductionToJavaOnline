import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int k1 = n;
        int k2 = 0;

        for (int i = 0; i < n / 2; i++) {
            for (int j = k2; j < k1; j++) {
                arr[i][j] = 1;
            }
            k2++;
            k1--;
        }


        for (int i = n / 2 - 1; i < n; i++) {
            for (int j = k2; j < k1; j++) {
                arr[i][j] = 1;
            }
            k2--;
            k1++;
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
