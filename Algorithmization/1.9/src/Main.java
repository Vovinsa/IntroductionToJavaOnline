import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 8, 3, 3};
        int[] popular = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int k : arr) {
                if (arr[i] == k) {
                    popular[i]++;
                }
            }
        }

        int valRes = arr[0];
        int popRes = popular[0];

        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popRes) {
                popRes = popular[i];
                valRes = arr[i];
            }

            if (popRes == popular[i] && valRes == arr[i]) {
                valRes = arr[i];
            }
        }

        System.out.println(valRes);

    }
}
