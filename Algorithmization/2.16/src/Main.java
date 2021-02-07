import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        int row = 0;
        int column = n / 2;

        while (num < n * n) {
            arr[row][column] = num;
            num++;
            row--;
            column++;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (row == 0 && column == n - 1) {
                column = n - 1;
                row++;
            } else if (arr[row][column] != 0) {
                row++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
