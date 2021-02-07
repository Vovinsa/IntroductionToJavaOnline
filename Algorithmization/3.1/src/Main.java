import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[9];

        int k = 2;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * (-10));
        }

        System.out.println(Arrays.toString(arr2));

        int[] sumArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, sumArr, 0, k);
        System.arraycopy(arr2, 0, sumArr, k, arr2.length);
        System.arraycopy(arr1, k, sumArr, k + arr2.length, arr1.length - k);

        System.out.println(Arrays.toString(sumArr));

    }
}
