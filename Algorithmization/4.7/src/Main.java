public class Main {
    public static void main(String[] args) {

        sumFact();

    }

    public static void sumFact(){
        long summ = 0;
        for (int i = 1; i <= 9; i+=2){
            summ += factorial(i);
            System.out.println("factorial " + i + " = " + factorial(i));
        }
        System.out.println("Sum " + summ);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
