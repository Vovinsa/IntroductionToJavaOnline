import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = 5;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = i + 1;
            arr2[i] = i + 2;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));

    }
}
