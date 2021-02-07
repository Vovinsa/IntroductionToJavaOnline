import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int index;
            index = Arrays.binarySearch(arr, 0, i, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(arr, index, arr, index + 1, i - index);
            arr[index] = newElement;
        }


        System.out.println(Arrays.toString(arr));

    }
}
