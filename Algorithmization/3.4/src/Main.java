import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr  = {1, 2, 3, 4, 5, 6};
        boolean isSorted = false;
        int n = 0;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    n++;

                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(n);

    }
}
