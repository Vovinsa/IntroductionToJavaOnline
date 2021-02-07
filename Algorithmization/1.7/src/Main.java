public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 34, 23, 545, 67, 34, 54 , 232, 4545, 4, 53, 5432, 54};
        int maxSum = arr[0] + arr[arr.length - 1];

        for (int i = 0; i < arr.length / 2; i++) {
            var maxSum1 = arr[i] + arr[arr.length - i - 1];
            if (maxSum1 > maxSum) {
                maxSum = maxSum1;
            }
        }

        System.out.println(maxSum);

    }
}
