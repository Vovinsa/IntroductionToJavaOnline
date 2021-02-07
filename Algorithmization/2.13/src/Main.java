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

        boolean check = false;
        int x;

        while (!check) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < matrix[i - 1][j]) {
                        x = matrix[i][j];
                        matrix[i][j] = matrix[i - 1][j];
                        matrix[i - 1][j] = x;
                    }
                }
            }
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] >= matrix[i - 1][j]) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
                if (!check) {
                    break;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        check = false;

        while (!check) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i - 1][j]) {
                        x = matrix[i][j];
                        matrix[i][j] = matrix[i - 1][j];
                        matrix[i - 1][j] = x;
                    }
                }
            }
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] <= matrix[i - 1][j]) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }
                if (!check) {
                    break;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
