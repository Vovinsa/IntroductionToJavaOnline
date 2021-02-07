import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        searchNum(10);
    }

    public static void searchNum(int size) {
        int[] arr = randomFill(size);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]){
                System.out.println("PreMaxNumber = " + arr[i - 1]);
                break;
            }
        }
    }

    public static int[] randomFill(int size) {
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 20);
        }
        return arrays;
    }

}
