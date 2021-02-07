import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 4696;
        int num = a;
        int n = 0;

        while (a > 0) {
            a /= 10;
            n++;
        }

        int[] arr = new int[n];
        int i = n - 1;

        while (num > 0) {
            arr[i] = num % 10;
            i--;
            num /= 10;
        }

        System.out.println(Arrays.toString(arr));

    }
}
