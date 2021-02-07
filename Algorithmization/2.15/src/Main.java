import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int max = 0;
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 30);
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i > max) {
                    max = i;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
