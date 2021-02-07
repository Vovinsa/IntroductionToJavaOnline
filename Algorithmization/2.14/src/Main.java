import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[j][i] = 1;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
