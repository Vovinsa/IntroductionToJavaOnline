import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size1 = 5;
        int size2 = 6;
        int[][] matrix = new int[size1][size2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        int[] sum = new int[size1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[i] += matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(sum));

        int colMax = 0;
        int max = 0;

        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
                colMax = i + 1;
            }
        }

        System.out.println("Column with max sum: " + colMax);

    }
}
