import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int x;
            if (arr[i] > arr[i + 1]) {
                x = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = x;
                if (i > 0) {
                    i -= 2;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
