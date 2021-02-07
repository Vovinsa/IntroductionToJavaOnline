import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int[] ints : matrix) {
            Arrays.sort(ints);
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            int x;
            boolean check = false;

            while (!check) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i][j - 1]) {
                        x = matrix[i][j];
                        matrix[i][j] = matrix[i][j - 1];
                        matrix[i][j - 1] = x;
                    }
                }
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] <= matrix[i][j - 1]) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
