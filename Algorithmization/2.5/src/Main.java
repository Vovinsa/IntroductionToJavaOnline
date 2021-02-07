import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int k1 = 1;
        int k2 = n;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < k2; j++) {
                arr[i][j] = k1;
            }
            k1++;
            k2--;
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
