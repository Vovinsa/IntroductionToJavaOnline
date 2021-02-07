import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        float[] arr = new float[30];
        int s = 0;
        boolean isPrime = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                s += arr[i];
            }
        }

        System.out.println(s);

    }
}
