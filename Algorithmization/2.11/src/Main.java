import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[10][20];
        int n = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = (int) (Math.random() * 16);
                if (arr[i][j] == 5) {
                    n++;
                }
            }
            if (n >= 3) {
                System.out.println(i + 1);
            }
            n = 0;
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
