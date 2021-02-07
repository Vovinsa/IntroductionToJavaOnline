public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {6, 3, 5},
                {3, 4, 5},
                {9, 6, 3}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j += 2) {
                if (arr[0][j] > arr[arr.length - 1][j]) {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
