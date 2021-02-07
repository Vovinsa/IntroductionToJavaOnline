import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int z;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        z = scanner.nextInt();

        for (int i : arr) {
            if (i > z) {
                n++;
                i = z;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(n);

    }
}
