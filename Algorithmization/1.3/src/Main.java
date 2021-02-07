public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, -1, -4, -5, 4, 6, -1, 0, 4};
        int zero = 0, minus = 0, plus = 0;

        for (int i: arr) {
            if (i < 0) minus++;
            else if (i == 0) zero++;
            else plus++;
        }

        System.out.println(zero + "\n" + minus + "\n" + plus);

    }
}
