import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = randomFill(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum  " + sumArrEl(arr, 5));
    }

    public static int[] randomFill(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static int sumArrEl(int [] arr, int from){
        int sumEl = 0;
        int to = from + 3;

        for (int i = from; i < to; i++) {
            sumEl += arr[i];
        }

        return sumEl;
    }

}
