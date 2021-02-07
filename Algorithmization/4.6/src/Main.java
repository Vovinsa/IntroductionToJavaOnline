public class Main {
    public static void main(String[] args) {

        if (checkSimple(7, 47, 61)){
            System.out.println("Simple");
        } else {
            System.out.println("Not simple");
        }

    }

    public static boolean checkSimple(int one, int two, int three){
        return checkSimple(one) & checkSimple(two) & checkSimple(three);

    }

    public static boolean checkSimple(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
