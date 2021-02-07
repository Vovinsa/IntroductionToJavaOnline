public class Main {
    public static void main(String[] args) {

        String str = "asasasa. aksjak. ajksmkasm? sjcjncsjncs! sdsd.  ";
        int count = 0;

        for (char c: str.toCharArray()) {
            if (c == '.' || c == '?' || c == '!') {
                count++;
            }
        }

        System.out.println(count);

    }
}
