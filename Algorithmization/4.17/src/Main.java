public class Main {
    public static void main(String[] args) {

        int num = 96;
        int count = 0;

        do {

            num = subtract(num, numSum(num));
            count++;

        } while (num > 0);

        System.out.println(count);

    }

    public static int numSum(int num) {
        int sum = 0;

        do {

            sum += num % 10;
            num /= 10;

        } while (num > 0);

        return sum;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
