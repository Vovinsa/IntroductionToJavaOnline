public class Main {
    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
