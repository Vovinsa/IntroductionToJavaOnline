public class Main {
    public static void main(String[] args) {

        int num1 = 1357;
        int num2 = 975391;

        int sum = sum(num1, num2);
        int count = count(String.valueOf(sum));

        System.out.println(sum);
        System.out.println(count);

    }

    public static boolean check(String num) {
        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (digit % 2 == 0) {
                System.out.println("Есть нечетные цифры");
                return false;
            }
        }

        return true;
    }

    public static int sum(int num1, int num2) {
        if (check(String.valueOf(num1)) && check(String.valueOf(num2))) {
            return num1 + num2;
        }
        return 0;
    }

    public static int count(String sum) {
        int count = 0;
        for (int i = 0; i < sum.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(sum.charAt(i)));
            if (digit % 2 == 0) {
                count += digit;
            }
        }

        return count;
    }

}
