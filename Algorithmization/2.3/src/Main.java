import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size1 = 10;
        int size2 = 8;
        int[][] matrix = new int[size1][size2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

        Scanner scanner = new Scanner(System.in);
        int k, p;

        System.out.println("Введите строку");
        k = scanner.nextInt();
        System.out.println("Введите столбец");
        p = scanner.nextInt();

        for (int i = 0; i < matrix[p].length; i++) {
            System.out.println(matrix[p][i] + " ");
        }

        System.out.println("\n");

        for (int[] ints : matrix) {
            System.out.println(ints[k] + " ");
        }
    }
}
