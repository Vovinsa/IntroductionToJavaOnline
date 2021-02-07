import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        int[] arr = armstrong(999999999);
        for (int k : arr)
            System.out.print(k + " ");
    }

    public static int[] armstrong(long K) {
        int length = 1;
        int num = 10;
        int r;
        int s;
        double k;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < K; i++) {
            if (i == num) {
                length++;
                num *= 10;
            }
            s = i;
            k = 0;
            while (s > 0) {
                r = s % 10;
                k += Math.pow(r, length);
                if (k > i) break;
                s = s / 10;
            }
            if ((int) k == i)
                list.add(i);
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int n : list) {
            result[i] = n;
            i++;
        }

        return result;
    }
}
