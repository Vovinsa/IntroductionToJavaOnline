import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 1, 3, 5, 3, 2, 5, 1, 9, 10};
        int j = 0;

        for (int i = 1; i < arr.length; i += 2) {
            arr[j] = arr[i];
            j++;
        }

        arr = Arrays.copyOf(arr, arr.length / 2);

        System.out.println(Arrays.toString(arr));

    }
}
