import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i : arr) {
            if (i == min) {
                count++;
            }
        }

        int[] arr2 = new int[size - count];
        int j = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != min) {
                arr2[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

}
