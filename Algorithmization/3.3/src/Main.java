import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 9, 10, 13, 17, 23, 57};

        for (int i = 0; i < arr.length; i++) {

            int pos = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }

            arr[pos] = arr[i];
            arr[i] = min;
        }

        System.out.println(Arrays.toString(arr));

    }
}
