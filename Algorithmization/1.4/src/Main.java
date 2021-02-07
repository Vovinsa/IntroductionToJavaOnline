import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 4, 5, 6, 7, 9, 0};
        int max_index = 0, min_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max_index]) max_index = i;
            else if (arr[i] < arr[min_index]) min_index = i;
        }

        int x = arr[max_index];

        arr[max_index] = arr[min_index];
        arr[max_index] = x;

        for (int i: arr) {
            System.out.println(i);
        }

    }
}
